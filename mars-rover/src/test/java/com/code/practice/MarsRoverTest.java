package com.code.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

  @Test
  void should_return_information_when_receive_initial_command() {
    InitializeCommand command = new InitializeCommand(0, 0, "W");
    MarsRover marsRover = new MarsRover();
    marsRover.process(command);
    assertEquals(marsRover.report(), "0 0 W");
  }
}
