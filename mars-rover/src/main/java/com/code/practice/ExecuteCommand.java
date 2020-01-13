package com.code.practice;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExecuteCommand {
  static List<String> directions = Arrays.asList(
      Direction.N.name(), Direction.E.name(), Direction.S.name(), Direction.W.name()
  );
  private Action action;

  public ExecuteCommand(Action action) {
    this.action = action;
  }

  public ExecuteCommand(String action) {
    this.action = Action.valueOf(action);
  }

  State execute(State state) {
    return action.func.apply(state);
  }

  enum Direction {
    N(new MovementDifferential(0, 1)),
    E(new MovementDifferential(1, 0)),
    S(new MovementDifferential(0, -1)),
    W(new MovementDifferential(-1, 0));

    private MovementDifferential differential;

    Direction(MovementDifferential differential) {
      this.differential = differential;
    }
  }

  enum Action {
    M(s -> new State(s, Direction.valueOf(s.getDirection()).differential)),
    L(s -> new State(s, directions.get((directions.indexOf(s.getDirection()) + 3) % directions.size()))),
    R(s -> new State(s, directions.get((directions.indexOf(s.getDirection()) + 1) % directions.size())));

    private Function<State, State> func;

    Action(final Function<State, State> func) {
      this.func = func;
    }
  }

  public static class MovementDifferential {
    private int x;
    private int y;

    public MovementDifferential(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }
  }
}
