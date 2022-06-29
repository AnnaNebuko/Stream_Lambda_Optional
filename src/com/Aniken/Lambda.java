package com.Aniken;

public class Lambda {

  public static void main(String[] args) {
    //No need to create a class and implement interface
    //Лямбда - короткая версия (синтаксическое упрощение) использования анонимного класса,
    //который имплементирует функциональный интерфейс

    printThing((s) -> System.out.println("Hello" + s));
  }

  static void printThing(Printable person) {
    person.print("!");
  }
}
