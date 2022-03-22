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
    return null;
  }

  boolean matchName(String text) {
    // find field in fields that has the name text
    // if successful return true
    // else false
    return true;
  }
}