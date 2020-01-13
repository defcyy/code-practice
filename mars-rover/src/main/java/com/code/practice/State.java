package com.code.practice;

import com.google.common.collect.ImmutableMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class State {
  private static List<String> directions = Arrays.asList(
      "N", "E", "S", "W"
  );
  private static Map<String, MovementDifferential> differentials = ImmutableMap.of(
      "N", new MovementDifferential(0, 1),
      "S", new MovementDifferential(0, -1),
      "E", new MovementDifferential(1, 0),
      "W", new MovementDifferential(-1, 0)
  );

  private int x;
  private int y;
  private String direction;

  public State(InitializeCommand command) {
    this.x = command.getX();
    this.y = command.getY();
    this.direction = command.getDirection();
  }

  @Override
  public String toString() {
    return String.format("%s %s %s", x, y, direction);
  }

  public void execute(ExecuteCommand command) {
    if (command.getAction().equals(ExecuteCommand.Action.L)) {
      this.direction = directions.get((directions.indexOf(direction) + 3) % directions.size());
    }
    if (command.getAction().equals(ExecuteCommand.Action.R)) {
      this.direction = directions.get((directions.indexOf(direction) + 1) % directions.size());
    }
    if (command.getAction().equals(ExecuteCommand.Action.M)) {
      this.x += differentials.get(this.direction).x;
      this.y += differentials.get(this.direction).y;
    }
  }

  private static class MovementDifferential {
    private int x;
    private int y;

    public MovementDifferential(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}
