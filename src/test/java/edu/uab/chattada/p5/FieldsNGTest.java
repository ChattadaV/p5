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
public class FieldsNGTest {

  private Fields successful;
  private Fields error;

  public FieldsNGTest() {}

  @BeforeMethod
  public void setUpMethod() throws Exception {
    System.out.println("Name: Chattada Viriyaphap (Pi)");
    System.out.println("BlazerID: chattada");
    System.out.println("\n");

    System.out.println("Test: Fields");
    System.out.println("\n");

    successful = new Fields("Successful Example: ", "Correct Text");
    //    System.out.println(successful);

    error = new Fields("Error Example: ", "Wrong Text");
    //    System.out.println(error);
  }

  @AfterMethod
  public void tearDownMethod() throws Exception {}

  /** Test of getName method, of class Fields. */
  @Test
  public void testGetName() {
    System.out.println("getName");

    Fields instance_1 = successful;
    String expResult_1 = "Successful Example: ";
    String result_1 = instance_1.getName();
    assertEquals(result_1, expResult_1);

    Fields instance_2 = error;
    String expResult_2 = "Error Example: ";
    String result_2 = instance_2.getName();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getValue method, of class Fields. */
  @Test
  public void testGetValue() {
    System.out.println("getValue");

    Fields instance_1 = successful;
    String expResult_1 = "Correct Text";
    String result_1 = instance_1.getValue();
    assertEquals(result_1, expResult_1);

    Fields instance_2 = error;
    String expResult_2 = "Wrong Text";
    String result_2 = instance_2.getValue();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getType method, of class Fields. */
  @Test
  public void testGetType() {
    System.out.println("getType");

    Fields instance_1 = successful;
    String expResult_1 = "Fields";
    String result_1 = instance_1.getType();
    assertEquals(result_1, expResult_1);

    Fields instance_2 = error;
    String expResult_2 = "Fields";
    String result_2 = instance_2.getType();
    assertEquals(result_2, expResult_2);
  }

  /** Test of getUnmasked method, of class Fields. */
  @Test
  public void testGetUnmasked() {
    System.out.println("getUnmasked");

    Fields instance_1 = successful;
    String expResult_1 = "Correct Text";
    String result_1 = instance_1.getUnmasked();
    assertEquals(result_1, expResult_1);

    Fields instance_2 = error;
    String expResult_2 = "Wrong Text";
    String result_2 = instance_2.getUnmasked();
    assertEquals(result_2, expResult_2);
  }

  /** Test of setName method, of class Fields. */
  @Test
  public void testSetName() {
    System.out.println("setName");

    Fields instance_1 = successful;
    String name_1 = instance_1.name;
    instance_1.setName(name_1);

    Fields instance_2 = error;
    String name_2 = instance_2.name;
    instance_2.setName(name_2);
  }

  /** Test of setValue method, of class Fields. */
  @Test
  public void testSetValue() {
    System.out.println("setValue");

    Fields instance_1 = successful;
    String value_1 = instance_1.value;
    instance_1.setValue(value_1);

    Fields instance_2 = error;
    String value_2 = instance_2.value;
    instance_2.setValue(value_2);
  }

  /** Test of setType method, of class Fields. */
  @Test
  public void testSetType() {
    System.out.println("setType");

    Fields instance_1 = successful;
    String type_1 = instance_1.type;
    instance_1.setType(type_1);

    Fields instance_2 = error;
    String type_2 = instance_2.type;
    instance_2.setType(type_2);
  }

  /** Test of setUnmasked method, of class Fields. */
  @Test
  public void testSetUnmasked() {
    System.out.println("setUnmasked");

    Fields instance_1 = successful;
    String value_1 = instance_1.value;
    instance_1.setUnmasked(value_1);

    Fields instance_2 = error;
    String value_2 = instance_2.value;
    instance_2.setUnmasked(value_2);
  }
}