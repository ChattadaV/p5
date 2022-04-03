/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

import java.util.ArrayList;

/**
 * Super class Locker that controls how locker system operates
 *
 * @author Chattada Viriyaphap <chattada@uab.edu>
 */
public class Locker {

  // ArrayList of different type of information inside locker system
  ArrayList<LockerItem> lockerItems = new ArrayList<>();
  ArrayList<Fields> fieldsArrayList = new ArrayList<>();
  ArrayList<String> uid = new ArrayList<>();
  ArrayList<Locker> lockerArrayList = new ArrayList<>();

  /** set type of count */
  protected static long count = 100;
  /** set type of username */
  protected String username;
  /** set type of password */
  protected String password;
  /** set type of isLocked */
  protected boolean isLocked;
  /** set type of match */
  protected boolean match;
  /** set type of output */
  protected String output;

  /**
   * Main method to store information of locker system
   *
   * @param username - String username (used to access locker system)
   * @param password - String password (used to access locker system)
   */
  public Locker(String username, String password) {
    this.username = username;
    this.password = password;
  }

  /** lock to lock the locker system */
  public void lock() {
    this.isLocked = true;
  }

  /**
   * unlock to unlock the locker system using username and password as parameters
   *
   * @param username - String username (used to access locker system)
   * @param password - String password (used to access locker system)
   */
  public void unlock(String username, String password) {
    try {
      if ((this.password.matches(password) == true) && (this.username.matches(username) == true)) {
        this.isLocked = false;
      } else {
        this.isLocked = true;
        throw new Exception();
      }
    } catch (Exception FailedUnlockException) {
      System.out.println("Error: Incorrect Username and/or Password.");
    }
  }

  /**
   * add to add any item to the locker system
   *
   * @param item - LockerItem item (driver license, credit card, wireless access points, etc)
   */
  public void add(LockerItem item) {
    if (this.isLocked == false) {
      this.lockerItems.add(item);
    } else {
      this.lockerItems = lockerItems;
    }
  }

  /**
   * delete to delete any item from locker system
   *
   * @param item - LockerItem item (driver license, credit card, wireless access points, etc)
   */
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

  /**
   * searchContains to get the ArrayList of uids where input text is found inside locker system
   *
   * @param text - String input text used to search through all locker items inside locker system
   * @return ArrayList of String of uids where the input text is found inside locker system
   */
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

  /**
   * searchNameContains to get the ArrayList of uids where input text is found as locker item's name
   * inside locker system
   *
   * @param text - String input text used to search through all locker items' name inside locker
   *     system
   * @return ArrayList of String of uids where the input text is found inside locker system
   */
  public ArrayList<String> searchNameContains(String text) {
    ArrayList<String> uids = new ArrayList<String>();
    for (LockerItem Match : lockerItems) {
      if (Match.get("Name: ").getValue().contains(text) == true) {
        uids.add(Match.get("UID: ").getValue());
      }
    }
    return uids;
  }

  /**
   * update to update the locker system (remove old info and add new info)
   *
   * @param item - input LockerItem item to be updated (remove old info and add new info)
   */
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

  /**
   * get to get the item that matches input uid
   *
   * @param uid - String input uid used to search for item inside locker system
   * @return LockerItem item inside locker system that matches input uid
   */
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

  /**
   * set to set name and value of ArrayList of Fields inside locker system
   *
   * @param name - String input name of locker system
   * @param value - String input value of locker system
   */
  public void set(String name, String value) {
    for (Fields setName : fieldsArrayList) {
      if ((setName.getName().equalsIgnoreCase(name)) == true) {
        setName.setValue(value);
      }
    }
  }
}
