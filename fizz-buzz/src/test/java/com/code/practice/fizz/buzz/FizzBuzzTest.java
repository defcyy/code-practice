package com.code.practice.fizz.buzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

  private static Stream<Arguments> produceSpecialNumbers() {
    return Stream.of(
        Arguments.of("Fizz", 3),
        Arguments.of("Buzz", 5),
        Arguments.of("Whizz", 7));
  }

  @Test
  void should_return_number() {
    assertEquals("1", FizzBuzz.fizzBuzz(1));
  }

  @ParameterizedTest
  @MethodSource("produceSpecialNumbers")
  void should_return_special_string_when_divisible_special_number(String expected, Integer number) {
    assertEquals(expected, FizzBuzz.fizzBuzz(number));
  }

}
