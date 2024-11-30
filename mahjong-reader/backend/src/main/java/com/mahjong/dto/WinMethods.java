package com.mahjong.dto;

public class WinMethods {
  private boolean selfPick = false;
  private boolean lastCatch = false;
  private boolean kong = false;
  private boolean fullyConcealed = false;
  private boolean robbingKong = false;
  private boolean doubleKong = false;

  public boolean isSelfPick() {
    return selfPick;
  }

  public void setSelfPick(boolean selfPick) {
    this.selfPick = selfPick;
  }

  public boolean isLastCatch() {
    return lastCatch;
  }

  public void setLastCatch(boolean lastCatch) {
    this.lastCatch = lastCatch;
  }

  public boolean isKong() {
    return kong;
  }

  public void setKong(boolean kong) {
    this.kong = kong;
  }

  public boolean isFullyConcealed() {
    return fullyConcealed;
  }

  public void setFullyConcealed(boolean fullyConcealed) {
    this.fullyConcealed = fullyConcealed;
  }

  public boolean isRobbingKong() {
    return robbingKong;
  }

  public void setRobbingKong(boolean robbingKong) {
    this.robbingKong = robbingKong;
  }

  public boolean isDoubleKong() {
    return doubleKong;
  }

  public void setDoubleKong(boolean doubleKong) {
    this.doubleKong = doubleKong;
  }
}
