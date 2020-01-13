package com.code.practice;


public class ExecuteCommand {
  private Action action;

  public ExecuteCommand(Action action) {
    this.action = action;
  }

  public Action getAction() {
    return action;
  }

  enum Action {
    M, L, R
  }
}
