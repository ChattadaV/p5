/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  qr-p3 - EE333 Spring 2022
 *
 * Credits:
 */
package edu.uab.chattada.p5;

import java.util.ArrayList;

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
            123,
            99999,
            1111111111);
    System.out.println(test03);

    System.out.println("Failed: Error01 Driver License. XX is not State abbreviation");
    DriverLicenseItem error01 =
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
    System.out.println(error01);

    System.out.println(
        "Failed: Error02 Wireless Access Points. Non-Sense is not a valid Network Type.");
    WirelessAccessPointsItem error02 =
        new WirelessAccessPointsItem(
            "", "Wireless Access Points Info", "", "non-sense", "GoBlazer!", "No");
    System.out.println(error02);

    System.out.println(
        "Failed: Error3 Credit Card. Credit card number is not 16 digits. Zip code is not 5 digits.");
    CreditCardItem error03 =
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
    System.out.println(error03);

    // =============================================================================================

    ArrayList<LockerItem> lockerArrayList = new ArrayList<>();
    lockerArrayList.add(
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
            3));
    lockerArrayList.add(
        new WirelessAccessPointsItem(
            "UAB Wifi",
            "Wireless Access Points Info",
            "UABSECURED",
            "WPA/WPA2",
            "GoBlazers",
            "Yes"));
    lockerArrayList.add(
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
            1111111111));

    Locker lockerSystem = new Locker("Username123", "Password123");

    System.out.println("Test: Unlock with correct password");
    lockerSystem.lock();
    System.out.println("Locker's locked status BEFORE is: ");
    System.out.println(lockerSystem.isLocked);
    System.out.println("Inputing correct password");
    lockerSystem.unlock("Password123");
    System.out.println("Locker's locked status AFTER is: ");
    System.out.println(lockerSystem.isLocked);

    System.out.println(
        "=========================================================================================\n");

    System.out.println("Test: Unlock with incorrect password");
    lockerSystem.lock();
    System.out.println("Locker's locked status BEFORE is: ");
    System.out.println(lockerSystem.isLocked);
    System.out.println("Inputing incorrect password");
    lockerSystem.unlock("Password123123123");
    System.out.println("Locker's locked status AFTER is: ");
    System.out.println(lockerSystem.isLocked);

    System.out.println(
        "=========================================================================================\n");

    System.out.println("Test: Remove item from locker");
    lockerSystem.unlock("Password123"); // can only add item when locker is unlocked
    System.out.println("Before removing: ");
    System.out.println(lockerArrayList);
    //    lockerSystem.delete();
    //    lockerArrayList.delete("PIN: ");
    //    lockerArrayList.delete(lockerArrayList);
    System.out.println("After removing: ");
    System.out.println(lockerArrayList);

    System.out.println(
        "=========================================================================================\n");

    System.out.println("Test: Add item to locker");
    lockerSystem.unlock("Password123"); // can only add item when locker is unlocked
    System.out.println("Before adding: ");
    System.out.println(lockerArrayList);
    lockerArrayList.add(test01);
    lockerArrayList.add(test02);
    lockerArrayList.add(test03);
    System.out.println("After adding: ");
    System.out.println(lockerArrayList);
    //
    //    System.out.println(
    //
    // "=========================================================================================\n");
    //
    //    System.out.println("Test: Getting an item from locker");
    //    lockerSystem.unlock("Password123"); // can only add item when locker is unlocked
    //    System.out.println("Before getting: ");
    //    System.out.println(lockerArrayList);
    //    //    lockerArrayList.get(lockerArrayList.getUid());
    //    //    lockerArrayList.get(test02.getUid());
    //    //    lockerArrayList.get(test03.getUid());
    //    System.out.println("After getting: ");
    //    System.out.println(lockerArrayList);
    //    System.out.println(
    //
    // "=========================================================================================\n");
    //
    //    System.out.println("Test: Search if an item contain something");
    //    lockerSystem.unlock("Password123"); // can only add item when locker is unlocked
    //    System.out.println("After searching: ");
    //    System.out.println(lockerSystem.searchContains("John Doe"));
    //    System.out.println(
    //
    // "=========================================================================================\n");
    //
    //    System.out.println("Test: Search if an item contain a specific name");
    //    lockerSystem.unlock("Password123"); // can only add item when locker is unlocked
    //    System.out.println("Before searching: ");
    //    System.out.println(lockerArrayList);
    //    //    lockerArrayList.searchNameContains("Credit Card");
    //    System.out.println("After searching: ");
    //    System.out.println(lockerArrayList);
  }
}
