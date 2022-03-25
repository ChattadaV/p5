/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

import java.util.ArrayList;
import java.lang.String;
import edu.uab.chattada.p5.Fields;

/** */
public abstract class LockerItem {

  private String uid;
  protected String name;
  protected String notes;
  protected String output;
  //
  //      private static final int max = 5;
  //
  //
  //          Field[] fields = new Field[max];
  //        fields[0] = new Field();
  //        fields[1] = new

  //    ArrayList<Fields> fields = new ArrayList<>();
  //    fields.add(new Fields(name, notes));

  public LockerItem(String name, String notes) {

    this.name = name;
    this.notes = notes;

    // build uid as textfield
    // add to fields
    // build name as textfield
    // add to fields
    // build notes as textfield
    // add to fields
  }

  public Fields get(String text) {
    // find field whose name is text
    // return field
    if (Fields.name.matches(text) == true) {
      return;
    } else {
      return null;
    }
  }

  public Fields getFields(String text) {
    // find field whose name is text
    // return field

    if (Fields.name.matches(text) == true) {
      return;
    } else {
      return null;
    }
  }

  public boolean matchName(String text) {
    // find field in fields that has the name text
    // if successful return true
    // else false
    if (Fields.name.matches(text) == true) {
      return true;
    } else {
      return false;
    }
  }

  public boolean match(String text) {
    if (Fields.name.matches(text) == true) {
      return true;
    } else {
      return false;
    }
  }

  public boolean contains(String text) {
    if (Fields.name.contains(text) == true) {
      return true;
    } else {
      return false;
    }
  }

  public Fields set(String text, String value) {
    //    Fields.name = text;
    //    Fields.value = value;
  }

  public String getDateCreated() {

    return null;
  }

  public String getDateLastChanged() {

    return null;
  }

  public String getDatesChanged() {

    return null;
  }

  public String getType() {

    return null;
  }

  public Fields delete(String text) {
    if (Fields.name.matches(text) == true) {
      output = Fields.name.replace(text, "");
    } else {
      output = null;
    }
    return output;
  }

  public boolean isDeleteable(String text) {

    return true;
  }
}