/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  qr-p3 - EE333 Spring 2022
 *
 * Credits:
 */
package edu.uab.chattada.p5;

public class Test {

  public static void main(String[] args) {

    System.out.println("Successful: Test01 Driver License");
    DriverLicenseItem test01 =
        new DriverLicenseItem(
            "John Doe",
            "Driver License Info",
            "00001",
            "123 Random St Birmingham, AL 12345",
            "01/01/2001",
            "02/02/2022",
            "03/03/2023");
    System.out.println(test01);

    System.out.println("Successful: Test02 Driver License");
    DriverLicenseItem test02 =
        new DriverLicenseItem(
            "John S. Doe",
            "Driver License Info",
            "12345",
            "123 Random St Birmingham, AL 12345",
            "1/1/01",
            "2/2/22",
            "3/3/23");
    System.out.println(test01);

    System.out.println("Successful: Test03 Wireless Access Points");
    WirelessAccessPointsItem test03 =
        new WirelessAccessPointsItem(
            "UAB Wifi",
            "Wireless Access Points Info",
            "UABSECURED",
            "WPA/WPA2",
            "GoBlazers",
            "Yes");
    System.out.println(test03);

    System.out.println("Successful: Test04 Wireless Access Points");
    WirelessAccessPointsItem test04 =
        new WirelessAccessPointsItem("UAB Wifi", "", "UABSECURED", "WPA/WPA2", "GoBlazer!", "No");
    System.out.println(test04);

    System.out.println("Failed: Error01 Driver License. Null is not valid");
    DriverLicenseItem error01 =
        new DriverLicenseItem("", "", "00001", null, "01/01/2001", "", "03/03/2023");
    System.out.println(error01);

    System.out.println("Failed: Error02 Driver License. XX is not State abbreviation");
    DriverLicenseItem error02 =
        new DriverLicenseItem(
            "John Doe",
            "Driver License Info",
            "00001",
            "123 Random St Birmingham, XX 12345",
            "01/01/2001",
            "02/02/2022",
            "03/03/2023");
    System.out.println(error02);

    System.out.println(
        "Failed: Error03 Wireless Access Points. Non-Sense is not a valid Network Type.");
    WirelessAccessPointsItem error03 =
        new WirelessAccessPointsItem(
            "UAB Wifi",
            "Wireless Access Points Info",
            "UABSECURED",
            "non-sense",
            "GoBlazer!",
            "No");
    System.out.println(error03);

    System.out.println(
        "Failed: Error4 Wireless Access Points. Non-Sense is not a valid hidden type.");
    WirelessAccessPointsItem error04 =
        new WirelessAccessPointsItem(
            "", "Wireless Access Points Info", "UABSECURED", "WPA/WPA2", "", "non-sense");
    System.out.println(error04);
  }
}
