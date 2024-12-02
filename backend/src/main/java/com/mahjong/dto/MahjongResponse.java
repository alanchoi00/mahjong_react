package com.mahjong.dto;

import java.util.ArrayList;
import java.util.List;

import com.mahjong.model.FaanType;
import com.mahjong.model.FaanTypeVariation;

public class MahjongResponse {
  private int faan = 0;
  private List<FaanTypeVariation> faanTypeVariations = new ArrayList<>();
  private List<String> hand = new ArrayList<>();
  private String message = "";

  public int getFaan() {
    return faan;
  }

  public void setFaan(int faan) {
    this.faan = faan;
  }

  public List<FaanTypeVariation> getFaanTypeVariations() {
    return faanTypeVariations;
  }

  public void setFaanTypeVariations(List<FaanTypeVariation> faanTypeVariations) {
    this.faanTypeVariations = faanTypeVariations;
  }

  public void addFaanTypeVariation(FaanTypeVariation faanTypeVariation) {
    faanTypeVariations.add(faanTypeVariation);
  }

  public List<String> getHand() {
    return hand;
  }

  public void setHand(List<String> hand) {
    this.hand = hand;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public boolean hasFaanType(FaanType faanType) {
    return faanTypeVariations.stream().anyMatch(var -> var.hasFaanType(faanType));
  }

  @Override
  public String toString() {
    return "MahjongResponse [faan=" + faan + ", faanTypeVariations="
        + faanTypeVariations.stream().map(FaanTypeVariation::toString) + ", hand=" + hand
        + ", message=" + message + "]";
  }
}
