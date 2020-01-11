package com.code.practice.fizz.buzz;

public class FizzBuzz {
  private static String FIZZ = "Fizz";
  private static String BUZZ = "Buzz";
  private static String WHIZZ = "Whizz";

  public static String fizzBuzz(Integer number) {


    if (!containsNumber(number, "5") && containsNumber(number, "3")) {
      return FIZZ;
    }

    String divisibleResult = processDivisible(number);

    if (divisibleResult.isEmpty()) {
      return number.toString();
    }
    return divisibleResult;
  }

  private static boolean containsNumber(Integer number, String character) {
    return number.toString().contains(character);
  }

  private static String processDivisible(Integer number) {
    StringBuilder specialBuilder = new StringBuilder();
    if ((containsNumber(number, "7") || !containsNumber(number, "5")) && number % 3 == 0) {
      specialBuilder.append(FIZZ);
    }
    if (!containsNumber(number, "7") && number % 5 == 0) {
      specialBuilder.append(BUZZ);
    }

    if (number % 7 == 0) {
      specialBuilder.append(WHIZZ);
    }
    return specialBuilder.toString();
  }
}
