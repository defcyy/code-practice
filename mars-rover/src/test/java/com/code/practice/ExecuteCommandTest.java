package com.code.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExecuteCommandTest {
  @Test
  void test_should_turn_left_based_north_with_action() {
    State state = new State(0, 0, "N");
    state = new ExecuteCommand(ExecuteCommand.Action.L).execute(state);

    assertEquals("0 0 W", state.toString());
  }

  @Test
  void test_should_turn_left_based_west_with_action() {
    State state = new State(0, 0, "W");
    state = new ExecuteCommand(ExecuteCommand.Action.L).execute(state);

    assertEquals("0 0 S", state.toString());
  }

  @Test
  void test_should_turn_right_based_north_with_action() {
    State state = new State(0, 0, "N");
    state = new ExecuteCommand(ExecuteCommand.Action.R).execute(state);

    assertEquals("0 0 E", state.toString());
  }

  @Test
  void test_should_move_when_direction_is_north() {
    State state = new State(0, 0, "N");
    state = new ExecuteCommand(ExecuteCommand.Action.M).execute(state);

    assertEquals("0 1 N", state.toString());
  }

  @Test
  void test_should_move_when_direction_is_east() {
    State state = new State(0, 0, "E");
    state = new ExecuteCommand(ExecuteCommand.Action.M).execute(state);

    assertEquals("1 0 E", state.toString());
  }


}