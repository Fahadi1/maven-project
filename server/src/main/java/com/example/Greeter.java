package com.example;

public class Greeter {

  /** 
  * Class constructor.
  */
  public Greeter() {
  }
  
  /**
  * la methode permet de saluer quelqu'un
  * @param someone la personne à saluer
  * @return la salutation
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
