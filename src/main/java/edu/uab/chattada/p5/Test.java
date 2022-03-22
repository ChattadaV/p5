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
            "00001",
            "123 Random St Birmingham, AL 12345",
            "01/01/2001",
            "02/02/2022",
            "03/03/2023");
    System.out.println(test01);

    WirelessAccessPointsItem test02 =
        new WirelessAccessPointsItem(
            "UAB Wifi", "Wireless Access Points Info", "UABSECURED", "WPA/WPA2", "GoBlazer!", "No");
    System.out.println(test02);

    WirelessAccessPointsItem test03 =
        new WirelessAccessPointsItem("UAB Wifi", "", "UABSECURED", "WPA/WPA2", "GoBlazer!", "No");
    System.out.println(test03);

    DriverLicenseItem error01 =
        new DriverLicenseItem("", "", "00001", null, "01/01/2001", "", "03/03/2023");
    System.out.println(error01);

    WirelessAccessPointsItem error02 =
        new WirelessAccessPointsItem(
            "UAB Wifi",
            "Wireless Access Points Info",
            "UABSECURED",
            "non-sense",
            "GoBlazer!",
            "No");
    System.out.println(error02);

    WirelessAccessPointsItem error03 =
        new WirelessAccessPointsItem(
            "", "Wireless Access Points Info", "UABSECURED", "WPA/WPA2", "", "non-sense");
    System.out.println(error03);
  }
}
