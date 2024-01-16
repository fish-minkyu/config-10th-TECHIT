package com.example.article;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger; // 인터페이스
// Simple Logging Facade For Java: Java를 위한 간단한 로깅 파사드
// 역할: 서로 다른 로깅 라이브러리를 사용해도 똑같은 방법으로 사용할 수 있게 해준다.
// 파사드: 디자인 패턴의 일종
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// log를 자동으로 만들어주는 어노테이션
// @Slf4j
@Controller
public class RootController {
    private static final Logger log = LoggerFactory.getLogger(RootController.class);


    @GetMapping
    public String root() {
        return "redirect:/article";
    }

    @GetMapping("/log") // println 대신 사용
    public String logTest() {
        log.trace("TRACE message");
        log.debug("DEBUG message");
        log.info("INFO message");
        log.warn("WARN message");
        log.error("ERROR message");
        return "log";
    }
}
