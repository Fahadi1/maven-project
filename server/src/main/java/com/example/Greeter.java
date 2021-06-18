/**
 * This module is an example for the TP.
 * @since 1.0
 * @author FAhadi1
 * @version 1.0
 */
package com.example;

/**
* The greet class is a program to greet someone.
* simply displays "Hello babacar !" to the person who uses it.
* @author  Zara Ali
* @version 1.0
* @since   2021-06-18
*/
public class Greeter {

  /**
  * Create an empty Greet
  */
  public Greeter() {
  }
  
  /**
  * This method allows to greet someone.
  * @param someone the person to greet
  * @return the greeting in the right format
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
