package com.sp01.weatther_app.service;

import com.sp01.weatther_app.dto.WeatherDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

@Service
public class WeatherService {
    @Value("${weather.api.key}")
    private String apiKey;


    public WeatherDTO getWeather(String city) throws Exception {


        String url =
                "https://api.openweathermap.org/data/2.5/weather?q="
                        + city
                        + "&appid="
                        + apiKey
                        + "&units=metric";


        RestTemplate restTemplate = new RestTemplate();
        String response=restTemplate.getForObject(url,String.class);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root =mapper.readTree(response);


        String cityName =root.get("name").asText();
        double temprature=root.get("main").get("temp").asDouble();
        String description =
                root.get("weather")
                        .get(0)
                        .get("description")
                        .asText();
        int humidity = root.get("main").get("humidity").asInt();
        double windspeed = root.get("wind").get("speed").asDouble();
        String country = root.get("sys").get("country").asString();
        WeatherDTO dto = new WeatherDTO();
        dto.setCity(cityName);
        dto.setTemperature(temprature);
        dto.setDescription(description);
        dto.setHumidity(humidity);
        dto.setWindSpeed(windspeed);
        dto.setCountry(country);



        return dto;
    }

}
