/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

/** */
public class Fields extends LockerItem {

  private String name;
  private String value;
  private String type;

  boolean isNotSearchAble;

  public Fields(String name, String value, String type) {
    this.name = name;
    this.value = value;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public String get() {
    return value;
  }

  public String getUnmasked() {
    return value;
  }
}
