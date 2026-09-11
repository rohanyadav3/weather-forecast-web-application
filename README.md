# Weather Forecast API

This is a Weather Forecast application that I developed using Java and Spring Boot.

The application takes a city name and shows weather information such as temperature, weather description, humidity and wind speed.

## Technologies Used

* Java
* Spring Boot
* REST API
* RestTemplate
* Jackson
* OpenWeather API
* Maven
* HTML
* CSS
* JavaScript

## Features

* Search weather by city name
* Shows current temperature
* Shows weather description
* Shows humidity
* Shows wind speed
* Shows country
* Uses OpenWeather API
* REST API integration
* Simple web interface

## Project Structure

```text id="7k1q83"
Weather-Forecast
│
├── src
│   └── main
│       └── java
│
├── pom.xml
└── README.md
```

## How to Run

1. Clone the project.
2. Open the project in IntelliJ IDEA.
3. Add your OpenWeather API key in `application.properties`.
4. Run the Spring Boot application.
5. Open the application in your browser.

The application runs on:

```text id="5j0z5c"
http://localhost:8080
```

## API

The application uses the OpenWeather API to get weather data.

Example:

```text id="q3b2j1"
Enter a city → Delhi
```

The application then displays the weather information for Delhi.

## What I Learned

While making this project, I learned how to:

* Create REST APIs using Spring Boot
* Call an external API from a Spring Boot application
* Work with JSON data
* Use `RestTemplate`
* Convert API data into Java objects
* Create a service layer
* Connect frontend with backend
* Handle API errors

## Author

Rohan
