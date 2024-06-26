package com.betrybe.weatherreport;

import com.betrybe.weatherreport.interfaces.WeatherClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherClientClass implements WeatherClient {

  @Bean
  public String getWeather(String city) {
    return "oi";
  }
}
