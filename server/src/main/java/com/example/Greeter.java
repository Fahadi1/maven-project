package com.example;

/**
* Class exemple pour javadoc.
* @author  Zara Ali
* @version 1.0
* @since   2021-06-18
*/
public class Greeter {

  /**
  * Creates an empty Greet.
  */
  public Greeter() {
  } 
  /**
  * Method qui renvoie "Hello babacar".
  * @param someone the person to greet
  * @return String the greeting in the right format
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
