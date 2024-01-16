package com.example.article;

import com.example.article.config.AppConfigData;
import org.springframework.stereotype.Component;

// 가장 기초적인 Bean Annotation
@Component // Component: 가장 기본적인 구성요소란 뜻
public class AppComponent {
  private final AppConfigData configData;
  public AppComponent(AppConfigData configData) {
    this.configData = configData;
  }
}
