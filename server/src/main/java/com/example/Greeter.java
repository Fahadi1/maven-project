package com.example;

public class Greeter {

  /** 
  * Class constructor.
  */
  public Greeter() {
  }

  /**
  ** this is a method to greet 
  ** @param someone : the someone to be greeted
  ** @return String : the right format of the returned string
  **/
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
