package ru.otus.java.basic.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  void testBuildArray() {

    Assertions.assertArrayEquals(new int[]{}, App.buildArray(new int[]{1}));
    Assertions.assertArrayEquals(new int[]{2, 3}, App.buildArray(new int[]{1, 2, 3}));
    Assertions.assertArrayEquals(new int[]{5, 6, 7},
        App.buildArray(new int[]{1, 2, 3, 1, 5, 6, 7}));

    Assertions.assertDoesNotThrow(() -> App.buildArray(new int[]{1}));
    Assertions.assertDoesNotThrow(() -> App.buildArray(new int[]{1, 2, 3}));
    Assertions.assertDoesNotThrow(() -> App.buildArray(new int[]{1, 2, 3, 1, 5, 6, 7}));

    Assertions.assertThrows(RuntimeException.class, () -> App.buildArray(new int[]{}));
    Assertions.assertThrows(RuntimeException.class, () -> App.buildArray(new int[]{2, 3, 4}));

  }

  @Test
  void testCheckArray() {
    Assertions.assertTrue(App.checkArray(new int[]{1, 2}));
    Assertions.assertTrue(App.checkArray(new int[]{1, 1, 2, 2, 1, 2}));

    Assertions.assertFalse(App.checkArray(new int[]{}));
    Assertions.assertFalse(App.checkArray(new int[]{2, 2, 2}));
    Assertions.assertFalse(App.checkArray(new int[]{1, 1, 1}));
    Assertions.assertFalse(App.checkArray(new int[]{1, 2, 1, 2, 3}));
  }
}
