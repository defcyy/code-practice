package com.code.practice;

public class State {

  private int x;
  private int y;
  private String direction;

  public State(State state, ExecuteCommand.MovementDifferential differential) {
    this.x = state.x + differential.getX();
    this.y = state.y + differential.getY();
    this.direction = state.direction;
  }

  public State(State state, String direction) {
    this.x = state.x;
    this.y = state.y;
    this.direction = direction;
  }

  public State(int x, int y, String direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public String getDirection() {
    return direction;
  }

  @Override
  public String toString() {
    return String.format("%s %s %s", x, y, direction);
  }

}
