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
import java.time.LocalDate;

/** */
public abstract class LockerItem {

  private String uid;
  protected String name;
  protected String notes;
  protected String output;
  protected String type;
  protected String dateCreated;
  protected String dateLastChanged;
  protected String datesChanged;
  //
  //      private static final int max = 5;
  //
  //
  //          Field[] fields = new Field[max];
  //        fields[0] = new Field();
  //        fields[1] = new

  ArrayList<Fields> fieldsArrayList = new ArrayList<>();
  //    fields.add(new Fields(name, notes));

  public LockerItem(String name, String notes) {

    this.name = name;
    this.notes = notes;
    this.type = type;
    this.output = output;
    this.dateCreated = dateCreated;
    this.dateLastChanged = dateLastChanged;
    this.datesChanged = datesChanged;

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

    String result = "";
    Fields empty = new Fields("", "");
    int index = 0;
    int foundIndex = 0;

    while (index < (this.fieldsArrayList.size())) {
      if (this.fieldsArrayList.get(index).name.equalsIgnoreCase(text) == true) {
        result = this.fieldsArrayList.get(index).value;
        foundIndex = index;
        break;
      }
      index++;
    }
    empty = this.fieldsArrayList.get(foundIndex);
    return empty;

    //    if (Fields.name.matches(text) == true) {
    //      return;
    //    } else {
    //      return null;

  }

  public ArrayList<Fields> getFields() {
    // find field whose name is text
    // return field
    return fieldsArrayList;

    //    if (Fields.name.matches(text) == true) {
    //      return;
    //    } else {
    //      return null;
    //    }
  }

  public boolean matchName(String text) {
    // find field in fields that has the name text
    // if successful return true
    // else false
    //
    //    if (Fields.name.matches(text) == true) {
    //      return true;
    //    } else {
    //      return false;

    boolean match = false;
    for (Fields M : fieldsArrayList) {
      if (M.getName().equalsIgnoreCase(text) == true) {
        match = true;
      }
    }
    return match;
  }

  public boolean match(String text) {
    //    if (Fields.name.matches(text) == true) {
    //      return true;
    //    } else {
    //      return false;
    //    }

    boolean match = false;
    for (Fields M : fieldsArrayList) {
      if (M.get().equalsIgnoreCase(text) == true) {
        match = true;
      }
    }
    return match;
  }

  public boolean contains(String text) {
    //    if (Fields.name.contains(text) == true) {
    //      return true;
    //    } else {
    //      return false;
    //    }

    boolean contain = false;
    for (Fields C : fieldsArrayList) {
      if (C.get().contains(text)) {
        contain = true;
      }
    }
    return contain;
  }

  public void set(String text, String value) {
    //    Fields.name = text;
    //    Fields.value = value;

    String result = "";
    int index;
    index = 0;
    while (index < (this.fieldsArrayList.size())) {
      if (this.fieldsArrayList.get(index).name.equalsIgnoreCase(text) == true) {
        this.fieldsArrayList.set(index, new TextField(text, value));
        break;
      }
      index++;
    }
  }

  public String getDateCreated() {
    return LocalDate.now().toString();
  }

  public String getDateLastChanged() {
    return dateLastChanged;
  }

  public String getDatesChanged() {
    return datesChanged;
  }

  public String getType() {
    return type;
  }

  public void delete(String text) {
    //    if (Fields.name.matches(text) == true) {
    //      output = Fields.name.replace(text, "");
    //    } else {
    //      output = null;
    //    }
    //    return output;

    int index;
    index = 0;
    while (index > fieldsArrayList.size()) {
      if (fieldsArrayList.get(index).getName().equalsIgnoreCase(text)) {
        fieldsArrayList.remove(index);
      }
      index++;
    }
  }

  public boolean isDeleteable(String text) {

    return true;
  }
}