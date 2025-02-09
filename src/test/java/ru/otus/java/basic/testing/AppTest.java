package ru.otus.java.basic.testing;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AppTest {

  @Test
  void testBuildArray() {

    Assertions.assertArrayEquals(new int[]{}, App.buildArray(new int[]{1}));
    Assertions.assertArrayEquals(new int[]{}, App.buildArray(new int[]{1, 2, 1}));
    Assertions.assertArrayEquals(new int[]{2, 3}, App.buildArray(new int[]{1, 2, 3}));
    Assertions.assertArrayEquals(new int[]{5, 6, 7},
        App.buildArray(new int[]{1, 2, 3, 1, 5, 6, 7}));

    Assertions.assertDoesNotThrow(() -> App.buildArray(new int[]{1}));
    Assertions.assertDoesNotThrow(() -> App.buildArray(new int[]{1, 2, 3}));
    Assertions.assertDoesNotThrow(() -> App.buildArray(new int[]{1, 2, 3, 1, 5, 6, 7}));

    Assertions.assertThrows(RuntimeException.class, () -> App.buildArray(new int[]{}));
    Assertions.assertThrows(RuntimeException.class, () -> App.buildArray(new int[]{2, 3, 4}));

  }

  @ParameterizedTest(name = "{index} - {1} should give {0}")
  @MethodSource("arrayProviderFalse")
  void testCheckArrayParametrized(boolean expected, int[] array) {
    Assertions.assertEquals(expected, App.checkArray(array));
  }

  static Stream<Arguments> arrayProviderFalse() {
    return Stream.of(
        Arguments.arguments(true, new int[]{1, 2}),
        Arguments.arguments(true, new int[]{1, 2}),
        Arguments.arguments(false, new int[]{}),
        Arguments.arguments(false, new int[]{2, 2, 2}),
        Arguments.arguments(false, new int[]{1, 1, 1}),
        Arguments.arguments(false, new int[]{1, 2, 1, 2, 3})
    );
  }

}
