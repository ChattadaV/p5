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

  public Fields(String name, String value) {
    this.name = name;
    this.value = value;
    this.type = "Fields";
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

  public String getUnmasked() {
    if (isMasked() == true) {
      return text;
    } else {
      return value;
    }
  }

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

  public void setName(String name) {
    this.name = name;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setUnmasked(String value) {
    this.value = value;
  }
}