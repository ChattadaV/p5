/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

/** */
public class Fields {

  protected String name;
  protected String value;
  protected String type;
  protected String text;

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

  public String getType() {
    return type;
  }

  //  public String get() {
  //    return value;
  //  }

  public String getUnmasked() {
    return value;
  }

  public boolean isType(String type) {
    return this.type.equals(type);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void setType(String type) {
    this.type = type;
  }
}