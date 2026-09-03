package com.sp01.weatther_app.controller;

import com.sp01.weatther_app.dto.WeatherDTO;
import com.sp01.weatther_app.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{city}")
    public WeatherDTO getWeather(@PathVariable String city) throws Exception {
        return weatherService.getWeather(city);
    }
}
