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

    //    if ((name.equalsIgnoreCase("CVV: ")
    //        || (name.equalsIgnoreCase("PIN: ") || (name.equalsIgnoreCase("Card Number: "))))) {
    //      if (value != null) {
    //        for (int index = 0; index < value.length(); index++) {
    //          this.text += "*";
    //        }
    //      } else {
    //        this.text = text;
    //      }
    //    }
  }
}
