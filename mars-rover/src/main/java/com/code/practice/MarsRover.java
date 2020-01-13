package com.code.practice;

public class MarsRover {
  private State state;

  private MarsRover(State state) {
    this.state = state;
  }

  public static MarsRover initialize(InitializeCommand command) {
    return new MarsRover(new State(command));
  }

  public String process(String commands) {
    commands.chars().forEach(c ->
        state.execute(new ExecuteCommand(ExecuteCommand.Action.valueOf(String.valueOf((char) c)))));
    return this.toString();
  }

  @Override
  public String toString() {
    return state.toString();
  }
}
