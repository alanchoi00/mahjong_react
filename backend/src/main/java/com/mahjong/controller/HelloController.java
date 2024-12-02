package com.mahjong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String hello(@RequestHeader(value = "Custom-Header", required = false) String customHeader) {
    if (customHeader == null) {
      return "Default greeting: Hello World!";
    }

    switch (customHeader.toLowerCase()) {
      case "mahjong":
        return "Hello Mahjong!";
      case "spring":
        return "Hello Spring Framework!";
      default:
        return "Unknown header value: " + customHeader;
    }
  }
}
