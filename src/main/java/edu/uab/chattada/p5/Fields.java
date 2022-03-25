/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

/** */
public class Fields {

  protected static String name;
  protected static String value;
  protected static String type;

  boolean isNotSearchAble;

  public Fields(String name, String value) {
    this.name = name;
    this.value = value;
    //    this.type = type;
  }

  public String getName() {
    return name;
  }

  public String getValue() {
    return value;
  }

  //  public String getType() {
  //    return type;
  //  }

  public String get() {
    return value;
  }

  public String getUnmasked() {
    return value;
  }
}