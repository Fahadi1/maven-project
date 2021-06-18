package com.example;

public class Greeter {

  public Greeter() {
      //constructeur vide
  }

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
