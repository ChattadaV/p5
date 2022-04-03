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

/**
 * Super abstract class LockerItem that contains all items in the locker
 *
 * @author Chattada Viriyaphap <chattada@uab.edu>
 */
public abstract class LockerItem {

  // set type
  protected String uid;
  protected String name;
  protected String notes;
  protected String output;
  protected String type;
  protected String dateCreated;
  protected String dateLastChanged;
  protected String datesChanged;
  protected boolean contain;
  protected boolean match;
  protected boolean matchName;
  protected static long count = 100;

  // ArrayList of fields of each locker item
  ArrayList<Fields> fieldsArrayList = new ArrayList<>();

  /**
   * Main method that stores each locker item's info as an ArrayList
   *
   * @param name - name of each locker item's info (credit card, driver license, wireless access
   *     points)
   * @param notes - optional notes of each locker item's info (credit card, driver license, wireless
   *     access points)
   */
  public LockerItem(String name, String notes) {
    this.name = name;
    this.notes = notes;
    this.type = type;
    this.output = output;
    this.dateCreated = dateCreated;
    this.dateLastChanged = dateLastChanged;
    this.datesChanged = datesChanged;
    this.uid = "" + ++count;
    this.contain = contain;
    this.match = match;
    this.matchName = matchName;

    // ArrayList of Fields of each locker item information
    fieldsArrayList.add(new NoteField("Notes: ", getNotes()));
    fieldsArrayList.add(new TextField("Name: ", getName()));
    fieldsArrayList.add(new TextField("Type: ", getType()));
    fieldsArrayList.add(new TextField("UID: ", getUid()));
    fieldsArrayList.add(new DateField("Date Created: ", getDateCreated()));
    fieldsArrayList.add(new DateField("Date Last Changed: ", getDateLastChanged()));
    fieldsArrayList.add(new DateField("Dates Changed: ", getDatesChanged()));
  }

  /**
   * get to get the position of where the input text is in the locker item's fields ArrayList
   *
   * @param text - String input text to search inside the locker item's fields ArrayList
   * @return Fields position of where the text is found
   */
  public Fields get(String text) {
    String output = "";
    Fields position = new Fields("", "");
    int index = 0;
    int foundIndex = 0;

    while (index < (this.fieldsArrayList.size())) {
      if (this.fieldsArrayList.get(index).name.equalsIgnoreCase(text) == true) {
        output = this.fieldsArrayList.get(index).value;
        foundIndex = index;
        break;
      }
      index++;
    }
    position = this.fieldsArrayList.get(foundIndex);
    return position;
  }

  /**
   * getNotes to get optional notes of locker item
   *
   * @return String notes of locker item
   */
  public String getNotes() {
    return notes;
  }

  /**
   * getName to get name of locker item
   *
   * @return String name of locker item
   */
  public String getName() {
    return name;
  }

  /**
   * getUid to get uid of locker item
   *
   * @return String uid of locker item
   */
  public String getUid() {
    return uid;
  }

  /**
   * getFields to get ArrayList of Fields of locker item
   *
   * @return ArrayList<Fields> of locker item
   */
  public ArrayList<Fields> getFields() {
    return fieldsArrayList;
  }

  /**
   * matchName to check if input text matches any name of stored locker item
   *
   * @param text - String input text used to search for the same name inside locker item
   * @return true if found. false if not found.
   */
  public boolean matchName(String text) {
    for (Fields MatchName : fieldsArrayList) {
      matchName = MatchName.getName().equalsIgnoreCase(text);
      if (matchName == true) {
        break;
      }
    }
    return matchName;
  }

  /**
   * match to check if input text matches any information of stored locker item
   *
   * @param text - String input text used to search for the same information inside locker item
   * @return true if found. false if not found.
   */
  public boolean match(String text) {
    for (Fields Match : fieldsArrayList) {
      if (Match.getValue() != null) {
        match = Match.getValue().equalsIgnoreCase(text);
        if (match == true) {
          break;
        }
      } else {
        break;
      }
    }
    return match;
  }

  /**
   * contain to check if any locker item contains the input text
   *
   * @param text - String input text used to search if any locker item contain the same text
   * @return true if any locker items contain the input text. false if none of locker items contain
   *     the input text
   */
  public boolean contain(String text) {
    contain = false;
    for (Fields Contains : fieldsArrayList) {
      if (Contains.getValue() != null) {
        contain = Contains.getValue().equalsIgnoreCase(text);
        if (contain == true) {
          break;
        }
      } else {
        break;
      }
    }
    return contain;
  }

  /**
   * set text and value of ArrayList fields of locker item
   *
   * @param text - String input text used to set ArrayList fields of locker item
   * @param value - String input value used to set ArrayList fields of locker item
   */
  public void set(String text, String value) {
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

  /**
   * getDateCreated to get the date that the locker item is created using Java Local Date and Time
   * library
   *
   * @return - String date that the locker item is created
   */
  public String getDateCreated() {
    return LocalDate.now().toString();
  }

  /**
   * getDateLastChanged to get the date that locker item is last modified
   *
   * @return String date that locker item is last modified
   */
  public String getDateLastChanged() {
    return dateLastChanged;
  }

  /**
   * getDatesChanged to get the list of dates that locker item is modified
   *
   * @return String list of dates that locker item is modified
   */
  public String getDatesChanged() {
    return datesChanged;
  }

  /**
   * getType to get the type of locker item
   *
   * @return String type of locker item (credit card, driver license, wireless access points, etc)
   */
  public String getType() {
    return type;
  }

  /**
   * delete to delete any locker item from locker system
   *
   * @param text - String input text used to delete any locker item that contains the same (name)
   *     text description (dob, expireDate, issueDate, card number, license number, etc)
   */
  public void delete(String text) {
    int index;
    index = 0;
    while (index < fieldsArrayList.size()) {
      if ((fieldsArrayList.get(index).getName().equalsIgnoreCase(text)) == true) {
        fieldsArrayList.remove(index);
      }
      index++;
    }
  }

  /**
   * set notes
   *
   * @param notes - String optional notes of locker items
   */
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * set name
   *
   * @param name - String name of locker items
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * set uid
   *
   * @param uid - String uid of locker items
   */
  public void setUid(String uid) {
    this.uid = uid;
  }

  /**
   * set ArrayList Fields
   *
   * @param fieldsArrayList - ArrayList<Fields> of locker items
   */
  public void setFields(ArrayList<Fields> fieldsArrayList) {
    this.fieldsArrayList = fieldsArrayList;
  }

  /**
   * set matchName
   *
   * @param matchName - boolean matchName of locker items
   */
  public void setMatchName(boolean matchName) {
    this.matchName = matchName;
  }

  /**
   * set match
   *
   * @param match - boolean match of locker items
   */
  public void setMatch(boolean match) {
    this.match = match;
  }

  /**
   * set contain
   *
   * @param contain - boolean contain of locker items
   */
  public void setContain(boolean contain) {
    this.contain = contain;
  }

  /**
   * set dateCreated
   *
   * @param dateCreated - String dateCreated of locker items
   */
  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * set dateLastChanged
   *
   * @param dateLastChanged - String dateLastChanged of locker items
   */
  public void setDateLastChanged(String dateLastChanged) {
    this.dateLastChanged = dateLastChanged;
  }

  /**
   * set datesChanged
   *
   * @param datesChanged - String datesChanged of locker items
   */
  public void setDatesChanged(String datesChanged) {
    this.datesChanged = datesChanged;
  }

  /**
   * set type
   *
   * @param type - String type of locker items
   */
  public void setType(String type) {
    this.type = type;
  }
}