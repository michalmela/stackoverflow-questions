package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import java.util.List;

@Configuration
@PropertySource(value = "classpath:example.properties")
public class RegularConfig
{
  @Value("${names}")
  private List<String> names;

  public List<String> getNames()
  {
    return names;
  }
}
