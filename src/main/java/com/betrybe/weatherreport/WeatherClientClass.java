package com.betrybe.weatherreport;

import com.betrybe.weatherreport.interfaces.WeatherClient;
import org.springframework.stereotype.Component;

/**
 * The type Weather client class.
 */
@Component
public class WeatherClientClass implements WeatherClient {

  public String getWeather(String city) {
    return "oi";
  }
}
