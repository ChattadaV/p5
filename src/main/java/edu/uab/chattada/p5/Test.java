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
    System.out.println(test01);

    //    System.out.println("Successful: Test02 Driver License");
    //    DriverLicenseItem test02 =
    //        new DriverLicenseItem(
    //            "John S. Doe",
    //            "Driver License Info",
    //            12345,
    //            "123 Random St Birmingham, AL 12345",
    //            2001,
    //            1,
    //            1,
    //            2022,
    //            2,
    //            2,
    //            2023,
    //            3,
    //            3);
    //    System.out.println(test01);

    System.out.println("Successful: Test02 Wireless Access Points");
    WirelessAccessPointsItem test02 =
        new WirelessAccessPointsItem(
            "UAB Wifi",
            "Wireless Access Points Info",
            "UABSECURED",
            "WPA/WPA2",
            "GoBlazers",
            "Yes");
    System.out.println(test02);

    //    System.out.println("Successful: Test04 Wireless Access Points");
    //    WirelessAccessPointsItem test04 =
    //        new WirelessAccessPointsItem("UAB Wifi", "", "UABSECURED", "WPA/WPA2", "GoBlazer!",
    // "No");
    //    System.out.println(test04);
    //
    //    System.out.println("Successful: Test05 Credit Card");
    //    CreditCardItem test05 =
    //        new CreditCardItem(
    //            "John Doe",
    //            "Credit Card Info",
    //            1234,
    //            1234,
    //            1234,
    //            1234,
    //            2022,
    //            1,
    //            1,
    //            123,
    //            123456789,
    //            12345,
    //            1234567890);
    //    System.out.println(test05);

    System.out.println("Successful: Test03 Credit Card");
    CreditCardItem test03 =
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
            11111,
            99999,
            1111111111);
    System.out.println(test03);

    //    System.out.println("Failed: Error01 Driver License. Null is not valid");
    //    DriverLicenseItem error01 =
    //        new DriverLicenseItem("", "", 00001, null, 2001, 1, 1, 2022, 2, 2, 2023, 3, 3);
    //    System.out.println(error01);

    System.out.println("Failed: Error01 Driver License. XX is not State abbreviation");
    DriverLicenseItem error01 =
        new DriverLicenseItem(
            "John Doe",
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
    System.out.println(error01);

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

    //    System.out.println(
    //        "Failed: Error4 Wireless Access Points. Non-Sense is not a valid hidden type.");
    //    WirelessAccessPointsItem error04 =
    //        new WirelessAccessPointsItem(
    //            "", "Wireless Access Points Info", "UABSECURED", "WPA/WPA2", "", "non-sense");
    //    System.out.println(error04);

    System.out.println(
        "Failed: Error3 Credit Card. Credit card number is not 16 digits. Zip code is not 5 digits.");
    CreditCardItem error04 =
        new CreditCardItem(
            "John S. Doe",
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
    System.out.println(error04);
  }
}
