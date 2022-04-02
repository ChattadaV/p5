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
public class UrlFieldNGTest {

  private UrlField successful;
  private UrlField error;

  public UrlFieldNGTest() {}

  @BeforeMethod
  public void setUpMethod() throws Exception {
    successful = new UrlField("UAB Main Website", "https://www.uab.edu");
    //    System.out.println(successful);

    error = new UrlField("Error Website", "ww.abc x.yz");
    //    System.out.println(error);
  }

  @AfterMethod
  public void tearDownMethod() throws Exception {}

  /** Test of isValid method, of class UrlField. */
  @Test
  public void testIsValid() {
    System.out.println("isValid");

    UrlField instance_1 = successful;
    boolean expResult_1 = true;
    boolean result_1 = instance_1.isValid();
    assertEquals(result_1, expResult_1);

    UrlField instance_2 = error;
    boolean expResult_2 = false;
    boolean result_2 = instance_2.isValid();
    assertEquals(result_2, expResult_2);
  }

  /** Test of toString method, of class UrlField. */
  @Test
  public void testToString() {
    System.out.println("toString");

    UrlField instance_1 = successful;
    String expResult_1 = "URL: https://www.uab.edu";
    String result_1 = instance_1.toString();
    assertEquals(result_1, expResult_1);

    UrlField instance_2 = error;
    String expResult_2 = "URL: null";
    String result_2 = instance_2.toString();
    assertEquals(result_2, expResult_2);
  }

  /** Test of setUrl method, of class UrlField. */
  @Test
  public void testSetUrl() {
    System.out.println("setUrl");

    UrlField instance_1 = successful;
    String url_1 = instance_1.url;
    instance_1.setUrl(url_1);

    UrlField instance_2 = error;
    String url_2 = instance_2.url;
    instance_2.setUrl(url_2);
  }
}