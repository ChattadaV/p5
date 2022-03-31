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
  ArrayList<Locker> lockerArrayList = new ArrayList<>();

  protected static long count = 100;
  //  private String uid;
  protected String username;
  protected String password;
  protected boolean isLocked;
  protected boolean match;
  protected String output;

  public Locker(String username, String password) {
    this.username = username;
    this.password = password;

    lockerItems = new ArrayList<>();
    //    this.uid = "" + ++count;

  }

  public void lock() {
    this.isLocked = true;
  }

  public void unlock(String password) {
    try {
      if (this.password.matches(password) == true) {
        this.isLocked = false;
      } else {
        this.isLocked = true;
        throw new Exception();
      }
    } catch (Exception FailedUnlockException) {
      System.out.println("Error: Incorrect Password.");
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
    } else {
      this.lockerItems = lockerItems;
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

    int index_1 = 0;
    int index_2 = 0;
    String contain = "";

    while (index_1 < lockerItems.size()) {
      while (index_2 < lockerItems.get(index_1).getFields().size()) {
        if (lockerItems.get(index_1).get("Name: ").getValue().equalsIgnoreCase(text)) {
          contain = lockerItems.get(index_1).get("UID: ").getValue();
          uid.add(contain);
        }
      }
      index_1++;
    }
    return uid;
  }

  public void update(LockerItem item) {
    for (LockerItem update : lockerItems) {
      try {
        if (update.uid.equals(item.uid)) {
          lockerItems.remove(item);
          lockerItems.add(update);
        } else {
          throw new Exception();
        }
      } catch (Exception FailedUpdateException) {
        System.out.println("Error: Failed to update locker system.");
      }
    }
  }

  public LockerItem get(String uid) {
    for (var item : lockerItems) {
      if (item.get(uid).equals(uid)) {
        return item;
      }
    }
    return null;
  }

  public void delete(String uid) {
    if (isLocked == false) {
      int index_1 = 0;
      int index_2 = 0;
      boolean deletable = false;

      while (index_1 < lockerItems.size()) {
        if (lockerItems.get(index_1).match(uid)) {
          index_2 = 1;
          deletable = true;
          break;
        }
        index_1++;
      }

      if (deletable == true) {
        lockerItems.remove(index_2);
      }
    }
  }

  @Override
  public String toString() {
    output = "";
    for (var toString : lockerArrayList) {
      output += toString.getName() + toString.getValue() + "\n";
    }
    output +=
        "=========================================================================================\n";

    return output;
  }
}
