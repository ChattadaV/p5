/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

public class TextField extends Fields {

  public TextField(String name, String value) {
    super(name, value); // superclass Fields
    type = "Text Field";

    // attempting to  mask important information. Is not working as of yet
    if ((name.equals("CVV: ")
        || (name.equals("PIN: ")
            || (name.equals("Card Number: "))
            || (name.equals("License Number: "))))) {
      if (value != null) {
        for (int index = 0; index < value.length(); index++) {
          this.text += "*";
        }
      } else {
        this.text = text;
      }
    }
  }
}
