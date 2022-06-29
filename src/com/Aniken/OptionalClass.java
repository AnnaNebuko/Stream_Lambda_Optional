package com.Aniken;

import java.util.Optional;

public class OptionalClass {

  public static void main(String[] args) {

    Optional<Person> person = Optional.of(new Person("Antonio", 20, Gender.MALE));

    if (person.isPresent()) {
      String name = person.get().getName();
    }

    String orElse = person.map(s -> person.get().getName()).orElse("Anna");
    String name = person
        .map(s -> person.get().getName())
        .orElseThrow(IllegalArgumentException::new);

    person.ifPresentOrElse(System.out::println, IllegalArgumentException::new);
  }
}
