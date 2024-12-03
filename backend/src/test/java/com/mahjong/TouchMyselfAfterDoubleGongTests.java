package com.mahjong;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahjong.controller.FaanCalculator;
import com.mahjong.dto.MahjongRequest;
import com.mahjong.dto.MahjongResponse;
import com.mahjong.model.FaanType;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;

public class TouchMyselfAfterDoubleGongTests {

  @Test
  public void testTouchMyselfAfterDoubleGongWin() throws Exception {
    // Create a sample request
    String beforeFile = "./configs/touchMyselfAfterDoubleGong_win_before.json";
    String afterFile = "./configs/touchMyselfAfterDoubleGong_win_after.json";
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
    assertTrue(afterResponse.hasFaanType(FaanType.TOUCH_MYSELF_AFTER_DOUBLE_GONG));
  }

  @Test
  public void testTouchMyselfAfterDoubleGongFailOnlyOneGong() throws Exception {
    // Create a sample request
    String beforeFile = "./configs/touchMyselfAfterDoubleGong_fail_onlyOneGongBefore.json";
    String afterFile = "./configs/touchMyselfAfterDoubleGong_win_onlyOneGongAfter.json";
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

    assertEquals(beforeFaan - afterFaan, 0);
    assertFalse(afterResponse.hasFaanType(FaanType.TOUCH_MYSELF_AFTER_DOUBLE_GONG));
  }

}
