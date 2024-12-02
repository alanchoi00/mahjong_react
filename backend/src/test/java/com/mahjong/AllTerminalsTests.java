package com.mahjong;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahjong.controller.FaanCalculator;
import com.mahjong.dto.MahjongRequest;
import com.mahjong.dto.MahjongResponse;
import com.mahjong.model.FaanType;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;

public class AllTerminalsTests {

  @Test
  public void testAllTerminalsWinPungVariation1() throws Exception {
    // Create a sample request
    String configFile = "./configs/all_terminals_win_pung_v1.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertEquals(response.getFaan(), 10);
    assertTrue(response.hasFaanType(FaanType.ALL_TERMINALS));
  }

  @Test
  public void testAllTerminalsWinPungVariation2() throws Exception {
    // Create a sample request
    String configFile = "./configs/all_terminals_win_pung_v2.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertEquals(response.getFaan(), 10);
    assertTrue(response.hasFaanType(FaanType.ALL_TERMINALS));
  }

  @Test
  public void testAllTerminalsWinPungVariation3() throws Exception {
    // Create a sample request
    String configFile = "./configs/all_terminals_win_pung_v3.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertEquals(response.getFaan(), 10);
    assertTrue(response.hasFaanType(FaanType.ALL_TERMINALS));
  }

  @Test
  public void testAllTerminalsWinGongVariation1() throws Exception {
    // Create a sample request
    String configFile = "./configs/all_terminals_win_gong_v1.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertEquals(response.getFaan(), 10);
    assertTrue(response.hasFaanType(FaanType.ALL_TERMINALS));
  }

  @Test
  public void testAllTerminalsWinGongVariation2() throws Exception {
    // Create a sample request
    String configFile = "./configs/all_terminals_win_gong_v2.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertEquals(response.getFaan(), 10);
    assertTrue(response.hasFaanType(FaanType.ALL_TERMINALS));
  }

  @Test
  public void testAllTerminalsWinConcealed() throws Exception {
    // Create a sample request
    String configFile = "./configs/all_terminals_win_concealed.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertEquals(response.getFaan(), 10);
    assertTrue(response.hasFaanType(FaanType.ALL_TERMINALS));
  }

  @Test
  public void testAllTerminalsFailNoPairVariation1() throws Exception {
    // Create a sample request
    String configFile = "./configs/all_terminals_fail_noPair_v1.json";
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

  @Test
  public void testAllTerminalsFailNoPairVariation2() throws Exception {
    // Create a sample request
    String configFile = "./configs/all_terminals_fail_noPair_v2.json";
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

  @Test
  public void testAllTerminalsFailMissingTileVariation1() throws Exception {
    // Create a sample request
    String configFile = "./configs/all_terminals_fail_missingTile_v1.json";
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

  @Test
  public void testAllTerminalsFailMissingTileVariation2() throws Exception {
    // Create a sample request
    String configFile = "./configs/all_terminals_fail_missingTile_v2.json";
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
