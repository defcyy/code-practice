package com.code.practice;

public class MarsRover {
  private State state;

  public MarsRover() {

  }

  private MarsRover(State state) {
    this.state = state;
  }

  public String report() {
    return state.toString();
  }

  public void process(InitializeCommand command) {
  }
}
