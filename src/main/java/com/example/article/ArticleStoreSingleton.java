package com.example.article;

import com.example.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

// Singleton Pattern
// : 프로그램 전체에서 클래스의 구현체를 하나만 만들고 싶을 때 사용하는 패턴
public class ArticleStoreSingleton {
  // ArticleStoreSingleton의 목적: ArticleDto 객체를 담기 위한 용도
  private final List<ArticleDto> articleDtoList = new ArrayList<>();
  private static ArticleStoreSingleton instance;

  // 생성자가 private으로 생성하면 다른 곳에서 new를 통해 해당 클래스를 생성할 수 없다.
  private ArticleStoreSingleton() {}

  // instance 필드가 비어있으면 생성하는 메소드
  // 이미 생성이 되어 있으면 가지고 온다.
  public static ArticleStoreSingleton getInstance() {
    if (instance == null)
      // private이어도 해당 클래스 안에 있으므로 호출이 가능하다.
      instance = new ArticleStoreSingleton();
    return instance;
  }
}
