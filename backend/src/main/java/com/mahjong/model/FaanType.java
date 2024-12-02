package com.mahjong.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public enum FaanType {
  THIRTEEN_ORPHANS("Thirteen Orphans", "十三幺", 13),
  FOUR_GONGS("Four Gongs", "十八羅漢", 13),
  BIG_FOUR_WIND("Big Four Wind", "大四喜", 13),
  NINE_GATES("Nine Gates", "九子連環", 10),
  ALL_HONOURS("All Honours", "字一色", 10),
  ALL_TERMINALS("All Terminals", "清幺九", 10),
  ALL_CONCEALED_PONGS("All Concealed Pongs", "坎坎胡", 8),
  TOUCH_MYSELF_AFTER_DOUBLE_GONG("Touch Myself After Double Gong", "槓上槓自摸", 8),
  BIG_THREE_DRAGONS("Big Three Dragons", "大三元", 8),
  FULL_FLUSH("Full Flush", "清一色", 7),
  LITTLE_FOUR_WIND("Little Four Wind", "小四喜", 6),
  SMALL_THREE_DRAGONS("Little Three Dragons", "小三元", 5),
  HALF_FLUSH("Half Flush", "混一色", 3),
  ALL_PONGS("All Pongs", "對對糊", 3),
  ALL_CHOWS("All Chows", "平糊", 1),
  HALF_TERMINALS("Half Terminals", "花幺九", 1),
  ROUND_WIND_PONG("Round Wind", "正風牌", 1),
  SEAT_WIND_PONG("Seat Wind", "正位牌", 1),
  RED_DRAGON_PONG("Red Dragon Pong", "紅中牌", 1),
  GREEN_DRAGON_PONG("Green Dragon Pong", "發財牌", 1),
  WHITE_DRAGON_PONG("White Dragon Pong", "白板牌", 1),
  TOUCH_MYSELF("Touch Myself", "自摸", 1), // ;)
  STEAL_GONG("Steal Gong", "搶槓", 1),
  CONCEALED_HAND("Concealed Hand", "門前清", 1),
  TOUCH_MYSELF_AFTER_GONG("Gong After Touch Myself", "槓上自摸", 1),
  WIN_BY_LAST_TILE("Win By Last Tile", "海底撈月", 1),
  NO_FAAN("No Faan", "雞糊", 0);

  private final String englishName;
  private final String chineseName;
  private final int faan;

  FaanType(String englishName, String chineseName, int faan) {
    this.englishName = englishName;
    this.chineseName = chineseName;
    this.faan = faan;
  }

  public String getEnglishName() {
    return englishName;
  }

  public String getChineseName() {
    return chineseName;
  }

  public int getFaan() {
    return faan;
  }

  public static FaanType fromEnglishName(String englishName) {
    for (FaanType type : FaanType.values()) {
      if (type.getEnglishName().equalsIgnoreCase(englishName)) {
        return type;
      }
    }
    throw new IllegalArgumentException("No FaanType with English name: " + englishName);
  }

  public static FaanType fromChineseName(String chineseName) {
    for (FaanType type : FaanType.values()) {
      if (type.getChineseName().equals(chineseName)) {
        return type;
      }
    }
    throw new IllegalArgumentException("No FaanType with Chinese name: " + chineseName);
  }

  public static List<FaanType> filterByFaan(int faanValue) {
    List<FaanType> result = new ArrayList<>();
    for (FaanType type : FaanType.values()) {
      if (type.getFaan() == faanValue) {
        result.add(type);
      }
    }
    return result;
  }

  public JSONObject toJSON() {
    JSONObject json = new JSONObject();
    json.put("englishName", englishName);
    json.put("chineseName", chineseName);
    json.put("faan", faan);
    return json;
  }

  @Override
  public String toString() {
    return String.format("%s (%s) - Faan: %d", englishName, chineseName, faan);
  }

}
