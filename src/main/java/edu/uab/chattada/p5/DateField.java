/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

/**
 * Sub class DateField that can display name type (expiration date, issue date, etc) and value
 * (year, month, and day)
 *
 * @author Chattada Viriyaphap <chattada@uab.edu>
 */
public final class DateField extends Fields {

  /** set type of date */
  protected String date;

  /**
   * Main method to display name type (expiration date, issue date, etc) and value (year, month, and
   * day)
   *
   * @param name - type of date (String expiration date, issue date, date of birth, etc)
   * @param value - value of date (date in year, month, and day)
   */
  public DateField(String name, String value) {
    super(name, value); // calling name and value from superclass Fields
    type = "Date Field";
  }
}
