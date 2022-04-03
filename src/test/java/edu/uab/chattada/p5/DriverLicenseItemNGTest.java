/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */
package edu.uab.chattada.p5;

import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * NG Unit Test for subclass DriverLicenseItem of superclass LockerItem
 *
 * @author Chattada Viriyaphap <chattada@uab.edu>
 */
public class DriverLicenseItemNGTest {

  /** set type of successful */
  private DriverLicenseItem successful;
  /** set type of error */
  private DriverLicenseItem error;

  /** Main method to create driver license item */
  public DriverLicenseItemNGTest() {}

  /**
   * set up initial variables before executing
   *
   * @throws Exception
   */
  @BeforeMethod
  public void setUpMethod() throws Exception {
    System.out.println("Name: Chattada Viriyaphap (Pi)");
    System.out.println("BlazerID: chattada");
    System.out.println("\n");

    System.out.println("Test: DriverLicenseItem");
    System.out.println("\n");

    successful =
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
    //    System.out.println(successful);

    error =
        new DriverLicenseItem(
            "",
            "Driver License Info",
            1,
            "123 Random St Birmingham, XX 12345",
            2001,
            1,
            1,
            2022,
            2,
            2,
            2023,
            3,
            3);
    //    System.out.println(error);
  }

  /**
   * tear down initial variables after executing (none)
   *
   * @throws Exception
   */
  @AfterMethod
  public void tearDownMethod() throws Exception {}

