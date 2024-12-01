package com.mahjong.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahjong.dto.MahjongRequest;
import com.mahjong.dto.MahjongResponse;

import org.springframework.web.bind.annotation.*;

@RestController
public class FaanCalculator {

  @PostMapping("/test")
  public String testResponse(@RequestBody MahjongRequest request) {
    // Convert request object to JSON string
    ObjectMapper objectMapper = new ObjectMapper();
    String requestJson;

    try {
      requestJson = objectMapper.writeValueAsString(request);
    } catch (JsonProcessingException e) {
      return "Error processing request: " + e.getMessage();
    }

    // Print the request attributes
    System.out.println("Request Attributes: " + requestJson);

    // Return the JSON representation of the request
    return requestJson;
  }

  @PostMapping("/calculate")
  public MahjongResponse calculate(@RequestBody MahjongRequest request) {
    MahjongResponse response = new MahjongResponse();
    return response;
  }
}
