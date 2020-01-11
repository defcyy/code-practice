package com.code.practice.fizz.buzz;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FizzBuzz {
  private static String FIZZ = "Fizz";
  private static String BUZZ = "Buzz";
  private static String WHIZZ = "Whizz";

  public static String fizzBuzz(Integer number) {

    List<Rule> rules = Arrays.asList(
        new Rule(
            num -> FIZZ,
            num -> !containsNumber(num, "5") && containsNumber(num, "3")
            , true),
        new Rule(
            num -> FIZZ,
            num -> (containsNumber(num, "7") || !containsNumber(num, "5")) && num % 3 == 0,
            false
        ),
        new Rule(
            num -> BUZZ,
            num -> !containsNumber(num, "7") && num % 5 == 0,
            false
        ),
        new Rule(
            num -> WHIZZ,
            num -> number % 7 == 0,
            false
        )
    );

    Optional<Rule> terminationRule = rules.stream()
        .filter(r -> r.test(number))
        .filter(Rule::isTermination)
        .findFirst();
    if (terminationRule.isPresent()) {
      return terminationRule.get().process(number);
    }

    String matched = rules.stream()
        .filter(r -> r.test(number))
        .map(r -> r.process(number))
        .collect(Collectors.joining());
    return matched.isEmpty() ? number.toString() : matched;
  }

  private static boolean containsNumber(Integer number, String character) {
    return number.toString().contains(character);
  }

  private static class Rule {
    private boolean isTermination;
    private Function<Integer, String> func;
    private Predicate<Integer> predicate;

    public Rule(Function<Integer, String> func, Predicate<Integer> predicate, boolean isTermination) {
      this.func = func;
      this.isTermination = isTermination;
      this.predicate = predicate;
    }

    public boolean isTermination() {
      return isTermination;
    }

    public boolean test(Integer number) {
      return predicate.test(number);
    }

    public String process(Integer number) {
      return func.apply(number);
    }
  }
}
