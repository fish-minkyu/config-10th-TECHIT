package com.example.article.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 설정
@Configuration
public class AppConfig {
  @Bean
  // : 메서드의 결과로 반환되는 객체를 Bean 객체로 활용해주세요.
  // Bean 어노테이션이 없다면 configData 메소드가 호출될 때마다 AppConfigData()가 새로 생성되므로
  // 낭비라고 느껴지는 것을 방지한다.
  public AppConfigData configData() {
    return new AppConfigData("url", "apiKey");
  }
}
