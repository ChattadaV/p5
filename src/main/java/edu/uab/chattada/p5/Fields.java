/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

/**
 * Super class Fields that stores name and value of certain items and can be accessed by other
 * classes
 *
 * @author Chattada Viriyaphap <chattada@uab.edu>
 */
public class Fields {

  // set type
  protected String name;
  protected String value;
  protected String type;
  protected String text;

  /**
   * Main method to store name and value of certain item that can be accessed by other classes
   *
   * @param name - name of an item (type, specific item description, etc)
   * @param value - value of an item (text, date, number, etc)
   */
  public Fields(String name, String value) {
    this.name = name;
    this.value = value;
    this.type = "Fields";
  }

  /**
   * getName() to get the name of an item
   *
   * @return String name of an item (type, specific item description, etc)
   */
  public String getName() {
    return name;
  }

  /**
   * getValue to get the value of an item
   *
   * @return String value of an item (text, date, number, etc)
   */
  public String getValue() {
    return value;
  }

  /**
   * getType to get type of an item
   *
   * @return String type of an item (credit card, driver license, wireless access points, etc)
   */
  public String getType() {
    return type;
  }

  /**
   * getUnmasked to unmask any masked confidential info (work in progress)
   *
   * @return String unmasked text of any confidential info (pin, cvv, password, credit card number,
   *     etc)
   */
  public String getUnmasked() {
    if (isMasked() == true) {
      return text;
    } else {
      return value;
    }
  }

  /**
   * isMasked to check if the item is masked because it is considered confidential (work in
   * progress)
   *
   * @return true if masked. False if not masked.
   */
  public boolean isMasked() {
    if (this.text.isEmpty()) {
      return false;
    } else {
      return true;
    }
  }

  //  public boolean isType(String type) {
  //    return this.type.equals(type);
  //  }

  /**
   * set name
   *
   * @param name - name of an item (type, specific item description, etc)
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * set value
   *
   * @param value - value of an item (text, date, number, etc)
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * set type
   *
   * @param type - type of an item (credit card, driver license, wireless access points, etc)
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * set unmasked
   *
   * @param value - unmasked confidential information item
   */
  public void setUnmasked(String value) {
    this.value = value;
  }
}