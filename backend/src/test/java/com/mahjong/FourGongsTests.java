package com.mahjong;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahjong.controller.FaanCalculator;
import com.mahjong.dto.MahjongRequest;
import com.mahjong.dto.MahjongResponse;
import com.mahjong.model.FaanType;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;

public class FourGongsTests {

  @Test
  public void testFourGongsWinVariation1() throws Exception {
    // Create a sample request
    String configFile = "./configs/four_gongs_win_v1.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertEquals(response.getFaan(), 13);
    assertTrue(response.hasFaanType(FaanType.FOUR_GONGS));
  }

  @Test
  public void testFourGongsWinVariation2() throws Exception {
    // Create a sample request
    String configFile = "./configs/four_gongs_win_v2.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertEquals(response.getFaan(), 13);
    assertTrue(response.hasFaanType(FaanType.FOUR_GONGS));
  }

  @Test
  public void testFourGongsWinVariation3() throws Exception {
    // Create a sample request
    String configFile = "./configs/four_gongs_win_v3.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertEquals(response.getFaan(), 13);
    assertTrue(response.hasFaanType(FaanType.FOUR_GONGS));
  }

  @Test
  public void testFourGongsFailNoPair() throws Exception {
    // Create a sample request
    String configFile = "./configs/four_gongs_fail_noPair.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertEquals(response.getFaan(), 0);
    assertTrue(response.hasFaanType(FaanType.NO_FAAN));
  }

}
