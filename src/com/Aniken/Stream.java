package com.Aniken;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream {

  public static void main(String[] args) {
    List<Person> people = getPeople();

    // Filter
    List<Person> females = people.stream()
        .filter(person -> person.getGender().equals(Gender.FEMALE))
        .collect(Collectors.toList());

    // Sort
    List<Person> sorted = people.stream()
        .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
        .collect(Collectors.toList());

    // All match
    boolean allMatch = people.stream()
        .allMatch(person -> person.getAge() > 8);

    // Any match
    boolean anyMatch = people.stream()
        .anyMatch(person -> person.getAge() > 121);

    // None match
    boolean noneMatch = people.stream()
        .noneMatch(person -> person.getName().equals("Antonio"));

    // Max
    people.stream()
        .max(Comparator.comparing(Person::getAge));

    // Min
    people.stream()
        .min(Comparator.comparing(Person::getAge));

    // Group
    Map<Gender, List<Person>> groupByGender = people.stream()
        .collect(Collectors.groupingBy(Person::getGender));

    Optional<String> oldest = people.stream()
        .filter(person -> person.getGender().equals(Gender.FEMALE))
        .max(Comparator.comparing(Person::getAge))
        .map(Person::getName);

    oldest.ifPresent(System.out::println);
  }

  private static List<Person> getPeople() {
    return List.of(
        new Person("Antonio", 20, Gender.MALE),
        new Person("Alina Smith", 33, Gender.FEMALE),
        new Person("Helen White", 57, Gender.FEMALE),
        new Person("Alex Boz", 14, Gender.MALE),
        new Person("Jamie Goa", 99, Gender.MALE),
        new Person("Anna Cook", 7, Gender.FEMALE),
        new Person("Zelda Brown", 120, Gender.FEMALE)
    );
  }

}
