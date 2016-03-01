package org.example;

import org.apache.camel.spring.javaconfig.CamelConfiguration;
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
public class BaseConfig
{
  @Bean
  public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
  {
    return new PropertySourcesPlaceholderConfigurer();
  }

  @Bean
  public ConversionService conversionService() {
      return new org.springframework.core.convert.support.DefaultConversionService();
  }
  
}
