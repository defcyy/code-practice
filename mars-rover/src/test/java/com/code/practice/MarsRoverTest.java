package com.code.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

  @Test
  void should_init_rover_with_initial_command() {
    InitializeCommand command = new InitializeCommand(0, 0, "W");
    MarsRover marsRover = MarsRover.initialize(command);
    assertEquals("0 0 W", marsRover.toString());
  }

  @Test
  void should_process_commands() {
    InitializeCommand command = new InitializeCommand(0, 0, "N");
    MarsRover marsRover = MarsRover.initialize(command);
    assertEquals("2 1 N", marsRover.process("MRMML"));
  }
}
