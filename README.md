# Домашнее задание курса [OTUS Java Developer. Basic](https://otus.ru/lessons/java-basic/)

## Работа с тестированием в Java

---
[![Build](https://github.com/alexey-sidorov-dev/otus-java-testing/workflows/Build/badge.svg)](https://github.com/alexey-sidorov-dev/otus-java-testing/actions)
![Language](https://img.shields.io/github/languages/top/alexey-sidorov-dev/otus-java-testing)
[![License](https://img.shields.io/github/license/alexey-sidorov-dev/otus-java-testing)](https://github.com/alexey-sidorov-dev/otus-java-testing/blob/master/LICENSE)

### Цель

Научиться писать тесты с использованием JUnit.

### Задание

1. Реализовать метод, принимающий в качестве аргумента одномерный целочисленный массив и
   возвращающий новый
   массив, который содержит элементы исходного массива, идущие после последней единицы. Если входной
   массив не
   содержит единиц, то должно быть брошено RuntimeException.
    - Входной массив: [ 1 2 1 2 2 ] => Результат: [ 2 2 ]
    - Входной массив: [ 2 2 2 2 ] => RuntimeException
2. Реализовать метод, проверяющий входной массив, что он состоит только из чисел 1 и 2. Если в
   массиве присутствуют числа кроме 1 и 2 или нет хотя бы одной единицы или двойки, то результат
   должен быть равен false.
    - [ 1 2 ] => true
    - [ 1 1 ] => false
    - [ 1 3 ] => false
    - [ 1 2 3 ] => false
    - [ 1 2 2 1 ] => true
3. Реализовать набор тестов для методов.


