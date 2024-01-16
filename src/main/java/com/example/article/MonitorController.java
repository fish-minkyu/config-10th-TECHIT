package com.example.article;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// 개발 환경(dev)에서만 사용하고 싶은 Controller라고 하자
// Profile Annotation
// 특정 Profile에서만 Bean으로 등록하고 싶을 때 사용할 수 있는 어노테이션
@Profile("dev")
public class MonitorController {
  @GetMapping("/monitor")
  @ResponseBody
  public String test() {
    return "monitor";
  }
}
