/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  qr-p3 - EE333 Spring 2022
 *
 * Credits:
 */
package edu.uab.chattada.p5;

public class Test {

  public static void main(String[] args) {

    DriverLicenseItem test01 =
        new DriverLicenseItem(
            "John Doe",
            "Driver License Info",
            "123 Random St Birmingham, AL 12345",
            "01/01/2001",
            "02/02/2022",
            "03/03/2023");

    System.out.println(test01);
  }
}