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
    boolean result_1 = instance_1.matchName("Name");
    assertEquals(result_1, expResult_1);

    //    LockerItem instance_2 = successful_02;
    //    boolean expResult_2 = true;
    //    boolean result_2 = instance_2.matchName("UAB Wifi");
    //    assertEquals(result_2, expResult_2);
    //
    //    LockerItem instance_3 = successful_03;
    //    boolean expResult_3 = true;
    //    boolean result_3 = instance_3.matchName("John S. Doe");
    //    assertEquals(result_3, expResult_3);
    //
    //    LockerItem instance_4 = error_01;
    //    boolean expResult_4 = false;
    //    boolean result_4 = instance_4.matchName("John Doe");
    //    assertEquals(result_4, expResult_4);
    //
    //    LockerItem instance_5 = error_02;
    //    boolean expResult_5 = false;
    //    boolean result_5 = instance_5.matchName("UAB Wifi");
    //    assertEquals(result_5, expResult_5);

    //    LockerItem instance_6 = error_03;
    //    boolean expResult_6 = false;
    //    boolean result_6 = instance_6.matchName("John S. Doe");
    //    assertEquals(result_6, expResult_6);
  }

  /** Test of match method, of class LockerItem. */
  @Test
  public void testMatch() {
    System.out.println("match");
    String text = "";
    LockerItem instance = null;
    boolean expResult = false;
    boolean result = instance.match(text);
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of contain method, of class LockerItem. */
  @Test
  public void testContain() {
    System.out.println("contain");
    String text = "";
    LockerItem instance = null;
    boolean expResult = false;
    boolean result = instance.contain(text);
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of set method, of class LockerItem. */
  @Test
  public void testSet() {
    System.out.println("set");
    String text = "";
    String value = "";
    LockerItem instance = null;
    instance.set(text, value);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of getDateCreated method, of class LockerItem. */
  @Test
  public void testGetDateCreated() {
    System.out.println("getDateCreated");
    LockerItem instance = null;
    String expResult = "";
    String result = instance.getDateCreated();
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of getDateLastChanged method, of class LockerItem. */
  @Test
  public void testGetDateLastChanged() {
    System.out.println("getDateLastChanged");
    LockerItem instance = null;
    String expResult = "";
    String result = instance.getDateLastChanged();
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of getDatesChanged method, of class LockerItem. */
  @Test
  public void testGetDatesChanged() {
    System.out.println("getDatesChanged");
    LockerItem instance = null;
    String expResult = "";
    String result = instance.getDatesChanged();
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of getType method, of class LockerItem. */
  @Test
  public void testGetType() {
    System.out.println("getType");
    LockerItem instance = null;
    String expResult = "";
    String result = instance.getType();
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of delete method, of class LockerItem. */
  @Test
  public void testDelete() {
    System.out.println("delete");
    String text = "";
    LockerItem instance = null;
    instance.delete(text);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of setNotes method, of class LockerItem. */
  @Test
  public void testSetNotes() {
    System.out.println("setNotes");
    String notes = "";
    LockerItem instance = null;
    instance.setNotes(notes);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of setName method, of class LockerItem. */
  @Test
  public void testSetName() {
    System.out.println("setName");
    String name = "";
    LockerItem instance = null;
    instance.setName(name);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of setUid method, of class LockerItem. */
  @Test
  public void testSetUid() {
    System.out.println("setUid");
    String uid = "";
    LockerItem instance = null;
    instance.setUid(uid);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of setFields method, of class LockerItem. */
  @Test
  public void testSetFields() {
    System.out.println("setFields");
    ArrayList<Fields> fieldsArrayList = null;
    LockerItem instance = null;
    instance.setFields(fieldsArrayList);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of setMatchName method, of class LockerItem. */
  @Test
  public void testSetMatchName() {
    System.out.println("setMatchName");
    boolean matchName = false;
    LockerItem instance = null;
    instance.setMatchName(matchName);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of setMatch method, of class LockerItem. */
  @Test
  public void testSetMatch() {
    System.out.println("setMatch");
    boolean match = false;
    LockerItem instance = null;
    instance.setMatch(match);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of setContain method, of class LockerItem. */
  @Test
  public void testSetContain() {
    System.out.println("setContain");
    boolean contain = false;
    LockerItem instance = null;
    instance.setContain(contain);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of setDateCreated method, of class LockerItem. */
  @Test
  public void testSetDateCreated() {
    System.out.println("setDateCreated");
    String dateCreated = "";
    LockerItem instance = null;
    instance.setDateCreated(dateCreated);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of setDateLastChanged method, of class LockerItem. */
  @Test
  public void testSetDateLastChanged() {
    System.out.println("setDateLastChanged");
    String dateLastChanged = "";
    LockerItem instance = null;
    instance.setDateLastChanged(dateLastChanged);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of setDatesChanged method, of class LockerItem. */
  @Test
  public void testSetDatesChanged() {
    System.out.println("setDatesChanged");
    String datesChanged = "";
    LockerItem instance = null;
    instance.setDatesChanged(datesChanged);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /** Test of setType method, of class LockerItem. */
  @Test
  public void testSetType() {
    System.out.println("setType");
    String type = "";
    LockerItem instance = null;
    instance.setType(type);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  public class LockerItemImpl extends LockerItem {

    public LockerItemImpl() {
      super("", "");
    }
  }
}