package com.code.practice.fizz.buzz;

public class FizzBuzz {
  private static String FIZZ = "Fizz";
  private static String BUZZ = "Buzz";
  private static String WHIZZ = "Whizz";

  public static String fizzBuzz(Integer number) {
    if (number % 3 == 0) {
      return FIZZ;
    }
    if (number % 5 == 0) {
      return BUZZ;
    }

    if (number % 7 == 0) {
      return WHIZZ;
    }

    return number.toString();
  }
}
