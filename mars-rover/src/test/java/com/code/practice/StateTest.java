package com.code.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StateTest {

  @Test
  void test_should_initialized_with_initial_command() {
    InitializeCommand command = new InitializeCommand(0, 0, "N");
    assertEquals("0 0 N", new State(command).toString());
  }

  @Test
  void test_should_turn_left_based_north_with_command() {
    State state = new State(new InitializeCommand(0, 0, "N"));
    ExecuteCommand command = new ExecuteCommand(ExecuteCommand.Action.L);
    state.execute(command);

    assertEquals("0 0 W", state.toString());
  }

  @Test
  void test_should_turn_left_based_west_with_command() {
    State state = new State(new InitializeCommand(0, 0, "W"));
    ExecuteCommand command = new ExecuteCommand(ExecuteCommand.Action.L);
    state.execute(command);

    assertEquals("0 0 S", state.toString());
  }

  @Test
  void test_should_turn_right_based_north_with_command() {
    State state = new State(new InitializeCommand(0, 0, "N"));
    ExecuteCommand command = new ExecuteCommand(ExecuteCommand.Action.R);
    state.execute(command);

    assertEquals("0 0 E", state.toString());
  }

  @Test
  void test_should_move_when_direction_is_north() {
    State state = new State(new InitializeCommand(0, 0, "N"));
    ExecuteCommand command = new ExecuteCommand(ExecuteCommand.Action.M);
    state.execute(command);

    assertEquals("0 1 N", state.toString());
  }

  @Test
  void test_should_move_when_direction_is_east() {
    State state = new State(new InitializeCommand(0, 0, "E"));
    ExecuteCommand command = new ExecuteCommand(ExecuteCommand.Action.M);
    state.execute(command);

    assertEquals("1 0 E", state.toString());
  }

}