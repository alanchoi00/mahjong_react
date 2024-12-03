package com.mahjong;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahjong.controller.FaanCalculator;
import com.mahjong.dto.MahjongRequest;
import com.mahjong.dto.MahjongResponse;
import com.mahjong.model.FaanType;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;

public class NineGatesTests {

  @Test
  public void testNineGatesWinWithSC1() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_win_c1.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.hasFaanType(FaanType.NINE_GATES));
    assertFalse(response.hasFaanType(FaanType.FULL_FLUSH));
    assertFalse(response.hasFaanType(FaanType.CONCEALED_HAND));
    assertEquals(response.getFaan(), 10);
  }

  @Test
  public void testNineGatesWinWithSC1Mixed() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_win_c1_mixed.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.hasFaanType(FaanType.NINE_GATES));
    assertFalse(response.hasFaanType(FaanType.FULL_FLUSH));
    assertFalse(response.hasFaanType(FaanType.CONCEALED_HAND));
    assertEquals(response.getFaan(), 10);
  }

  @Test
  public void testNineGatesWinWithSC2() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_win_c2.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.hasFaanType(FaanType.NINE_GATES));
    assertFalse(response.hasFaanType(FaanType.FULL_FLUSH));
    assertFalse(response.hasFaanType(FaanType.CONCEALED_HAND));
    assertEquals(response.getFaan(), 10);
  }

  @Test
  public void testNineGatesWinWithSC4() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_win_c4.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.hasFaanType(FaanType.NINE_GATES));
    assertFalse(response.hasFaanType(FaanType.FULL_FLUSH));
    assertFalse(response.hasFaanType(FaanType.CONCEALED_HAND));
    assertEquals(response.getFaan(), 10);
  }

  @Test
  public void testNineGatesWinWithSC5() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_win_c5.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.hasFaanType(FaanType.NINE_GATES));
    assertFalse(response.hasFaanType(FaanType.FULL_FLUSH));
    assertFalse(response.hasFaanType(FaanType.CONCEALED_HAND));
    assertEquals(response.getFaan(), 10);
  }

  @Test
  public void testNineGatesWinWithSC6() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_win_c6.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.hasFaanType(FaanType.NINE_GATES));
    assertFalse(response.hasFaanType(FaanType.FULL_FLUSH));
    assertFalse(response.hasFaanType(FaanType.CONCEALED_HAND));
    assertEquals(response.getFaan(), 10);
  }

  @Test
  public void testNineGatesWinWithSC7() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_win_c7.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.hasFaanType(FaanType.NINE_GATES));
    assertFalse(response.hasFaanType(FaanType.FULL_FLUSH));
    assertFalse(response.hasFaanType(FaanType.CONCEALED_HAND));
    assertEquals(response.getFaan(), 10);
  }

  @Test
  public void testNineGatesWinWithSC8() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_win_c8.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.hasFaanType(FaanType.NINE_GATES));
    assertFalse(response.hasFaanType(FaanType.FULL_FLUSH));
    assertFalse(response.hasFaanType(FaanType.CONCEALED_HAND));
    assertEquals(response.getFaan(), 10);
  }

  @Test
  public void testNineGatesWinWithSC9() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_win_c9.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.hasFaanType(FaanType.NINE_GATES));
    assertFalse(response.hasFaanType(FaanType.FULL_FLUSH));
    assertFalse(response.hasFaanType(FaanType.CONCEALED_HAND));
    assertEquals(response.getFaan(), 10);
  }

  @Test
  public void testNineGatesWinWithSB1() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_win_b1.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.hasFaanType(FaanType.NINE_GATES));
    assertFalse(response.hasFaanType(FaanType.FULL_FLUSH));
    assertFalse(response.hasFaanType(FaanType.CONCEALED_HAND));
    assertEquals(response.getFaan(), 10);
  }

  @Test
  public void testNineGatesWinWithSD1() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_win_d1.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.hasFaanType(FaanType.NINE_GATES));
    assertFalse(response.hasFaanType(FaanType.FULL_FLUSH));
    assertFalse(response.hasFaanType(FaanType.CONCEALED_HAND));
    assertEquals(response.getFaan(), 10);
  }

  @Test
  public void testNineGatesFailHonourTiles() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_fail_honourTiles.json";
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
  public void testNineGatesFailMixedSuit() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_fail_mixedSuit.json";
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
    assertFalse(response.hasFaanType(FaanType.NINE_GATES));
  }

  @Test
  public void testNineGatesFailInvalidStructureHasFourSC1() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_fail_invalidStructure_extraC1.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertFalse(response.hasFaanType(FaanType.NINE_GATES));
  }

  @Test
  public void testNineGatesFailInvalidStructureHasTwoSC1() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_fail_invalidStructure_missingC1.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertFalse(response.hasFaanType(FaanType.NINE_GATES));
  }

  @Test
  public void testNineGatesFailInvalidStructureMissingSC2() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_fail_invalidStructure_missingC2.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertFalse(response.hasFaanType(FaanType.NINE_GATES));
  }

  @Test
  public void testNineGatesFailInvalidStructureMissingSC8() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_fail_invalidStructure_missingC8.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertFalse(response.hasFaanType(FaanType.NINE_GATES));
  }

  @Test
  public void testNineGatesFailInvalidStructureHasDeclaredChow() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_fail_notConcealed_chow.json";
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
    assertFalse(response.hasFaanType(FaanType.NINE_GATES));
  }

  @Test
  public void testNineGatesFailInvalidStructureHasDeclaredPung() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_fail_notConcealed_pung.json";
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
    assertFalse(response.hasFaanType(FaanType.NINE_GATES));
  }

  @Test
  public void testNineGatesFailInvalidStructureHasDeclaredGong() throws Exception {
    // Create a sample request
    String configFile = "./configs/nine_gates_fail_notConcealed_gong.json";
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
    assertFalse(response.hasFaanType(FaanType.NINE_GATES));
  }

}
