/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

/**
 * Sub class PasswordField that can display password for specific item
 *
 * @author Chattada Viriyaphap <chattada@uab.edu>
 */
public class PasswordField extends Fields {

  /**
   * Main method to display password for specific items
   *
   * @param name - type of password (String password, outer password, inner password, etc)
   * @param value - value of notes (String password)
   */
  public PasswordField(String name, String value) {
    super(name, value); // calling name and value from super class Fields
    type = "Password Field";

    // attempting to mask confidential info. Is not wokring as of yet
    //    if (name.equalsIgnoreCase("Password: ")) {
    //      for (int index = 0; index < value.length(); index++) {
    //        this.text += "*";
    //      }
    //    }
  }
}
