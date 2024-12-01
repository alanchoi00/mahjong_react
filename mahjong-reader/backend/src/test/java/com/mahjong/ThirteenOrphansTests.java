package com.mahjong;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahjong.controller.FaanCalculator;
import com.mahjong.dto.MahjongRequest;
import com.mahjong.dto.MahjongResponse;
import com.mahjong.model.FaanType;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;

public class ThirteenOrphansTests {

  @Test
  public void testThirteenOrphansWithGreenDragonWinningTile() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_win_hdg.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 13, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.THIRTEEN_ORPHANS));
  }

  @Test
  public void testThirteenOrphansWithRedDragonWinningTile() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_win_hdr.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 13, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.THIRTEEN_ORPHANS));
  }

  @Test
  public void testThirteenOrphansWithWhiteDragonWinningTile() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_win_hdw.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 13, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.THIRTEEN_ORPHANS));
  }

  @Test
  public void testThirteenOrphansWithEastWindWinningTile() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_win_hwe.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 13, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.THIRTEEN_ORPHANS));
  }

  @Test
  public void testThirteenOrphansWithSouthWindWinningTile() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_win_hws.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 13, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.THIRTEEN_ORPHANS));
  }

  @Test
  public void testThirteenOrphansWithWestWindWinningTile() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_win_hww.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 13, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.THIRTEEN_ORPHANS));
  }

  @Test
  public void testThirteenOrphansWithNorthWindWinningTile() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_win_hwn.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 13, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.THIRTEEN_ORPHANS));
  }

  @Test
  public void testThirteenOrphansWithBambooOneWinningTile() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_win_sb1.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 13, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.THIRTEEN_ORPHANS));
  }

  @Test
  public void testThirteenOrphansWithBambooNineWinningTile() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_win_sb9.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 13, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.THIRTEEN_ORPHANS));
  }

  @Test
  public void testThirteenOrphansWithCharOneWinningTile() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_win_sc1.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 13, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.THIRTEEN_ORPHANS));
  }

  @Test
  public void testThirteenOrphansWithCharNineWinningTile() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_win_sc9.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 13, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.THIRTEEN_ORPHANS));
  }

  @Test
  public void testThirteenOrphansWithDotOneWinningTile() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_win_sd1.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 13, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.THIRTEEN_ORPHANS));
  }

  @Test
  public void testThirteenOrphansWithDotNineWinningTile() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_win_sd9.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 13, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.THIRTEEN_ORPHANS));
  }

  @Test
  public void testThirteenOrphansWithNoPair() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_fail_missingTile.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 0, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.NO_FAAN));
  }

  @Test
  public void testThirteenOrphansWithMissingTile() throws Exception {
    // Create a sample request
    String configFile = "./configs/thirteen_orphans_win_noPair.json";
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = this.getClass().getResourceAsStream(configFile);
    assertNotNull(is, "The configuration file should exist");
    MahjongRequest requestObj = mapper.readValue(is, MahjongRequest.class);

    // Simulate the calculate logic
    FaanCalculator calculator = new FaanCalculator();
    MahjongResponse response = calculator.calculate(requestObj);

    // Validate the response
    assertTrue(response.getFaan() == 0, "Response should include the hand details");
    assertTrue(response.hasFaanType(FaanType.NO_FAAN));
  }
}
