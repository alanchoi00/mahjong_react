package com.mahjong.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class FaanTypeVariation {
  private int totalFaan = 0;
  private List<FaanType> faanTypes = new ArrayList<>();

  public FaanTypeVariation(List<FaanType> faanTypes) {
    this.faanTypes = faanTypes;
    this.totalFaan = calcTotalFaan();
  }

  private int calcTotalFaan() {
    return faanTypes.stream().mapToInt(FaanType::getFaan).sum();
  }

  public void add(FaanType faanType) {
    faanTypes.add(faanType);
    totalFaan = calcTotalFaan();
  }

  public List<FaanType> getFaanTypes() {
    return new ArrayList<>(faanTypes);
  }

  public int getTotalFaan() {
    return totalFaan;
  }

  public void setFaanTypes(List<FaanType> faanTypes) {
    this.faanTypes = faanTypes;
    totalFaan = calcTotalFaan();
  }

  public boolean hasFaanType(FaanType faanType) {
    return faanTypes.contains(faanType);
  }

  public JSONObject toJSON() {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("totalFaan", totalFaan);

    JSONArray faanTypesArray = new JSONArray();
    for (FaanType faanType : faanTypes) {
      faanTypesArray.put(faanType.toJSON());
    }
    jsonObject.put("faanTypes", faanTypesArray);

    return jsonObject;
  }

  @Override
  public String toString() {
    return "FaanTypeVariation [totalFaan=" + totalFaan + ", faanTypes=["
        + faanTypes.stream()
            .map(FaanType::toString)
            .collect(Collectors.joining(", "))
        + "]]";
  }

}
