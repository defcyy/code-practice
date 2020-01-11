package com.code.practice.fizz.buzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

  @Test
  void should_return_number() {
    assertEquals("1", FizzBuzz.fizzBuzz(1));
  }

  @Test
  void should_return_fizz_when_divisible_by_3() {
    assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
  }

  @Test
  void should_return_buzz_when_divisible_by_5() {
    assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
  }

  @Test
  void should_return_whizz_when_divisible_by_7() {
    assertEquals("Whizz", FizzBuzz.fizzBuzz(7));
  }
}
