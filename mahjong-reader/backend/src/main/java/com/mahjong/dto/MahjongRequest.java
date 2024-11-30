package com.mahjong.dto;

import java.util.ArrayList;
import java.util.List;

public class MahjongRequest {
  private String roundWind = "E";
  private String seatWind = "E";
  private List<String> chow = new ArrayList<>();
  private List<String> pung = new ArrayList<>();
  private List<String> gong = new ArrayList<>();
  private List<String> hand = new ArrayList<>();
  private List<String> extraTiles = new ArrayList<>();
  private WinMethods winMethods = new WinMethods();

  public String getSeatWind() {
    return seatWind;
  }

  public void setSeatWind(String seatWind) {
    this.seatWind = seatWind;
  }

  public List<String> getChow() {
    return chow;
  }

  public void setChow(List<String> chow) {
    this.chow = chow;
  }

  public List<String> getPung() {
    return pung;
  }

  public void setPung(List<String> pung) {
    this.pung = pung;
  }

  public List<String> getGong() {
    return gong;
  }

  public void setGong(List<String> gong) {
    this.gong = gong;
  }

  public List<String> getExtraTiles() {
    return extraTiles;
  }

  public void setExtraTiles(List<String> extraTiles) {
    this.extraTiles = extraTiles;
  }

  public WinMethods getWinMethods() {
    return winMethods;
  }

  public void setWinMethods(WinMethods winMethods) {
    this.winMethods = winMethods;
  }

  public String getRoundWind() {
    return roundWind;
  }

  public List<String> getHand() {
    return hand;
  }

  public void setRoundWind(String roundWind) {
    this.roundWind = roundWind;
  }

  public void setHand(List<String> hand) {
    this.hand = hand;
  }
}
