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

  public void add(LockerItem item) {
    if (this.isLocked == false) {
      this.lockerItems.add(item);
    } else {
      this.lockerItems = lockerItems;
    }
  }

  public void delete(LockerItem item) {
    try {
      if (this.isLocked == false) {
        this.lockerItems.remove(item);
      } else {
        this.lockerItems = lockerItems;
        throw new Exception();
      }
    } catch (Exception FailedDelteException) {
      System.out.println("Error: Failed to delete an item from locker.");
    }
  }

  public ArrayList<String> searchContains(String text) {
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
    try {
      for (var item : lockerItems) {
        if (item.get(uid).equals(uid)) {
          return item;
        }
      }
      throw new Exception();
    } catch (Exception FailedGetException) {
      System.out.println("Error: Failed to obtain an item using uid.");
      return null;
    }
  }

  public void set(String name, String value) {
    for (Fields setName : fieldsArrayList) {
      if ((setName.getName().equalsIgnoreCase(name)) == true) {
        setName.setValue(value);
      }
    }
  }
}
