package com.Aniken;

import java.util.List;

public class Person {

  private String name;
  private int age;
  private Gender gender;
  private List<List<String>> pets;

  public Person(String name, int age, Gender gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person(String name, int age, Gender gender, List<List<String>> pets) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.pets = pets;
  }

  public String getName() {
    return name;
  }

  public List<List<String>> getPets() {
    return pets;
  }

  public int getAge() {
    return age;
  }

  public Gender getGender() {
    return gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", gender=" + gender +
        '}';
  }
}
