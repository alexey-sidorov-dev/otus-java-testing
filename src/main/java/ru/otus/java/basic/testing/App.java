package ru.otus.java.basic.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

  public static int[] buildArray(int[] array) throws RuntimeException {
    if (array.length == 0) {
      throw new RuntimeException("Входной массив пустой");
    }

    for (int i = array.length - 1; i >= 0; i--) {
      if (array[i] == 1) {
        return Arrays.copyOfRange(array, i + 1, array.length);
      }
    }

    throw new RuntimeException("Входной массив не имеет ни одной единицы");
  }

  public static boolean checkArray(int[] array) {

    if (array.length == 0) {
      return false;
    }

    List<Integer> listOfOne = new ArrayList<>();
    List<Integer> listOfTwo = new ArrayList<>();
    for (int i : array) {
      if (i == 1) {
        listOfOne.add(i);
      }
      if (i == 2) {
        listOfTwo.add(i);
      }
    }
    return !listOfOne.isEmpty() && !listOfTwo.isEmpty() && (listOfOne.size() + listOfTwo.size()
        == array.length);
  }
}