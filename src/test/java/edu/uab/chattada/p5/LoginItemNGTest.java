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
public class LoginItemNGTest {

  private LoginItem successful;
  private LoginItem error;

  public LoginItemNGTest() {}

  @BeforeMethod
  public void setUpMethod() throws Exception {
    System.out.println("Name: Chattada Viriyaphap (Pi)");
    System.out.println("BlazerID: chattada");
    System.out.println("\n");

    System.out.println("Test: LoginItem");
    System.out.println("\n");

    successful =
        new LoginItem(
            "UAB Username and Password",
            "Access to main portal",
            "Username123",
            "Password123",
            "https://www.uab.edu");

    error =
        new LoginItem(
            "UAB Username and Password", "Access to main portal", "", "", "htt:/ww.ax.y.z.x");
  }

  @AfterMethod
  public void tearDownMethod() throws Exception {}

  /** Test of getNotes method, of class LoginItem. */
  @Test
  public void testGetNotes() {
    System.out.println("getNotes");

    LoginItem instance_1 = successful;
    String expResult_1 = "Access to main portal";
    String result_1 = instance_1.getNotes();
    assertEquals(result_1, expResult_1);

    LoginItem instance_2 = error;
    String expResult_2 = "Access to main portal";
    String result_2 = instance_2.getNotes();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getName method, of class LoginItem. */
  @Test
  public void testGetName() {
    System.out.println("getName");

    LoginItem instance_1 = successful;
    String expResult_1 = "UAB Username and Password";
    String result_1 = instance_1.getName();
    assertEquals(result_1, expResult_1);

    LoginItem instance_2 = error;
    String expResult_2 = "UAB Username and Password";
    String result_2 = instance_2.getName();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getUsername method, of class LoginItem. */
  @Test
  public void testGetUsername() {
    System.out.println("getUsername");

    LoginItem instance_1 = successful;
    String expResult_1 = "Username123";
    String result_1 = instance_1.getUsername();
    assertEquals(result_1, expResult_1);

    LoginItem instance_2 = error;
    String expResult_2 = null;
    String result_2 = instance_2.getUsername();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getPassword method, of class LoginItem. */
  @Test
  public void testGetPassword() {
    System.out.println("getPassword");

    LoginItem instance_1 = successful;
    String expResult_1 = "Password123";
    String result_1 = instance_1.getPassword();
    assertEquals(result_1, expResult_1);

    LoginItem instance_2 = error;
    String expResult_2 = null;
    String result_2 = instance_2.getPassword();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getUrl method, of class LoginItem. */
  @Test
  public void testGetUrl() {
    System.out.println("getUrl");

    LoginItem instance_1 = successful;
    String expResult_1 = "https://www.uab.edu";
    String result_1 = instance_1.getUrl();
    assertEquals(result_1, expResult_1);

    LoginItem instance_2 = error;
    String expResult_2 = null;
    String result_2 = instance_2.getUrl();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getType method, of class LoginItem. */
  @Test
  public void testGetType() {
    System.out.println("getType");

    LoginItem instance_1 = successful;
    String expResult_1 = "Login Item";
    String result_1 = instance_1.getType();
    assertEquals(result_1, expResult_1);

    LoginItem instance_2 = error;
    String expResult_2 = "Login Item";
    String result_2 = instance_2.getType();
    assertEquals(result_2, expResult_2);
  }

  /** Test of setNotes method, of class LoginItem. */
  @Test
  public void testSetNotes() {
    System.out.println("setNotes");

    LoginItem instance_1 = successful;
    String notes_1 = instance_1.notes;
    instance_1.setNotes(notes_1);

    LoginItem instance_2 = error;
    String notes_2 = instance_2.notes;
    instance_2.setNotes(notes_2);
  }

  /** Test of setName method, of class LoginItem. */
  @Test
  public void testSetName() {
    System.out.println("setName");

    LoginItem instance_1 = successful;
    String name_1 = instance_1.name;
    instance_1.setName(name_1);

    LoginItem instance_2 = error;
    String name_2 = instance_2.name;
    instance_2.setName(name_2);
  }

  /** Test of setUsername method, of class LoginItem. */
  @Test
  public void testSetUsername() {
    System.out.println("setUsername");

    LoginItem instance_1 = successful;
    String username_1 = instance_1.username;
    instance_1.setUsername(username_1);

    LoginItem instance_2 = error;
    String username_2 = instance_2.username;
    instance_2.setUsername(username_2);
  }

  /** Test of setPassword method, of class LoginItem. */
  @Test
  public void testSetPassword() {
    System.out.println("setPassword");

    LoginItem instance_1 = successful;
    String password_1 = instance_1.password;
    instance_1.setPassword(password_1);

    LoginItem instance_2 = error;
    String password_2 = instance_2.password;
    instance_2.setPassword(password_2);
  }

  /** Test of setUrl method, of class LoginItem. */
  @Test
  public void testSetUrl() {
    System.out.println("setUrl");

    LoginItem instance_1 = successful;
    String url_1 = instance_1.url;
    instance_1.setUrl(url_1);

    LoginItem instance_2 = error;
    String url_2 = instance_2.url;
    instance_2.setUrl(url_2);
  }

  /** Test of setType method, of class LoginItem. */
  @Test
  public void testSetType() {
    System.out.println("setType");

    LoginItem instance_1 = successful;
    String type_1 = instance_1.type;
    instance_1.setType(type_1);

    LoginItem instance_2 = error;
    String type_2 = instance_2.type;
    instance_2.setType(type_2);
  }
}