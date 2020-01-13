package com.code.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StateTest {

  @Test
  void test_should_initialized_with_initial_command() {
    State State = new State(0, 0, "N");
    assertEquals("0 0 N", State.toString());
  }
}