package com.betrybe.weatherreport;

import com.betrybe.weatherreport.interfaces.WeatherClient;
import com.betrybe.weatherreport.interfaces.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceClass implements WeatherService {

  WeatherClient weatherClient;

  @Autowired
  public WeatherServiceClass(WeatherClient client) {
    weatherClient = client;
  }

  @Override
  public String getWeatherReport(String city) {
    return "O clima é: %s".formatted(weatherClient.getWeather(city));
  }
}
