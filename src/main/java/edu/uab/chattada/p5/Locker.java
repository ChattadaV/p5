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

  protected static long count = 100;
  private String uid;
  private String username;
  private String password;
  private boolean isLocked;
  private String output;

  public Locker(String username, String password) {
    this.password = password;

    lockerItems = new ArrayList<>();
    this.username = username;
    this.uid = "" + ++count;
  }

  public boolean lock() {
    this.isLocked = true;
    return isLocked;
  }

  public boolean unlock(String password) {
    if (this.password.matches(password) == true) {
      this.isLocked = false;
    } else {
      this.isLocked = true;
    }
    return isLocked;
  }

  public boolean isValid() {
    boolean result;
    if (output != password) {
      result = false;
    } else {
      result = true;
    }
    return result;
  }
}
