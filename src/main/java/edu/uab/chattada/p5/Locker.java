/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

import java.util.ArrayList;

/** */
public class Locker {

  ArrayList<LockerItem> lockerItems = new ArrayList<>();
  ArrayList<Fields> fieldsArrayList = new ArrayList<>();
  ArrayList<String> uid = new ArrayList<>();

  protected static long count = 100;
  //  private String uid;
  private String username;
  private String password;
  private boolean isLocked;
  private boolean match;
  private String output;

  public Locker(String username, String password) {
    this.password = password;

    lockerItems = new ArrayList<>();
    this.username = username;
    //    this.uid = "" + ++count;
  }

  public void lock() {
    this.isLocked = true;
  }

  public void unlock(String password) {
    if (this.password.matches(password) == true) {
      this.isLocked = false;
    } else {
      this.isLocked = true;
    }
  }

  public void isValid() {
    boolean result;
    if (output != password) {
      result = false;
    } else {
      result = true;
    }
  }

  public void add(LockerItem item) {
    if (this.isLocked == false) {
      this.lockerItems.add(item);
    }
  }

  public boolean searchContains(String text) {
    // find field in fields that has the name text
    // if successful return true
    // else false
    for (Fields M : fieldsArrayList) {
      if (M.getName().contains(text) == true) {
        match = true;
      }
    }
    return match;
  }

  public ArrayList<String> searchNameContains(String text) {
    //    for (Fields M : fieldsArrayList) {
    //      if (M.get().equalsIgnoreCase(text) == true) {
    //        match = true;
    //      }
    //    }
    //    return match;
    //  }

    int i = 0;
    int index = 0;
    String contain = "";

    while (i < lockerItems.size()) {
      while (index < lockerItems.get(i).getFields().size()) {
        if (lockerItems.get(i).get("Name: ").get().equalsIgnoreCase(text)) {
          contain = lockerItems.get(i).get("UID: ").get();
          uid.add(contain);
        }
      }
      i++;
    }
    return uid;
  }

  public update(lockerItems lockerItems) {
    String result;

    this.lockerItems = lockerItems;
  }
}
