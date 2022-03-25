/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

public class PasswordField extends Fields {

  public PasswordField(String name, String value) {
    super(name, value);
    type = "Password Field";

    if (name.equalsIgnoreCase("Password")) {
      for (int index = 0; index < value.length(); index++) {
        this.text += "*";
      }
    }
  }
}
