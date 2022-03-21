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

  ArrayList<LockerItem> lockerItems;

  protected static long count = 100;
  private String uid;
  private String username;
  private String password;

  public Locker(String username, String password) {
    this.password = password;

    lockerItems = new ArrayList<>();
    this.username = username;
    this.uid = "" + ++count;
  }
}
