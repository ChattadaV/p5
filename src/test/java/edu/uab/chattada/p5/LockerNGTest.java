/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */
package edu.uab.chattada.p5;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/** */
public class LockerNGTest {

  private Locker lockerSystem;
  private LockerItem driverLicense;

  public LockerNGTest() {}

  @BeforeMethod
  public void setUpMethod() throws Exception {
    System.out.println("Name: Chattada Viriyaphap (Pi)");
    System.out.println("BlazerID: chattada");
    System.out.println("\n");

    System.out.println("Test: Locker");
    System.out.println("\n");

    lockerSystem = new Locker("Username123", "Password123");

    driverLicense =
        new DriverLicenseItem(
            "John Doe",
            "Driver License Info",
            1111,
            "123 Random St Birmingham, AL 12345",
            2001,
            1,
            1,
            2022,
            2,
            2,
            2023,
            3,
            3);
  }

  @AfterMethod
  public void tearDownMethod() throws Exception {}

  /** Test of lock method, of class Locker. */
  @Test
  public void testLock() {
    System.out.println("lock");

    Locker instance = lockerSystem;
    instance.lock();
    boolean expResult = true;
    boolean result = instance.isLocked;
    assertEquals(result, expResult);
  }

  /** Test of unlock method, of class Locker. */
  @Test
  public void testUnlock() {
    System.out.println("unlock");

    Locker instance = lockerSystem;
    instance.unlock("Username123", "Password123");
    boolean expResult = false;
    boolean result = instance.isLocked;
    assertEquals(result, expResult);
  }

  /** Test of add method, of class Locker. */
  @Test
  public void testAdd() {
    System.out.println("add");

    Locker instance = lockerSystem;
    instance.unlock("Username123", "Password123");
    instance.add(driverLicense);
  }

  /** Test of delete method, of class Locker. */
  @Test
  public void testDelete() {
    System.out.println("delete");

    Locker instance = lockerSystem;
    instance.unlock("Username123", "Password123");
    instance.delete(driverLicense);
  }

  /** Test of searchContains method, of class Locker. */
  @Test
  public void testSearchContains() {
    System.out.println("searchContains");

    Locker instance = lockerSystem;
    String text = "John Doe";
    ArrayList expResult = lockerSystem.searchContains(text);
    ArrayList result = instance.searchContains(text);
    assertEquals(result, expResult);
  }

  /** Test of searchNameContains method, of class Locker. */
  @Test
  public void testSearchNameContains() {
    System.out.println("searchNameContains");

    Locker instance = lockerSystem;
    String text = "John Doe";
    ArrayList expResult = lockerSystem.searchNameContains(text);
    ArrayList result = instance.searchNameContains(text);
    assertEquals(result, expResult);
  }

  /** Test of update method, of class Locker. */
  @Test
  public void testUpdate() {
    System.out.println("update");

    LockerItem item = driverLicense;
    Locker instance = lockerSystem;
    instance.update(item);
  }

  /** Test of get method, of class Locker. */
  @Test
  public void testGet() {
    System.out.println("get");

    Locker instance = lockerSystem;
    String uid = "1";
    LockerItem expResult = null;
    LockerItem result = instance.get(uid);
    assertEquals(result, expResult);
  }

  /** Test of set method, of class Locker. */
  @Test
  public void testSet() {
    System.out.println("set");

    String name = "Name: ";
    String value = "New Name";
    Locker instance = lockerSystem;
    instance.set(name, value);
  }
}