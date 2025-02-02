package ru.otus.java.basic.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  public void testMain() {
    Assertions.assertDoesNotThrow(() -> {
      App.main(new String[]{});
    });
  }
}
