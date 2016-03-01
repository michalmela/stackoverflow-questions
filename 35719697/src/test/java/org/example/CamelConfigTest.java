package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;

import static org.junit.Assert.*;

@ContextConfiguration(classes = {BaseConfig.class, CamelConfig.class}, loader = AnnotationConfigContextLoader.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class CamelConfigTest
{
  @Autowired
  private CamelConfig config;


  @Test
  public void testGetNames()
  {
    List<String> names = config.getNames();
    java.lang.System.out.println(names.get(0));
    assertNotNull(names);
    assertFalse(names.isEmpty());
    assertNotEquals(1, names.size());
  }
}
