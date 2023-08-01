package com.example.crudbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class HelloController {

    // 서버에서 객체 넘기면 json, json 파싱해서 프론트에서 찍을 수 있게끔 구현하기
    // 일단은 강의를 다 듣고(MVC 싹다), 회원가입 - 가입하고 단순히 저장만!, 회원여부 체크

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring!";
    }
}