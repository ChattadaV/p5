/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

/**
 * Sub class TextField that can display variety of text for specific item
 *
 * @author Chattada Viriyaphap <chattada@uab.edu>
 */
public class TextField extends Fields {

  /**
   * Main method to display text for specific items
   *
   * @param name - type of text (String cvv, pin, card number, license number, etc)
   * @param value - value of notes (String number, text)
   */
  public TextField(String name, String value) {
    super(name, value); // calling name and value from superclass Fields
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