  /** Test of toString method, of class DriverLicenseItem. */
  @Test
  public void testToString() {
    System.out.println("toString");

    DriverLicenseItem instance_1 = successful;
    String expResult_1 =
        "Notes: Driver License Info\n"
            + "License Number: 1111\n"
            + "Name: John Doe\n"
            + "Address: 123 Random St Birmingham, AL 12345\n"
            + "DOB: 2001-01-01\n"
            + "Issue Date: 2022-02-02\n"
            + "Expiration Date: 2023-03-03\n"
            + "UID: "
            + instance_1.getUid()
            + "\n\n";
    String result_1 = instance_1.toString();
    assertEquals(result_1, expResult_1);

    DriverLicenseItem instance_2 = error;
    String expResult_2 =
        "Notes: Driver License Info\n"
            + "License Number: 1\n"
            + "Name: null\n"
            + "Address: null\n"
            + "DOB: 2001-01-01\n"
            + "Issue Date: 2022-02-02\n"
            + "Expiration Date: 2023-03-03\n"
            + "UID: "
            + instance_2.getUid()
            + "\n\n";
    String result_2 = instance_2.toString();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getNotes method, of class DriverLicenseItem. */
  @Test
  public void testGetNotes() {
    System.out.println("getNotes");

    DriverLicenseItem instance_1 = successful;
    String expResult_1 = "Driver License Info";
    String result_1 = instance_1.getNotes();
    assertEquals(result_1, expResult_1);

    DriverLicenseItem instance_2 = error;
    String expResult_2 = "Driver License Info";
    String result_2 = instance_2.getNotes();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getName method, of class DriverLicenseItem. */
  @Test
  public void testGetName() {
    System.out.println("getName");

    DriverLicenseItem instance_1 = successful;
    String expResult_1 = "John Doe";
    String result_1 = instance_1.getName();
    assertEquals(result_1, expResult_1);

    DriverLicenseItem instance_2 = error;
    String expResult_2 = null;
    String result_2 = instance_2.getName();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getLicenseNumber method, of class DriverLicenseItem. */
  @Test
  public void testGetLicenseNumber() {
    System.out.println("getLicenseNumber");

    DriverLicenseItem instance_1 = successful;
    String expResult_1 = "1111";
    String result_1 = instance_1.getLicenseNumber();
    assertEquals(result_1, expResult_1);

    DriverLicenseItem instance_2 = error;
    String expResult_2 = "1";
    String result_2 = instance_2.getLicenseNumber();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getAddress method, of class DriverLicenseItem. */
  @Test
  public void testGetAddress() {
    System.out.println("getAddress");

    DriverLicenseItem instance_1 = successful;
    String expResult_1 = "123 Random St Birmingham, AL 12345";
    String result_1 = instance_1.getAddress();
    assertEquals(result_1, expResult_1);

    DriverLicenseItem instance_2 = error;
    String expResult_2 = null;
    String result_2 = instance_2.getAddress();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getDob method, of class DriverLicenseItem. */
  @Test
  public void testGetDob() {
    System.out.println("getDob");

    DriverLicenseItem instance_1 = successful;
    String expResult_1 = "2001-01-01";
    String result_1 = instance_1.getDob();
    assertEquals(result_1, expResult_1);

    DriverLicenseItem instance_2 = error;
    String expResult_2 = "2001-01-01";
    String result_2 = instance_2.getDob();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getIssueDate method, of class DriverLicenseItem. */
  @Test
  public void testGetIssueDate() {
    System.out.println("getIssueDate");

    DriverLicenseItem instance_1 = successful;
    String expResult_1 = "2022-02-02";
    String result_1 = instance_1.getIssueDate();
    assertEquals(result_1, expResult_1);

    DriverLicenseItem instance_2 = error;
    String expResult_2 = "2022-02-02";
    String result_2 = instance_2.getIssueDate();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getExpireDate method, of class DriverLicenseItem. */
  @Test
  public void testGetExpireDate() {
    System.out.println("getExpireDate");

    DriverLicenseItem instance_1 = successful;
    String expResult_1 = "2023-03-03";
    String result_1 = instance_1.getExpireDate();
    assertEquals(result_1, expResult_1);

    DriverLicenseItem instance_2 = error;
    String expResult_2 = "2023-03-03";
    String result_2 = instance_2.getExpireDate();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidLicenseNumber method, of class DriverLicenseItem. */
  @Test
  public void testIsValidLicenseNumber() {
    System.out.println("isValidLicenseNumber");

    DriverLicenseItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidLicenseNumber();
    assertEquals(result_1, expResult_1);

    DriverLicenseItem instance_2 = error;
    boolean expResult_2 = true;
    boolean result_2 = instance_2.isValidLicenseNumber();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidName method, of class DriverLicenseItem. */
  @Test
  public void testIsValidName() {
    System.out.println("isValidName");

    DriverLicenseItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidName();
    assertEquals(result_1, expResult_1);

    DriverLicenseItem instance_2 = error;
    boolean expResult_2 = false;
    boolean result_2 = instance_2.isValidName();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidDob method, of class DriverLicenseItem. */
  @Test
  public void testIsValidDob() {
    System.out.println("isValidDob");

    DriverLicenseItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidDob();
    assertEquals(result_1, expResult_1);

    DriverLicenseItem instance_2 = error;
    boolean expResult_2 = true;
    boolean result_2 = instance_2.isValidDob();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidIssueDate method, of class DriverLicenseItem. */
  @Test
  public void testIsValidIssueDate() {
    System.out.println("isValidIssueDate");

    DriverLicenseItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidIssueDate();
    assertEquals(result_1, expResult_1);

    DriverLicenseItem instance_2 = error;
    boolean expResult_2 = true;
    boolean result_2 = instance_2.isValidIssueDate();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidExpireDate method, of class DriverLicenseItem. */
  @Test
  public void testIsValidExpireDate() {
    System.out.println("isValidExpireDate");

    DriverLicenseItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidExpireDate();
    assertEquals(result_1, expResult_1);

    DriverLicenseItem instance_2 = error;
    boolean expResult_2 = true;
    boolean result_2 = instance_2.isValidExpireDate();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidAddress method, of class DriverLicenseItem. */
  @Test
  public void testIsValidAddress() {
    System.out.println("isValidAddress");

    DriverLicenseItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidAddress();
    assertEquals(result_1, expResult_1);

    DriverLicenseItem instance_2 = error;
    boolean expResult_2 = false;
    boolean result_2 = instance_2.isValidAddress();
    assertEquals(result_2, expResult_2);
  }

  /** Test of setNotes method, of class DriverLicenseItem. */
  @Test
  public void testSetNotes() {
    System.out.println("setNotes");

    DriverLicenseItem instance_1 = successful;
    String notes_1 = instance_1.notes;
    instance_1.setNotes(notes_1);

    DriverLicenseItem instance_2 = error;
    String notes_2 = instance_2.notes;
    instance_2.setNotes(notes_2);
  }

  /** Test of setLicenseNumber method, of class DriverLicenseItem. */
  @Test
  public void testSetLicenseNumber() {
    System.out.println("setLicenseNumber");

    DriverLicenseItem instance_1 = successful;
    int licenseNumber_1 = Integer.valueOf(instance_1.licenseNumber);
    instance_1.setLicenseNumber(licenseNumber_1);

    DriverLicenseItem instance_2 = error;
    int licenseNumber_2 = Integer.valueOf(instance_2.licenseNumber);
    instance_2.setLicenseNumber(licenseNumber_2);
  }

  /** Test of setName method, of class DriverLicenseItem. */
  @Test
  public void testSetName() {
    System.out.println("setName");

    DriverLicenseItem instance_1 = successful;
    String name_1 = instance_1.name;
    instance_1.setName(name_1);

    DriverLicenseItem instance_2 = error;
    String name_2 = instance_2.name;
    instance_2.setName(name_2);
  }

  /** Test of setAddress method, of class DriverLicenseItem. */
  @Test
  public void testSetAddress() {
    System.out.println("setAddress");

    DriverLicenseItem instance_1 = successful;
    String address_1 = instance_1.address;
    instance_1.setAddress(address_1);

    DriverLicenseItem instance_2 = error;
    String address_2 = instance_2.address;
    instance_2.setAddress(address_2);
  }

  /** Test of setDob method, of class DriverLicenseItem. */
  @Test
  public void testSetDob() {
    System.out.println("setDob");

    DriverLicenseItem instance_1 = successful;
    String dob_1 = instance_1.dob;
    instance_1.setDob(dob_1);

    DriverLicenseItem instance_2 = error;
    String dob_2 = instance_2.dob;
    instance_2.setDob(dob_2);
  }

  /** Test of setIssueDate method, of class DriverLicenseItem. */
  @Test
  public void testSetIssueDate() {
    System.out.println("setIssueDate");

    DriverLicenseItem instance_1 = successful;
    String issueDate_1 = instance_1.issueDate;
    instance_1.setIssueDate(issueDate_1);

    DriverLicenseItem instance_2 = error;
    String issueDate_2 = instance_2.issueDate;
    instance_2.setIssueDate(issueDate_2);
  }

  /** Test of setExpireDate method, of class DriverLicenseItem. */
  @Test
  public void testSetExpireDate() {
    System.out.println("setExpireDate");

    DriverLicenseItem instance_1 = successful;
    String expireDate_1 = instance_1.expireDate;
    instance_1.setExpireDate(expireDate_1);

    DriverLicenseItem instance_2 = error;
    String expireDate_2 = instance_2.expireDate;
    instance_2.setExpireDate(expireDate_2);
  }
}