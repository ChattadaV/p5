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
 * NG Unit Test for subclass WirelessAccessPointsItem of superclass LockerItem
 *
 * @author Chattada Viriyaphap <chattada@uab.edu>
 */
public class WirelessAccessPointsItemNGTest {

  /** set type of successful */
  private WirelessAccessPointsItem successful;
  /** set type of error */
  private WirelessAccessPointsItem error;

  /** Main method to create Wireless access points items */
  public WirelessAccessPointsItemNGTest() {}

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

    System.out.println("Test: WirelessAccessPointsItem");
    System.out.println("\n");

    successful =
        new WirelessAccessPointsItem(
            "UAB Wifi",
            "Wireless Access Points Info",
            "UABSECURED",
            "WPA/WPA2",
            "GoBlazers",
            "Yes");
    //    System.out.println(successful);

    error =
        new WirelessAccessPointsItem(
            "", "Wireless Access Points Info", "", "non-sense", "GoBlazers", "Yes");
    //    System.out.println(error);
  }

  /**
   * tear down initial variables after executing (none)
   *
   * @throws Exception
   */
  @AfterMethod
  public void tearDownMethod() throws Exception {}

  /** Test of toString method, of class WirelessAccessPointsItem. */
  @Test
  public void testToString() {
    System.out.println("toString");

    WirelessAccessPointsItem instance_1 = successful;
    String expResult_1 =
        "Notes: Wireless Access Points Info\n"
            + "Name: UAB Wifi\n"
            + "SSID: UABSECURED\n"
            + "Network Type: WPA/WPA2\n"
            + "Password: GoBlazers\n"
            + "Hidden: Yes\n"
            + "UID: "
            + instance_1.getUid()
            + "\n\n";
    String result_1 = instance_1.toString();
    assertEquals(result_1, expResult_1);

    WirelessAccessPointsItem instance_2 = error;
    String expResult_2 =
        "Notes: Wireless Access Points Info\n"
            + "Name: null\n"
            + "SSID: null\n"
            + "Network Type: null\n"
            + "Password: GoBlazers\n"
            + "Hidden: Yes\n"
            + "UID: "
            + instance_2.getUid()
            + "\n\n";
    String result_2 = instance_2.toString();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getNotes method, of class WirelessAccessPointsItem. */
  @Test
  public void testGetNotes() {
    System.out.println("getNotes");

    WirelessAccessPointsItem instance_1 = successful;
    String expResult_1 = "Wireless Access Points Info";
    String result_1 = instance_1.getNotes();
    assertEquals(result_1, expResult_1);

    WirelessAccessPointsItem instance_2 = error;
    String expResult_2 = "Wireless Access Points Info";
    String result_2 = instance_2.getNotes();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getName method, of class WirelessAccessPointsItem. */
  @Test
  public void testGetName() {
    System.out.println("getName");

    WirelessAccessPointsItem instance_1 = successful;
    String expResult_1 = "UAB Wifi";
    String result_1 = instance_1.getName();
    assertEquals(result_1, expResult_1);

    WirelessAccessPointsItem instance_2 = error;
    String expResult_2 = null;
    String result_2 = instance_2.getName();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getSsid method, of class WirelessAccessPointsItem. */
  @Test
  public void testGetSsid() {
    System.out.println("getSsid");

    WirelessAccessPointsItem instance_1 = successful;
    String expResult_1 = "UABSECURED";
    String result_1 = instance_1.getSsid();
    assertEquals(result_1, expResult_1);

    WirelessAccessPointsItem instance_2 = error;
    String expResult_2 = null;
    String result_2 = instance_2.getSsid();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getNetworkType method, of class WirelessAccessPointsItem. */
  @Test
  public void testGetNetworkType() {
    System.out.println("getNetworkType");

    WirelessAccessPointsItem instance_1 = successful;
    String expResult_1 = "WPA/WPA2";
    String result_1 = instance_1.getNetworkType();
    assertEquals(result_1, expResult_1);

    WirelessAccessPointsItem instance_2 = error;
    String expResult_2 = null;
    String result_2 = instance_2.getNetworkType();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getPassword method, of class WirelessAccessPointsItem. */
  @Test
  public void testGetPassword() {
    System.out.println("getPassword");

    WirelessAccessPointsItem instance_1 = successful;
    String expResult_1 = "GoBlazers";
    String result_1 = instance_1.getPassword();
    assertEquals(result_1, expResult_1);

    WirelessAccessPointsItem instance_2 = error;
    String expResult_2 = "GoBlazers";
    String result_2 = instance_2.getPassword();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getHidden method, of class WirelessAccessPointsItem. */
  @Test
  public void testGetHidden() {
    System.out.println("getHidden");

    WirelessAccessPointsItem instance_1 = successful;
    String expResult_1 = "Yes";
    String result_1 = instance_1.getHidden();
    assertEquals(result_1, expResult_1);

    WirelessAccessPointsItem instance_2 = error;
    String expResult_2 = "Yes";
    String result_2 = instance_2.getHidden();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidName method, of class WirelessAccessPointsItem. */
  @Test
  public void testIsValidName() {
    System.out.println("isValidName");

    WirelessAccessPointsItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidName();
    assertEquals(result_1, expResult_1);

    WirelessAccessPointsItem instance_2 = error;
    boolean expResult_2 = false;
    boolean result_2 = instance_2.isValidName();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidHidden method, of class WirelessAccessPointsItem. */
  @Test
  public void testIsValidHidden() {
    System.out.println("isValidHidden");

    WirelessAccessPointsItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidHidden();
    assertEquals(result_1, expResult_1);

    WirelessAccessPointsItem instance_2 = error;
    boolean expResult_2 = true;
    boolean result_2 = instance_2.isValidHidden();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidNetworkType method, of class WirelessAccessPointsItem. */
  @Test
  public void testIsValidNetworkType() {
    System.out.println("isValidNetworkType");

    WirelessAccessPointsItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidNetworkType();
    assertEquals(result_1, expResult_1);

    WirelessAccessPointsItem instance_2 = error;
    boolean expResult_2 = false;
    boolean result_2 = instance_2.isValidNetworkType();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidPassword method, of class WirelessAccessPointsItem. */
  @Test
  public void testIsValidPassword() {
    System.out.println("isValidPassword");

    WirelessAccessPointsItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidPassword();
    assertEquals(result_1, expResult_1);

    WirelessAccessPointsItem instance_2 = error;
    boolean expResult_2 = true;
    boolean result_2 = instance_2.isValidPassword();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidSsid method, of class WirelessAccessPointsItem. */
  @Test
  public void testIsValidSsid() {
    System.out.println("isValidSsid");

    WirelessAccessPointsItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidSsid();
    assertEquals(result_1, expResult_1);

    WirelessAccessPointsItem instance_2 = error;
    boolean expResult_2 = false;
    boolean result_2 = instance_2.isValidSsid();
    assertEquals(result_2, expResult_2);
  }

  /** Test of setNetworkType method, of class WirelessAccessPointsItem. */
  @Test
  public void testSetNetworkType() {
    System.out.println("setNetworkType");

    WirelessAccessPointsItem instance_1 = successful;
    String networkType_1 = instance_1.networkType;
    instance_1.setNetworkType(networkType_1);

    WirelessAccessPointsItem instance_2 = error;
    String networkType_2 = instance_2.networkType;
    instance_2.setNetworkType(networkType_2);
  }

  /** Test of setSsid method, of class WirelessAccessPointsItem. */
  @Test
  public void testSetSsid() {
    System.out.println("setSsid");

    WirelessAccessPointsItem instance_1 = successful;
    String networkType_1 = instance_1.ssid;
    instance_1.setSsid(networkType_1);

    WirelessAccessPointsItem instance_2 = error;
    String networkType_2 = instance_2.ssid;
    instance_2.setSsid(networkType_2);
  }

  /** Test of setPassword method, of class WirelessAccessPointsItem. */
  @Test
  public void testSetPassword() {
    System.out.println("setPassword");

    WirelessAccessPointsItem instance_1 = successful;
    String networkType_1 = instance_1.password;
    instance_1.setPassword(networkType_1);

    WirelessAccessPointsItem instance_2 = error;
    String networkType_2 = instance_2.password;
    instance_2.setPassword(networkType_2);
  }

  /** Test of setHidden method, of class WirelessAccessPointsItem. */
  @Test
  public void testSetHidden() {
    System.out.println("setHidden");

    WirelessAccessPointsItem instance_1 = successful;
    String networkType_1 = instance_1.hidden;
    instance_1.setHidden(networkType_1);

    WirelessAccessPointsItem instance_2 = error;
    String networkType_2 = instance_2.hidden;
    instance_2.setHidden(networkType_2);
  }
}