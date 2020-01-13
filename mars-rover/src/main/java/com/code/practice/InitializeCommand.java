package com.code.practice;

public class InitializeCommand {
  private int x;
  private int y;
  private String direction;

  public InitializeCommand(int x, int y, String direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public String getDirection() {
    return direction;
  }
}
