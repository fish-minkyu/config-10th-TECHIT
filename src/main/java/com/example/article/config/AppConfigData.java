package com.example.article.config;

import lombok.Getter;

// 설정 값을 모아두는 클래스
@Getter // 이 클래스에 있는 데이터를 쓰기 위해 Getter 사용
public class AppConfigData {
  private String connectionUrl;
  private String apiKey;

  public AppConfigData(String connectionUrl, String apiKey) {
    this.connectionUrl = connectionUrl;
    this.apiKey = apiKey;
  }
}
