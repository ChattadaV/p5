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

  public ArrayList<String> searchContains(String text) {
    // find field in fields that has the name text
    // if successful return true
    // else false

    //    int index_1 = 0;
    //    int index_2 = 0;
    //    String contain = "";
    //
    //    while (index_1 < lockerItems.size()) {
    //      while (index_2 < lockerItems.get(index_1).getFields().size()) {
    //        if (lockerItems.get(index_1).get("Name: ").getValue().equalsIgnoreCase(text)) {
    //          contain = lockerItems.get(index_1).get("UID: ").getValue();
    //          uid.add(contain);
    //        }
    //      }
    //      index_1++;
    //    }
    //    return uid;

    ArrayList<String> uids = new ArrayList<String>();
    for (LockerItem Match : lockerItems) {
      if ((Match.get("Name: ").getValue().contains(text) == true)
          || (Match.get("Notes: ").getValue().contains(text) == true)
          || (Match.get("License Number: ").getValue().contains(text) == true)
          || (Match.get("Address: ").getValue().contains(text) == true)
          || (Match.get("DOB: ").getValue().contains(text) == true)
          || (Match.get("Issue Date: ").getValue().contains(text) == true)
          || (Match.get("Expiration Date: ").getValue().contains(text) == true)
          || (Match.get("SSID: ").getValue().contains(text) == true)
          || (Match.get("Network Type: ").getValue().contains(text) == true)
          || (Match.get("Password: ").getValue().contains(text) == true)
          || (Match.get("Hidden: ").getValue().contains(text) == true)
          || (Match.get("Card Number: ").getValue().contains(text) == true)
          || (Match.get("CVV: ").getValue().contains(text) == true)
          || (Match.get("PIN: ").getValue().contains(text) == true)
          || (Match.get("Zip Code: ").getValue().contains(text) == true)
          || (Match.get("Issuer Phone Number: ").getValue().contains(text) == true)) {
        uids.add(Match.get("UID: ").getValue());
      }
    }
    return uids;
  }

  public ArrayList<String> searchNameContains(String text) {
    //    for (Fields M : fieldsArrayList) {
    //      if (M.get().equalsIgnoreCase(text) == true) {
    //        match = true;
    //      }
    //    }
    //    return match;
    //  }

    ArrayList<String> uids = new ArrayList<String>();
    for (LockerItem Match : lockerItems) {
      if (Match.get("Name: ").getValue().contains(text) == true) {
        uids.add(Match.get("UID: ").getValue());
      }
    }
    return uids;
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

  public void delete(LockerItem item) {
    //
    //    if (isLocked == false) {
    //      int index_1 = 0;
    //      int index_2 = 0;
    //      boolean deletable = false;
    //
    //      while (index_1 < lockerItems.size()) {
    //        if (lockerItems.get(index_1).match(uid)) {
    //          index_2 = 1;
    //          deletable = true;
    //          break;
    //        }
    //        index_1++;
    //      }
    //
    //      if (deletable == true) {
    //        lockerItems.remove(index_2);
    //      }
    //    }

    if (this.isLocked == false) {
      this.lockerItems.remove(item);
    } else {
      this.lockerItems = lockerItems;
    }
  }
}
