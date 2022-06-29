package com.Aniken;

@FunctionalInterface
public interface Printable {

  //Only one abstract method, static and default is allowed
  void print(String prefix);

}
