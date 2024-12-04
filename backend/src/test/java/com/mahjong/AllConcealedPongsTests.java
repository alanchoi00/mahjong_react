package com.mahjong;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahjong.controller.FaanCalculator;
import com.mahjong.dto.MahjongRequest;
import com.mahjong.dto.MahjongResponse;
import com.mahjong.model.FaanType;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;

public class AllConcealedPongsTests {

  @Test
  public void testAllConcealedPongsWinMixedSuits() throws Exception {
    // Create a sample request
    String beforeFile = "./configs/allConcealedPongs_win_mixedSuitBefore.json";
    String afterFile = "./configs/allConcealedPongs_win_mixedSuitAfter.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream isBefore = this.getClass().getResourceAsStream(beforeFile);
    InputStream isAfter = this.getClass().getResourceAsStream(afterFile);
    assertNotNull(isBefore, "The '...win_before.json' configuration file should exist");
    assertNotNull(isAfter, "The '...win_after.json' configuration file should exist");
    MahjongRequest beforeObj = mapper.readValue(isBefore, MahjongRequest.class);
    MahjongRequest afterObj = mapper.readValue(isAfter, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse beforeResponse = calculator.calculate(beforeObj);
    MahjongResponse afterResponse = calculator.calculate(afterObj);

    // Validate the response
    int beforeFaan = beforeResponse.getFaan();
    int afterFaan = afterResponse.getFaan();

    assertEquals(afterFaan - beforeFaan, 8);
    assertTrue(afterResponse.hasFaanType(FaanType.ALL_CONCEALED_PONGS));
    assertFalse(afterResponse.hasFaanType(FaanType.CONCEALED_HAND));
    assertFalse(afterResponse.hasFaanType(FaanType.ALL_PONGS));
  }

  @Test
  public void testAllConcealedPongsWinHalfFlush() throws Exception {
    // Create a sample request
    String beforeFile = "./configs/allConcealedPongs_win_halfFlushBefore.json";
    String afterFile = "./configs/allConcealedPongs_win_halfFlushAfter.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream isBefore = this.getClass().getResourceAsStream(beforeFile);
    InputStream isAfter = this.getClass().getResourceAsStream(afterFile);
    assertNotNull(isBefore, "The '...win_before.json' configuration file should exist");
    assertNotNull(isAfter, "The '...win_after.json' configuration file should exist");
    MahjongRequest beforeObj = mapper.readValue(isBefore, MahjongRequest.class);
    MahjongRequest afterObj = mapper.readValue(isAfter, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse beforeResponse = calculator.calculate(beforeObj);
    MahjongResponse afterResponse = calculator.calculate(afterObj);

    // Validate the response
    int beforeFaan = beforeResponse.getFaan();
    int afterFaan = afterResponse.getFaan();

    assertEquals(afterFaan - beforeFaan, 8);
    assertTrue(afterResponse.hasFaanType(FaanType.ALL_CONCEALED_PONGS));
    assertTrue(afterResponse.hasFaanType(FaanType.HALF_FLUSH));
    assertFalse(afterResponse.hasFaanType(FaanType.CONCEALED_HAND));
    assertFalse(afterResponse.hasFaanType(FaanType.ALL_PONGS));
  }

  @Test
  public void testAllConcealedPongsWinFullFlush() throws Exception {
    // Create a sample request
    String beforeFile = "./configs/allConcealedPongs_win_fullFlushBefore.json";
    String afterFile = "./configs/allConcealedPongs_win_fullFlushAfter.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream isBefore = this.getClass().getResourceAsStream(beforeFile);
    InputStream isAfter = this.getClass().getResourceAsStream(afterFile);
    assertNotNull(isBefore, "The '...win_before.json' configuration file should exist");
    assertNotNull(isAfter, "The '...win_after.json' configuration file should exist");
    MahjongRequest beforeObj = mapper.readValue(isBefore, MahjongRequest.class);
    MahjongRequest afterObj = mapper.readValue(isAfter, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse beforeResponse = calculator.calculate(beforeObj);
    MahjongResponse afterResponse = calculator.calculate(afterObj);

    // Validate the response
    int beforeFaan = beforeResponse.getFaan();
    int afterFaan = afterResponse.getFaan();

    assertEquals(afterFaan - beforeFaan, 8);
    assertTrue(afterResponse.hasFaanType(FaanType.ALL_CONCEALED_PONGS));
    assertTrue(afterResponse.hasFaanType(FaanType.FULL_FLUSH));
    assertFalse(afterResponse.hasFaanType(FaanType.CONCEALED_HAND));
    assertFalse(afterResponse.hasFaanType(FaanType.ALL_PONGS));
  }

  @Test
  public void testAllConcealedPongsWinHonourPong() throws Exception {
    // Create a sample request
    String beforeFile = "./configs/allConcealedPongs_win_honourPongBefore.json";
    String afterFile = "./configs/allConcealedPongs_win_honourPongAfter.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream isBefore = this.getClass().getResourceAsStream(beforeFile);
    InputStream isAfter = this.getClass().getResourceAsStream(afterFile);
    assertNotNull(isBefore, "The '...win_before.json' configuration file should exist");
    assertNotNull(isAfter, "The '...win_after.json' configuration file should exist");
    MahjongRequest beforeObj = mapper.readValue(isBefore, MahjongRequest.class);
    MahjongRequest afterObj = mapper.readValue(isAfter, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse beforeResponse = calculator.calculate(beforeObj);
    MahjongResponse afterResponse = calculator.calculate(afterObj);

    // Validate the response
    int beforeFaan = beforeResponse.getFaan();
    int afterFaan = afterResponse.getFaan();

    assertEquals(afterFaan - beforeFaan, 8);
    assertTrue(afterResponse.hasFaanType(FaanType.ALL_CONCEALED_PONGS));
    assertTrue(afterResponse.hasFaanType(FaanType.GREEN_DRAGON_PONG));
    assertFalse(afterResponse.hasFaanType(FaanType.CONCEALED_HAND));
    assertFalse(afterResponse.hasFaanType(FaanType.ALL_PONGS));
  }

  @Test
  public void testAllConcealedPongsFailNotAllPongs() throws Exception {
    // Create a sample request
    String beforeFile = "./configs/allConcealedPongs_fail_notAllPongsBefore.json";
    String afterFile = "./configs/allConcealedPongs_fail_notAllPongsAfter.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream isBefore = this.getClass().getResourceAsStream(beforeFile);
    InputStream isAfter = this.getClass().getResourceAsStream(afterFile);
    assertNotNull(isBefore, "The '...win_before.json' configuration file should exist");
    assertNotNull(isAfter, "The '...win_after.json' configuration file should exist");
    MahjongRequest beforeObj = mapper.readValue(isBefore, MahjongRequest.class);
    MahjongRequest afterObj = mapper.readValue(isAfter, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse beforeResponse = calculator.calculate(beforeObj);
    MahjongResponse afterResponse = calculator.calculate(afterObj);

    // Validate the response
    int beforeFaan = beforeResponse.getFaan();
    int afterFaan = afterResponse.getFaan();

    assertEquals(afterFaan - beforeFaan, 0);
    assertFalse(afterResponse.hasFaanType(FaanType.ALL_CONCEALED_PONGS));
  }

}
