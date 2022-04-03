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

/** */
public class CreditCardItemNGTest {

  private CreditCardItem successful;
  private CreditCardItem error;

  public CreditCardItemNGTest() {}

  @BeforeMethod
  public void setUpMethod() throws Exception {
    System.out.println("Name: Chattada Viriyaphap (Pi)");
    System.out.println("BlazerID: chattada");
    System.out.println("\n");

    System.out.println("Test: CreditCardItem");
    System.out.println("\n");

    successful =
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
    //    System.out.println(successful);

    error =
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
            12,
            11111,
            123456,
            5432123);
    //    System.out.println(error);
  }

  @AfterMethod
  public void tearDownMethod() throws Exception {}

  /** Test of toString method, of class CreditCardItem. */
  @Test
  public void testToString() {
    System.out.println("toString");

    CreditCardItem instance_1 = successful;
    String expResult_1 =
        "Notes: Credit Card Info\n"
            + "Name: John S. Doe\n"
            + "Card Number: 1111 2222 3333 4444\n"
            + "Expiration Date: 2030-12-01\n"
            + "CVV: 555\n"
            + "PIN: 123\n"
            + "Zip Code: 99999\n"
            + "Issuer Phone Number: 1111111111\n"
            + "UID: "
            + instance_1.getUid()
            + "\n\n";
    String result_1 = instance_1.toString();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    String expResult_2 =
        "Notes: Credit Card Info\n"
            + "Name: null\n"
            + "Card Number: null\n"
            + "Expiration Date: 2030-12-01\n"
            + "CVV: null\n"
            + "PIN: 11111\n"
            + "Zip Code: null\n"
            + "Issuer Phone Number: null\n"
            + "UID: "
            + instance_2.getUid()
            + "\n\n";
    String result_2 = instance_2.toString();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getNotes method, of class CreditCardItem. */
  @Test
  public void testGetNotes() {
    System.out.println("getNotes");

    CreditCardItem instance_1 = successful;
    String expResult_1 = "Credit Card Info";
    String result_1 = instance_1.getNotes();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    String expResult_2 = "Credit Card Info";
    String result_2 = instance_2.getNotes();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getName method, of class CreditCardItem. */
  @Test
  public void testGetName() {
    System.out.println("getName");

    CreditCardItem instance_1 = successful;
    String expResult_1 = "John S. Doe";
    String result_1 = instance_1.getName();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    String expResult_2 = null;
    String result_2 = instance_2.getName();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getCardNumber method, of class CreditCardItem. */
  @Test
  public void testGetCardNumber() {
    System.out.println("getCardNumber");

    CreditCardItem instance_1 = successful;
    String expResult_1 = "1111 2222 3333 4444";
    String result_1 = instance_1.getCardNumber();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    String expResult_2 = null;
    String result_2 = instance_2.getCardNumber();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getExpireDate method, of class CreditCardItem. */
  @Test
  public void testGetExpireDate() {
    System.out.println("getExpireDate");

    CreditCardItem instance_1 = successful;
    String expResult_1 = "2030-12-01";
    String result_1 = instance_1.getExpireDate();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    String expResult_2 = "2030-12-01";
    String result_2 = instance_2.getExpireDate();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getCvv method, of class CreditCardItem. */
  @Test
  public void testGetCvv() {
    System.out.println("getCvv");

    CreditCardItem instance_1 = successful;
    String expResult_1 = "555";
    String result_1 = instance_1.getCvv();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    String expResult_2 = null;
    String result_2 = instance_2.getCvv();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getPin method, of class CreditCardItem. */
  @Test
  public void testGetPin() {
    System.out.println("getPin");

    CreditCardItem instance_1 = successful;
    String expResult_1 = "123";
    String result_1 = instance_1.getPin();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    String expResult_2 = "11111";
    String result_2 = instance_2.getPin();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getZipCode method, of class CreditCardItem. */
  @Test
  public void testGetZipCode() {
    System.out.println("getZipCode");

    CreditCardItem instance_1 = successful;
    String expResult_1 = "99999";
    String result_1 = instance_1.getZipCode();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    String expResult_2 = null;
    String result_2 = instance_2.getZipCode();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getIssuerPhone method, of class CreditCardItem. */
  @Test
  public void testGetIssuerPhone() {
    System.out.println("getIssuerPhone");

    CreditCardItem instance_1 = successful;
    String expResult_1 = "1111111111";
    String result_1 = instance_1.getIssuerPhone();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    String expResult_2 = null;
    String result_2 = instance_2.getIssuerPhone();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidName method, of class CreditCardItem. */
  @Test
  public void testIsValidName() {
    System.out.println("isValidName");

    CreditCardItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidName();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    boolean expResult_2 = false;
    boolean result_2 = instance_2.isValidName();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidCardNumber01 method, of class CreditCardItem. */
  @Test
  public void testIsValidCardNumber01() {
    System.out.println("isValidCardNumber01");

    CreditCardItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidCardNumber01();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    boolean expResult_2 = true;
    boolean result_2 = instance_2.isValidCardNumber01();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidCardNumber02 method, of class CreditCardItem. */
  @Test
  public void testIsValidCardNumber02() {
    System.out.println("isValidCardNumber02");

    CreditCardItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidCardNumber02();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    boolean expResult_2 = true;
    boolean result_2 = instance_2.isValidCardNumber02();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidCardNumber03 method, of class CreditCardItem. */
  @Test
  public void testIsValidCardNumber03() {
    System.out.println("isValidCardNumber03");

    CreditCardItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidCardNumber03();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    boolean expResult_2 = true;
    boolean result_2 = instance_2.isValidCardNumber03();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidCardNumber04 method, of class CreditCardItem. */
  @Test
  public void testIsValidCardNumber04() {
    System.out.println("isValidCardNumber04");

    CreditCardItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidCardNumber04();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    boolean expResult_2 = false;
    boolean result_2 = instance_2.isValidCardNumber04();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidExpireDate method, of class CreditCardItem. */
  @Test
  public void testIsValidExpireDate() {
    System.out.println("isValidExpireDate");

    CreditCardItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidExpireDate();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    boolean expResult_2 = true;
    boolean result_2 = instance_2.isValidExpireDate();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidCvv method, of class CreditCardItem. */
  @Test
  public void testIsValidCvv() {
    System.out.println("isValidCvv");

    CreditCardItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidCvv();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    boolean expResult_2 = false;
    boolean result_2 = instance_2.isValidCvv();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidPin method, of class CreditCardItem. */
  @Test
  public void testIsValidPin() {
    System.out.println("isValidPin");

    CreditCardItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidPin();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    boolean expResult_2 = true;
    boolean result_2 = instance_2.isValidPin();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidZipCode method, of class CreditCardItem. */
  @Test
  public void testIsValidZipCode() {
    System.out.println("isValidZipCode");

    CreditCardItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidZipCode();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    boolean expResult_2 = false;
    boolean result_2 = instance_2.isValidZipCode();
    assertEquals(result_2, expResult_2);
  }

  /** Test of isValidIssuerPhone method, of class CreditCardItem. */
  @Test
  public void testIsValidIssuerPhone() {
    System.out.println("isValidIssuerPhone");

    CreditCardItem instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValidIssuerPhone();
    assertEquals(result_1, expResult_1);

    CreditCardItem instance_2 = error;
    boolean expResult_2 = false;
    boolean result_2 = instance_2.isValidIssuerPhone();
    assertEquals(result_2, expResult_2);
  }

  /** Test of setNotes method, of class CreditCardItem. */
  @Test
  public void testSetNotes() {
    System.out.println("setNotes");

    CreditCardItem instance_1 = successful;
    String notes_1 = instance_1.notes;
    instance_1.setNotes(notes_1);

    CreditCardItem instance_2 = error;
    String notes_2 = instance_2.notes;
    instance_2.setNotes(notes_2);
  }

  /** Test of setName method, of class CreditCardItem. */
  @Test
  public void testSetName() {
    System.out.println("setName");

    CreditCardItem instance_1 = successful;
    String name_1 = instance_1.name;
    instance_1.setName(name_1);

    CreditCardItem instance_2 = error;
    String name_2 = instance_2.name;
    instance_2.setName(name_2);
  }

  /** Test of setCardNumber01 method, of class CreditCardItem. */
  @Test
  public void testSetCardNumber01() {
    System.out.println("setCardNumber01");

    CreditCardItem instance_1 = successful;
    int cardNumber01_1 = Integer.valueOf(instance_1.cardNumber01);
    instance_1.setCardNumber01(cardNumber01_1);

    CreditCardItem instance_2 = error;
    int cardNumber01_2 = Integer.valueOf(instance_2.cardNumber01);
    instance_2.setCardNumber01(cardNumber01_2);
  }

  /** Test of setCardNumber02 method, of class CreditCardItem. */
  @Test
  public void testSetCardNumber02() {
    System.out.println("setCardNumber02");

    CreditCardItem instance_1 = successful;
    int cardNumber02_1 = Integer.valueOf(instance_1.cardNumber02);
    instance_1.setCardNumber02(cardNumber02_1);

    CreditCardItem instance_2 = error;
    int cardNumber02_2 = Integer.valueOf(instance_2.cardNumber02);
    instance_2.setCardNumber02(cardNumber02_2);
  }

  /** Test of setCardNumber03 method, of class CreditCardItem. */
  @Test
  public void testSetCardNumber03() {
    System.out.println("setCardNumber03");

    CreditCardItem instance_1 = successful;
    int cardNumber03_1 = Integer.valueOf(instance_1.cardNumber03);
    instance_1.setCardNumber03(cardNumber03_1);

    CreditCardItem instance_2 = error;
    int cardNumber03_2 = Integer.valueOf(instance_2.cardNumber03);
    instance_2.setCardNumber03(cardNumber03_2);
  }

  /** Test of setCardNumber04 method, of class CreditCardItem. */
  @Test
  public void testSetCardNumber04() {
    System.out.println("setCardNumber04");

    CreditCardItem instance_1 = successful;
    int cardNumber04_1 = Integer.valueOf(instance_1.cardNumber04);
    instance_1.setCardNumber04(cardNumber04_1);

    CreditCardItem instance_2 = error;
    int cardNumber04_2 = Integer.valueOf(instance_2.cardNumber04);
    instance_2.setCardNumber04(cardNumber04_2);
  }

  /** Test of setExpireDate method, of class CreditCardItem. */
  @Test
  public void testSetExpireDate() {
    System.out.println("setExpireDate");

    CreditCardItem instance_1 = successful;
    String expireDate_1 = instance_1.expireDate;
    instance_1.setExpireDate(expireDate_1);

    CreditCardItem instance_2 = error;
    String expireDate_2 = instance_2.expireDate;
    instance_2.setExpireDate(expireDate_2);
  }

  /** Test of setCvv method, of class CreditCardItem. */
  @Test
  public void testSetCvv() {
    System.out.println("setCvv");

    CreditCardItem instance_1 = successful;
    int cvv_1 = Integer.valueOf(instance_1.cvv);
    instance_1.setCvv(cvv_1);

    CreditCardItem instance_2 = error;
    int cvv_2 = Integer.valueOf(instance_2.cvv);
    instance_2.setCvv(cvv_2);
  }

  /** Test of setPin method, of class CreditCardItem. */
  @Test
  public void testSetPin() {
    System.out.println("setPin");

    CreditCardItem instance_1 = successful;
    int pin_1 = Integer.valueOf(instance_1.pin);
    instance_1.setPin(pin_1);

    CreditCardItem instance_2 = error;
    int pin_2 = Integer.valueOf(instance_2.pin);
    instance_2.setPin(pin_2);
  }

  /** Test of setZipCode method, of class CreditCardItem. */
  @Test
  public void testSetZipCode() {
    System.out.println("setZipCode");

    CreditCardItem instance_1 = successful;
    int zipCode_1 = Integer.valueOf(instance_1.zipCode);
    instance_1.setZipCode(zipCode_1);

    CreditCardItem instance_2 = error;
    int zipCode_2 = Integer.valueOf(instance_2.zipCode);
    instance_2.setZipCode(zipCode_2);
  }

  /** Test of setIssuerPhone method, of class CreditCardItem. */
  @Test
  public void testSetIssuerPhone() {
    System.out.println("setIssuerPhone");

    CreditCardItem instance_1 = successful;
    int issuerPhone_1 = Integer.valueOf(instance_1.issuerPhone);
    instance_1.setIssuerPhone(issuerPhone_1);

    CreditCardItem instance_2 = error;
    int issuerPhone_2 = Integer.valueOf(instance_2.issuerPhone);
    instance_2.setIssuerPhone(issuerPhone_2);
  }
}