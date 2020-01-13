package com.code.practice;

public class MarsRover {
  private State state;

  private MarsRover(State state) {
    this.state = state;
  }

  public static MarsRover initialize(InitializeCommand command) {
    return new MarsRover(new State(command.getX(), command.getY(), command.getDirection()));
  }

  public String process(String commands) {
    commands.chars().forEach(c -> {
      this.state = new ExecuteCommand(String.valueOf((char) c)).execute(state);
    });
    return this.toString();
  }

  @Override
  public String toString() {
    return state.toString();
  }
}
