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
public class LockerItemNGTest {

  private LockerItem successful_01;
  private LockerItem successful_02;
  private LockerItem successful_03;
  private LockerItem error_01;
  private LockerItem error_02;
  private LockerItem error_03;

  ArrayList<LockerItem> testArrayList = new ArrayList<>();

  public LockerItemNGTest() {}

  @BeforeMethod
  public void setUpMethod() throws Exception {
    successful_01 =
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
    System.out.println(successful_01);

    successful_02 =
        new WirelessAccessPointsItem(
            "UAB Wifi",
            "Wireless Access Points Info",
            "UABSECURED",
            "WPA/WPA2",
            "GoBlazers",
            "Yes");
    //    System.out.println(successful_02);

    successful_03 =
        new CreditCardItem(
            "John S. Doe",
            "Credit Card Info",
            1111,
            2222,
            3333,
            4444,
            2030,
            12,
            1,
            555,
            123,
            99999,
            1111111111);
    //    System.out.println(successful_03);

    error_01 =
        new DriverLicenseItem(
            "",
            "Driver License Info",
            00001,
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
    //    System.out.println(error_01);

    error_02 =
        new WirelessAccessPointsItem(
            "", "Wireless Access Points Info", "", "non-sense", "GoBlazer!", "No");
    //    System.out.println(error_02);

    error_03 =
        new CreditCardItem(
            "",
            "Credit Card Info",
            1111,
            2222,
            3333,
            44445,
            2030,
            12,
            1,
            555,
            11111,
            123456,
            1111111111);
    //    System.out.println(error_03);

    testArrayList.add(successful_01);
    testArrayList.add(successful_02);
    testArrayList.add(successful_03);
    testArrayList.add(error_01);
    testArrayList.add(error_02);
    testArrayList.add(error_03);
  }

  @AfterMethod
  public void tearDownMethod() throws Exception {}

  /** Test of get method, of class LockerItem. */
  @Test
  public void testGet() {
    System.out.println("get");

    LockerItem instance_1 = successful_01;
    String expResult_1 = "John Doe";
    String result_1 = instance_1.get("Name: ").getValue();
    assertEquals(result_1, expResult_1);

    LockerItem instance_2 = successful_02;
    String expResult_2 = "UAB Wifi";
    String result_2 = instance_2.get("Name: ").getValue();
    assertEquals(result_2, expResult_2);

    LockerItem instance_3 = successful_03;
    String expResult_3 = "John S. Doe";
    String result_3 = instance_3.get("Name: ").getValue();
    assertEquals(result_3, expResult_3);

    LockerItem instance_4 = error_01;
    String expResult_4 = null;
    String result_4 = instance_4.get("Name: ").getValue();
    assertEquals(result_4, expResult_4);

    LockerItem instance_5 = error_02;
    String expResult_5 = null;
    String result_5 = instance_5.get("Name: ").getValue();
    assertEquals(result_5, expResult_5);

    LockerItem instance_6 = error_03;
    String expResult_6 = null;
    String result_6 = instance_6.get("Name: ").getValue();
    assertEquals(result_6, expResult_6);
  }

  /** Test of getNotes method, of class LockerItem. */
  @Test
  public void testGetNotes() {
    System.out.println("getNotes");

    LockerItem instance_1 = successful_01;
    String expResult_1 = "Driver License Info";
    String result_1 = instance_1.getNotes();
    assertEquals(result_1, expResult_1);

    LockerItem instance_2 = successful_02;
    String expResult_2 = "Wireless Access Points Info";
    String result_2 = instance_2.getNotes();
    assertEquals(result_2, expResult_2);

    LockerItem instance_3 = successful_03;
    String expResult_3 = "Credit Card Info";
    String result_3 = instance_3.getNotes();
    assertEquals(result_3, expResult_3);

    LockerItem instance_4 = error_01;
    String expResult_4 = "Driver License Info";
    String result_4 = instance_4.getNotes();
    assertEquals(result_4, expResult_4);

    LockerItem instance_5 = error_02;
    String expResult_5 = "Wireless Access Points Info";
    String result_5 = instance_5.getNotes();
    assertEquals(result_5, expResult_5);

    LockerItem instance_6 = error_03;
    String expResult_6 = "Credit Card Info";
    String result_6 = instance_6.getNotes();
    assertEquals(result_6, expResult_6);
  }

  /** Test of getName method, of class LockerItem. */
  @Test
  public void testGetName() {
    System.out.println("getName");

    LockerItem instance_1 = successful_01;
    String expResult_1 = "John Doe";
    String result_1 = instance_1.getName();
    assertEquals(result_1, expResult_1);

    LockerItem instance_2 = successful_02;
    String expResult_2 = "UAB Wifi";
    String result_2 = instance_2.getName();
    assertEquals(result_2, expResult_2);

    LockerItem instance_3 = successful_03;
    String expResult_3 = "John S. Doe";
    String result_3 = instance_3.getName();
    assertEquals(result_3, expResult_3);

    LockerItem instance_4 = error_01;
    String expResult_4 = null;
    String result_4 = instance_4.getName();
    assertEquals(result_4, expResult_4);

    LockerItem instance_5 = error_02;
    String expResult_5 = null;
    String result_5 = instance_5.getName();
    assertEquals(result_5, expResult_5);

    LockerItem instance_6 = error_03;
    String expResult_6 = null;
    String result_6 = instance_6.getName();
    assertEquals(result_6, expResult_6);
  }

  /** Test of getUid method, of class LockerItem. */
  @Test
  public void testGetUid() {
    System.out.println("getUid");

    LockerItem instance_1 = successful_01;
    String expResult_1 = successful_01.getUid();
    String result_1 = instance_1.getUid();
    assertEquals(result_1, expResult_1);

    LockerItem instance_2 = successful_02;
    String expResult_2 = successful_02.getUid();
    String result_2 = instance_2.getUid();
    assertEquals(result_2, expResult_2);

    LockerItem instance_3 = successful_03;
    String expResult_3 = successful_03.getUid();
    String result_3 = instance_3.getUid();
    assertEquals(result_3, expResult_3);

    LockerItem instance_4 = error_01;
    String expResult_4 = error_01.getUid();
    String result_4 = instance_4.getUid();
    assertEquals(result_4, expResult_4);

    LockerItem instance_5 = error_02;
    String expResult_5 = error_02.getUid();
    String result_5 = instance_5.getUid();
    assertEquals(result_5, expResult_5);

    LockerItem instance_6 = error_03;
    String expResult_6 = error_03.getUid();
    String result_6 = instance_6.getUid();
    assertEquals(result_6, expResult_6);
  }

  /** Test of getFields method, of class LockerItem. */
  @Test
  public void testGetFields() {
    System.out.println("getFields");

    LockerItem instance_1 = successful_01;
    ArrayList expResult_1 = instance_1.fieldsArrayList;
    ArrayList result_1 = instance_1.getFields();
    assertEquals(result_1, expResult_1);

    LockerItem instance_2 = successful_02;
    ArrayList expResult_2 = instance_2.fieldsArrayList;
    ArrayList result_2 = instance_2.getFields();
    assertEquals(result_2, expResult_2);

    LockerItem instance_3 = successful_03;
    ArrayList expResult_3 = instance_3.fieldsArrayList;
    ArrayList result_3 = instance_3.getFields();
    assertEquals(result_3, expResult_3);

    LockerItem instance_4 = error_01;
    ArrayList expResult_4 = instance_4.fieldsArrayList;
    ArrayList result_4 = instance_4.getFields();
    assertEquals(result_4, expResult_4);

    LockerItem instance_5 = error_02;
    ArrayList expResult_5 = instance_5.fieldsArrayList;
    ArrayList result_5 = instance_5.getFields();
    assertEquals(result_5, expResult_5);

    LockerItem instance_6 = error_03;
    ArrayList expResult_6 = instance_6.fieldsArrayList;
    ArrayList result_6 = instance_6.getFields();
    assertEquals(result_6, expResult_6);
  }

  /** Test of matchName method, of class LockerItem. */
  @Test
  public void testMatchName() {
    System.out.println("matchName");

    LockerItem instance_1 = successful_01;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.matchName("Name: ");
    assertEquals(result_1, expResult_1);

    LockerItem instance_2 = successful_02;
    boolean expResult_2 = true;
    boolean result_2 = instance_2.matchName("Name: ");
    assertEquals(result_2, expResult_2);

    LockerItem instance_3 = successful_03;
    boolean expResult_3 = true;
    boolean result_3 = instance_3.matchName("Name: ");
    assertEquals(result_3, expResult_3);

    LockerItem instance_4 = error_01;
    boolean expResult_4 = true;
    boolean result_4 = instance_4.matchName("Name: ");
    assertEquals(result_4, expResult_4);

    LockerItem instance_5 = error_02;
    boolean expResult_5 = true;
    boolean result_5 = instance_5.matchName("Name: ");
    assertEquals(result_5, expResult_5);

    LockerItem instance_6 = error_03;
    boolean expResult_6 = true;
    boolean result_6 = instance_6.matchName("Name: ");
    assertEquals(result_6, expResult_6);
  }

  /** Test of match method, of class LockerItem. */
  @Test
  public void testMatch() {
    System.out.println("match");

    LockerItem instance_1 = successful_01;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.match("John Doe");
    assertEquals(result_1, expResult_1);

    LockerItem instance_2 = successful_02;
    boolean expResult_2 = true;
    boolean result_2 = instance_2.match("UAB Wifi");
    assertEquals(result_2, expResult_2);

    LockerItem instance_3 = successful_03;
    boolean expResult_3 = true;
    boolean result_3 = instance_3.match("John S. Doe");
    assertEquals(result_3, expResult_3);

    LockerItem instance_4 = error_01;
    boolean expResult_4 = false;
    boolean result_4 = instance_4.match("John Doe");
    assertEquals(result_4, expResult_4);

    LockerItem instance_5 = error_02;
    boolean expResult_5 = false;
    boolean result_5 = instance_5.match("UAB Wifi");
    assertEquals(result_5, expResult_5);

    LockerItem instance_6 = error_03;
    boolean expResult_6 = false;
    boolean result_6 = instance_6.match("John S. Doe");
    assertEquals(result_6, expResult_6);
  }

  /** Test of contain method, of class LockerItem. */
  @Test
  public void testContain() {
    System.out.println("contain");

    LockerItem instance_1 = successful_01;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.contain("John Doe");
    assertEquals(result_1, expResult_1);

    LockerItem instance_2 = successful_02;
    boolean expResult_2 = true;
    boolean result_2 = instance_2.contain("UAB Wifi");
    assertEquals(result_2, expResult_2);

    LockerItem instance_3 = successful_03;
    boolean expResult_3 = true;
    boolean result_3 = instance_3.contain("John S. Doe");
    assertEquals(result_3, expResult_3);

    LockerItem instance_4 = error_01;
    boolean expResult_4 = false;
    boolean result_4 = instance_4.contain("John Doe");
    assertEquals(result_4, expResult_4);

    LockerItem instance_5 = error_02;
    boolean expResult_5 = false;
    boolean result_5 = instance_5.contain("UAB Wifi");
    assertEquals(result_5, expResult_5);

    LockerItem instance_6 = error_03;
    boolean expResult_6 = false;
    boolean result_6 = instance_6.contain("John S. Doe");
    assertEquals(result_6, expResult_6);
  }

  /** Test of set method, of class LockerItem. */
  @Test
  public void testSet() {
    System.out.println("set");

    LockerItem instance_1 = successful_01;
    String name_1 = instance_1.name;
    String notes_1 = instance_1.notes;
    instance_1.set(name_1, notes_1);

    LockerItem instance_2 = successful_02;
    String name_2 = instance_2.name;
    String notes_2 = instance_2.notes;
    instance_2.set(name_2, notes_2);

    LockerItem instance_3 = successful_03;
    String name_3 = instance_3.name;
    String notes_3 = instance_3.notes;
    instance_3.set(name_3, notes_3);

    LockerItem instance_4 = error_01;
    String name_4 = instance_4.name;
    String notes_4 = instance_4.notes;
    instance_4.set(name_4, notes_4);

    LockerItem instance_5 = error_02;
    String name_5 = instance_5.name;
    String notes_5 = instance_5.notes;
    instance_5.set(name_5, notes_5);

    LockerItem instance_6 = error_03;
    String name_6 = instance_6.name;
    String notes_6 = instance_6.notes;
    instance_6.set(name_6, notes_6);
  }

  /** Test of getDateCreated method, of class LockerItem. */
  @Test
  public void testGetDateCreated() {
    System.out.println("getDateCreated");

    LockerItem instance_1 = successful_01;
    String expResult_1 = successful_01.getDateCreated();
    String result_1 = instance_1.getDateCreated();
    assertEquals(result_1, expResult_1);

    LockerItem instance_2 = successful_02;
    String expResult_2 = successful_02.getDateCreated();
    String result_2 = instance_2.getDateCreated();
    assertEquals(result_2, expResult_2);

    LockerItem instance_3 = successful_03;
    String expResult_3 = successful_03.getDateCreated();
    String result_3 = instance_3.getDateCreated();
    assertEquals(result_3, expResult_3);

    LockerItem instance_4 = error_01;
    String expResult_4 = error_01.getDateCreated();
    String result_4 = instance_4.getDateCreated();
    assertEquals(result_4, expResult_4);

    LockerItem instance_5 = error_02;
    String expResult_5 = error_02.getDateCreated();
    String result_5 = instance_5.getDateCreated();
    assertEquals(result_5, expResult_5);

    LockerItem instance_6 = error_03;
    String expResult_6 = error_03.getDateCreated();
    String result_6 = instance_6.getDateCreated();
    assertEquals(result_6, expResult_6);
  }

  /** Test of getDateLastChanged method, of class LockerItem. */
  @Test
  public void testGetDateLastChanged() {
    System.out.println("getDateLastChanged");

    LockerItem instance_1 = successful_01;
    String expResult_1 = successful_01.getDateLastChanged();
    String result_1 = instance_1.getDateLastChanged();
    assertEquals(result_1, expResult_1);

    LockerItem instance_2 = successful_02;
    String expResult_2 = successful_02.getDateLastChanged();
    String result_2 = instance_2.getDateLastChanged();
    assertEquals(result_2, expResult_2);

    LockerItem instance_3 = successful_03;
    String expResult_3 = successful_03.getDateLastChanged();
    String result_3 = instance_3.getDateLastChanged();
    assertEquals(result_3, expResult_3);

    LockerItem instance_4 = error_01;
    String expResult_4 = error_01.getDateLastChanged();
    String result_4 = instance_4.getDateLastChanged();
    assertEquals(result_4, expResult_4);

    LockerItem instance_5 = error_02;
    String expResult_5 = error_02.getDateLastChanged();
    String result_5 = instance_5.getDateLastChanged();
    assertEquals(result_5, expResult_5);

    LockerItem instance_6 = error_03;
    String expResult_6 = error_03.getDateLastChanged();
    String result_6 = instance_6.getDateLastChanged();
    assertEquals(result_6, expResult_6);
  }

  /** Test of getDatesChanged method, of class LockerItem. */
  @Test
  public void testGetDatesChanged() {
    System.out.println("getDatesChanged");

    LockerItem instance_1 = successful_01;
    String expResult_1 = successful_01.getDatesChanged();
    String result_1 = instance_1.getDatesChanged();
    assertEquals(result_1, expResult_1);

    LockerItem instance_2 = successful_02;
    String expResult_2 = successful_02.getDatesChanged();
    String result_2 = instance_2.getDatesChanged();
    assertEquals(result_2, expResult_2);

    LockerItem instance_3 = successful_03;
    String expResult_3 = successful_03.getDatesChanged();
    String result_3 = instance_3.getDatesChanged();
    assertEquals(result_3, expResult_3);

    LockerItem instance_4 = error_01;
    String expResult_4 = error_01.getDatesChanged();
    String result_4 = instance_4.getDatesChanged();
    assertEquals(result_4, expResult_4);

    LockerItem instance_5 = error_02;
    String expResult_5 = error_02.getDatesChanged();
    String result_5 = instance_5.getDatesChanged();
    assertEquals(result_5, expResult_5);

    LockerItem instance_6 = error_03;
    String expResult_6 = error_03.getDatesChanged();
    String result_6 = instance_6.getDatesChanged();
    assertEquals(result_6, expResult_6);
  }

  /** Test of getType method, of class LockerItem. */
  @Test
  public void testGetType() {
    System.out.println("getType");

    LockerItem instance_1 = successful_01;
    String expResult_1 = "Driver License";
    String result_1 = instance_1.getType();
    assertEquals(result_1, expResult_1);

    LockerItem instance_2 = successful_02;
    String expResult_2 = "Wireless Access Points";
    String result_2 = instance_2.getType();
    assertEquals(result_2, expResult_2);

    LockerItem instance_3 = successful_03;
    String expResult_3 = "Credit Card";
    String result_3 = instance_3.getType();
    assertEquals(result_3, expResult_3);

    LockerItem instance_4 = error_01;
    String expResult_4 = "Driver License";
    String result_4 = instance_4.getType();
    assertEquals(result_4, expResult_4);

    LockerItem instance_5 = error_02;
    String expResult_5 = "Wireless Access Points";
    String result_5 = instance_5.getType();
    assertEquals(result_5, expResult_5);

    LockerItem instance_6 = error_03;
    String expResult_6 = "Credit Card";
    String result_6 = instance_6.getType();
    assertEquals(result_6, expResult_6);
  }

  /** Test of delete method, of class LockerItem. */
  @Test
  public void testDelete() {
    System.out.println("delete");

    LockerItem instance_1 = successful_01;
    String text_1 = "John Doe";
    instance_1.delete(text_1);

    LockerItem instance_2 = successful_02;
    String text_2 = "UAB Wifi";
    instance_2.delete(text_2);

    LockerItem instance_3 = successful_03;
    String text_3 = "John S. Doe";
    instance_3.delete(text_3);

    LockerItem instance_4 = error_01;
    String text_4 = "John Doe";
    instance_4.delete(text_4);

    LockerItem instance_5 = error_02;
    String text_5 = "UAB Wifi";
    instance_5.delete(text_5);

    LockerItem instance_6 = error_03;
    String text_6 = "John S. Doe";
    instance_6.delete(text_6);
  }

  /** Test of setNotes method, of class LockerItem. */
  @Test
  public void testSetNotes() {
    System.out.println("setNotes");

    LockerItem instance_1 = successful_01;
    String notes_1 = instance_1.notes;
    instance_1.setNotes(notes_1);

    LockerItem instance_2 = successful_02;
    String notes_2 = instance_2.notes;
    instance_2.setNotes(notes_2);

    LockerItem instance_3 = successful_03;
    String notes_3 = instance_3.notes;
    instance_3.setNotes(notes_3);

    LockerItem instance_4 = error_01;
    String notes_4 = instance_4.notes;
    instance_4.setNotes(notes_4);

    LockerItem instance_5 = error_02;
    String notes_5 = instance_5.notes;
    instance_5.setNotes(notes_5);

    LockerItem instance_6 = error_03;
    String notes_6 = instance_6.notes;
    instance_6.setNotes(notes_6);
  }

  /** Test of setName method, of class LockerItem. */
  @Test
  public void testSetName() {
    System.out.println("setName");

    LockerItem instance_1 = successful_01;
    String name_1 = instance_1.name;
    instance_1.setName(name_1);

    LockerItem instance_2 = successful_02;
    String name_2 = instance_2.name;
    instance_2.setName(name_2);

    LockerItem instance_3 = successful_03;
    String name_3 = instance_3.name;
    instance_3.setName(name_3);

    LockerItem instance_4 = error_01;
    String name_4 = instance_4.name;
    instance_4.setName(name_4);

    LockerItem instance_5 = error_02;
    String name_5 = instance_5.name;
    instance_5.setName(name_5);

    LockerItem instance_6 = error_03;
    String name_6 = instance_6.name;
    instance_6.setName(name_6);
  }

  /** Test of setUid method, of class LockerItem. */
  @Test
  public void testSetUid() {
    System.out.println("setUid");

    LockerItem instance_1 = successful_01;
    String uid_1 = instance_1.uid;
    instance_1.setUid(uid_1);

    LockerItem instance_2 = successful_02;
    String uid_2 = instance_2.uid;
    instance_2.setUid(uid_2);

    LockerItem instance_3 = successful_03;
    String uid_3 = instance_3.uid;
    instance_3.setUid(uid_3);

    LockerItem instance_4 = error_01;
    String uid_4 = instance_4.uid;
    instance_4.setUid(uid_4);

    LockerItem instance_5 = error_02;
    String uid_5 = instance_5.uid;
    instance_5.setUid(uid_5);

    LockerItem instance_6 = error_03;
    String uid_6 = instance_6.uid;
    instance_6.setUid(uid_6);
  }

  /** Test of setFields method, of class LockerItem. */
  @Test
  public void testSetFields() {
    System.out.println("setFields");

    LockerItem instance_1 = successful_01;
    ArrayList fields_1 = instance_1.fieldsArrayList;
    instance_1.setFields(fields_1);

    LockerItem instance_2 = successful_02;
    ArrayList fields_2 = instance_2.fieldsArrayList;
    instance_2.setFields(fields_2);

    LockerItem instance_3 = successful_03;
    ArrayList fields_3 = instance_3.fieldsArrayList;
    instance_3.setFields(fields_3);

    LockerItem instance_4 = error_01;
    ArrayList fields_4 = instance_4.fieldsArrayList;
    instance_4.setFields(fields_4);

    LockerItem instance_5 = error_02;
    ArrayList fields_5 = instance_5.fieldsArrayList;
    instance_5.setFields(fields_5);

    LockerItem instance_6 = error_03;
    ArrayList fields_6 = instance_6.fieldsArrayList;
    instance_6.setFields(fields_6);
  }

  /** Test of setMatchName method, of class LockerItem. */
  @Test
  public void testSetMatchName() {
    System.out.println("setMatchName");

    LockerItem instance_1 = successful_01;
    boolean matchName_1 = instance_1.matchName;
    instance_1.setMatchName(matchName_1);

    LockerItem instance_2 = successful_02;
    boolean matchName_2 = instance_2.matchName;
    instance_2.setMatchName(matchName_2);

    LockerItem instance_3 = successful_03;
    boolean matchName_3 = instance_3.matchName;
    instance_3.setMatchName(matchName_3);

    LockerItem instance_4 = error_01;
    boolean matchName_4 = instance_4.matchName;
    instance_4.setMatchName(matchName_4);

    LockerItem instance_5 = error_02;
    boolean matchName_5 = instance_5.matchName;
    instance_5.setMatchName(matchName_5);

    LockerItem instance_6 = error_03;
    boolean matchName_6 = instance_6.matchName;
    instance_6.setMatchName(matchName_6);
  }

  /** Test of setMatch method, of class LockerItem. */
  @Test
  public void testSetMatch() {
    System.out.println("setMatch");

    LockerItem instance_1 = successful_01;
    boolean match_1 = instance_1.match;
    instance_1.setMatch(match_1);

    LockerItem instance_2 = successful_02;
    boolean match_2 = instance_2.match;
    instance_2.setMatch(match_2);

    LockerItem instance_3 = successful_03;
    boolean match_3 = instance_3.match;
    instance_3.setMatch(match_3);

    LockerItem instance_4 = error_01;
    boolean match_4 = instance_4.match;
    instance_4.setMatch(match_4);

    LockerItem instance_5 = error_02;
    boolean match_5 = instance_5.match;
    instance_5.setMatch(match_5);

    LockerItem instance_6 = error_03;
    boolean match_6 = instance_6.match;
    instance_6.setMatch(match_6);
  }

  /** Test of setContain method, of class LockerItem. */
  @Test
  public void testSetContain() {
    System.out.println("setContain");

    LockerItem instance_1 = successful_01;
    boolean contain_1 = instance_1.contain;
    instance_1.setContain(contain_1);

    LockerItem instance_2 = successful_02;
    boolean contain_2 = instance_2.contain;
    instance_2.setContain(contain_2);

    LockerItem instance_3 = successful_03;
    boolean contain_3 = instance_3.contain;
    instance_3.setContain(contain_3);

    LockerItem instance_4 = error_01;
    boolean contain_4 = instance_4.contain;
    instance_4.setContain(contain_4);

    LockerItem instance_5 = error_02;
    boolean contain_5 = instance_5.contain;
    instance_5.setContain(contain_5);

    LockerItem instance_6 = error_03;
    boolean contain_6 = instance_6.contain;
    instance_6.setContain(contain_6);
  }

  /** Test of setDateCreated method, of class LockerItem. */
  @Test
  public void testSetDateCreated() {
    System.out.println("setDateCreated");

    LockerItem instance_1 = successful_01;
    String dateCreated_1 = instance_1.dateCreated;
    instance_1.setDateCreated(dateCreated_1);

    LockerItem instance_2 = successful_02;
    String dateCreated_2 = instance_2.dateCreated;
    instance_2.setDateCreated(dateCreated_2);

    LockerItem instance_3 = successful_03;
    String dateCreated_3 = instance_3.dateCreated;
    instance_3.setDateCreated(dateCreated_3);

    LockerItem instance_4 = error_01;
    String dateCreated_4 = instance_4.dateCreated;
    instance_4.setDateCreated(dateCreated_4);

    LockerItem instance_5 = error_02;
    String dateCreated_5 = instance_5.dateCreated;
    instance_5.setDateCreated(dateCreated_5);

    LockerItem instance_6 = error_03;
    String dateCreated_6 = instance_6.dateCreated;
    instance_6.setDateCreated(dateCreated_6);
  }

  /** Test of setDateLastChanged method, of class LockerItem. */
  @Test
  public void testSetDateLastChanged() {
    System.out.println("setDateLastChanged");

    LockerItem instance_1 = successful_01;
    String dateLastChanged_1 = instance_1.dateLastChanged;
    instance_1.setDateLastChanged(dateLastChanged_1);

    LockerItem instance_2 = successful_02;
    String dateLastChanged_2 = instance_2.dateLastChanged;
    instance_2.setDateLastChanged(dateLastChanged_2);

    LockerItem instance_3 = successful_03;
    String dateLastChanged_3 = instance_3.dateLastChanged;
    instance_3.setDateLastChanged(dateLastChanged_3);

    LockerItem instance_4 = error_01;
    String dateLastChanged_4 = instance_4.dateLastChanged;
    instance_4.setDateLastChanged(dateLastChanged_4);

    LockerItem instance_5 = error_02;
    String dateLastChanged_5 = instance_5.dateLastChanged;
    instance_5.setDateLastChanged(dateLastChanged_5);

    LockerItem instance_6 = error_03;
    String dateLastChanged_6 = instance_6.dateLastChanged;
    instance_6.setDateLastChanged(dateLastChanged_6);
  }

  /** Test of setDatesChanged method, of class LockerItem. */
  @Test
  public void testSetDatesChanged() {
    System.out.println("setDatesChanged");

    LockerItem instance_1 = successful_01;
    String datesChanged_1 = instance_1.datesChanged;
    instance_1.setDatesChanged(datesChanged_1);

    LockerItem instance_2 = successful_02;
    String datesChanged_2 = instance_2.datesChanged;
    instance_2.setDatesChanged(datesChanged_2);

    LockerItem instance_3 = successful_03;
    String datesChanged_3 = instance_3.datesChanged;
    instance_3.setDatesChanged(datesChanged_3);

    LockerItem instance_4 = error_01;
    String datesChanged_4 = instance_4.datesChanged;
    instance_4.setDatesChanged(datesChanged_4);

    LockerItem instance_5 = error_02;
    String datesChanged_5 = instance_5.datesChanged;
    instance_5.setDatesChanged(datesChanged_5);

    LockerItem instance_6 = error_03;
    String datesChanged_6 = instance_6.datesChanged;
    instance_6.setDatesChanged(datesChanged_6);
  }

  /** Test of setType method, of class LockerItem. */
  @Test
  public void testSetType() {
    System.out.println("setType");

    LockerItem instance_1 = successful_01;
    String type_1 = instance_1.type;
    instance_1.setType(type_1);

    LockerItem instance_2 = successful_02;
    String type_2 = instance_2.type;
    instance_2.setType(type_2);

    LockerItem instance_3 = successful_03;
    String type_3 = instance_3.type;
    instance_3.setType(type_3);

    LockerItem instance_4 = error_01;
    String type_4 = instance_4.type;
    instance_4.setType(type_4);

    LockerItem instance_5 = error_02;
    String type_5 = instance_5.type;
    instance_5.setType(type_5);

    LockerItem instance_6 = error_03;
    String type_6 = instance_6.type;
    instance_6.setType(type_6);
  }

  public class LockerItemImpl extends LockerItem {

    public LockerItemImpl() {
      super("", "");
    }
  }
}