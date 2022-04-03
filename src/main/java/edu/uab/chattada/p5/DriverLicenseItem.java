/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

import java.util.ArrayList;
import java.lang.String;
import java.lang.CharSequence;
import java.time.LocalDate;

/**
 * Sub class Driver DriverLicenseItem that stores driver license information
 *
 * @author Chattada Viriyaphap <chattada@uab.edu>
 */
public class DriverLicenseItem extends LockerItem {

  // set type
  protected String address;
  protected String licenseNumber;
  protected String dob;
  protected String issueDate;
  protected String expireDate;
  protected String output;

  // ArrayList of Driver License Item/Info
  ArrayList<Fields> DLI_ArrayList = new ArrayList<>();

  /**
   * Main method to create driver license item/info in ArrayList
   *
   * @param name - name on driver license
   * @param notes - optional notes about driver license
   * @param licenseNumber - driver license number
   * @param address - address on driver license
   * @param dobYear - year of birth on driver license
   * @param dobMonth - month of birth on driver license
   * @param dobDay - day of birth on driver license
   * @param issueYear - issue year on driver license
   * @param issueMonth - issue month on driver license
   * @param issueDay - issue day on driver license
   * @param expireYear - expiration year on driver license
   * @param expireMonth - expiration month on driver license
   * @param expireDay - expiration day on driver license
   */
  public DriverLicenseItem(
      String name,
      String notes,
      int licenseNumber,
      String address,
      int dobYear,
      int dobMonth,
      int dobDay,
      int issueYear,
      int issueMonth,
      int issueDay,
      int expireYear,
      int expireMonth,
      int expireDay) {

    super(name, notes); // calling name and value from superclass LockerItem
    this.type = "Driver License";

    this.address = address;
    this.licenseNumber = Integer.toString(licenseNumber);

    // Using Java Local Date library
    dob = LocalDate.of(dobYear, dobMonth, dobDay).toString();
    issueDate = LocalDate.of(issueYear, issueMonth, issueDay).toString();
    expireDate = LocalDate.of(expireYear, expireMonth, expireDay).toString();

    // ArrayList of Driver License Items/Info
    DLI_ArrayList.add(new NoteField("Notes: ", getNotes()));
    DLI_ArrayList.add(new TextField("License Number: ", getLicenseNumber()));
    DLI_ArrayList.add(new TextField("Name: ", getName()));
    DLI_ArrayList.add(new TextField("Address: ", getAddress()));
    DLI_ArrayList.add(new DateField("DOB: ", getDob()));
    DLI_ArrayList.add(new DateField("Issue Date: ", getIssueDate()));
    DLI_ArrayList.add(new DateField("Expiration Date: ", getExpireDate()));
    DLI_ArrayList.add(new TextField("UID: ", getUid()));
  }

  /**
   * toString to get a text block of all driver license items/info
   *
   * @return String text representation (text block) of all driver license item/info
   */
  @Override
  public String toString() {
    output = "";
    for (var toString : DLI_ArrayList) {
      output += toString.getName() + toString.getValue() + "\n";
    }
    output += "\n";

    return output;
  }

  /**
   * getNotes to get optional notes of driver license
   *
   * @return String optional notes of driver license
   */
  public String getNotes() {
    return notes;
  }

  /**
   * getName to get the name on driver license
   *
   * @return String name on driver license
   */
  public String getName() {
    if (isValidName() == false) {
      return null;
    } else {
      return name;
    }
  }

  /**
   * getDriverLicenseNumber to get license number
   *
   * @return String driver license number
   */
  public String getLicenseNumber() {
    if (isValidLicenseNumber() == false) {
      return null;
    } else {
      return licenseNumber;
    }
  }

  /**
   * getAddress to get address on driver license
   *
   * @return String address on driver license
   */
  public String getAddress() {
    if (isValidAddress() == false) {
      return null;
    } else {
      return address;
    }
  }

  /**
   * getDob to get date of birth on driver license using Java Local Date library (specified in main
   * method)
   *
   * @return String date of birth on drive license
   */
  public String getDob() {
    if (isValidDob() == false) {
      return null;
    } else {
      return dob;
    }
  }

  /**
   * getIssueDate to get issue date on driver license using Java Local Date library (specified in
   * main method)
   *
   * @return String issue date on driver license
   */
  public String getIssueDate() {
    if (isValidIssueDate() == false) {
      return null;
    } else {
      return issueDate;
    }
  }

  /**
   * getExpireDate to get expiration date on driver license using Java Local Date library (specified
   * in main method)
   *
   * @return String expiration date on drive license
   */
  public String getExpireDate() {
    if (isValidExpireDate() == false) {
      return null;
    } else {
      return expireDate;
    }
  }

  /**
   * isValidLicenseNumber to check if license number is valid
   *
   * @return true if valid. false if invalid (i.e. null or "")
   */
  public boolean isValidLicenseNumber() {
    if ((licenseNumber != null) && (licenseNumber != "")) {
      if (licenseNumber.length() > 0) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  /**
   * isValidName to check if name of driver license is valid
   *
   * @return true if valid. false if invalid (i.e. null or "")
   */
  public boolean isValidName() {
    if ((name != null) && (name != "")) {
      if (name.length() > 0) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  /**
   * isValidDob to check if date of birth on driver license is valid
   *
   * @return true if valid. false if invalid (i.e. null or "")
   */
  public boolean isValidDob() {
    if ((dob != null) && (dob != "")) {
      if (dob.length() > 0) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  /**
   * isValidIssueDate to check if issue date on driver license is valid
   *
   * @return true if valid. false if invalid (i.e. null or "")
   */
  public boolean isValidIssueDate() {
    if ((issueDate != null) && (issueDate != "")) {
      if (issueDate.length() > 0) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  /**
   * isValidExpireDate to check if expiration date on driver license is valid
   *
   * @return true if valid. false if invalid (i.e. null or "")
   */
  public boolean isValidExpireDate() {
    if ((expireDate != null) && (expireDate != "")) {
      if (expireDate.length() > 0) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  /**
   * isValidAddress to check if address is valid
   *
   * @return true if valid. false if invalid (i.e. null or "" or does not contain correct state
   *     abbreviation)
   */
  public boolean isValidAddress() {
    if ((address != null) && (address != "") && (address.length() > 0)) {
      if (address.contains("AL")
          || address.contains("AK")
          || address.contains("AZ")
          || address.contains("AR")
          || address.contains("CA")
          || address.contains("CO")
          || address.contains("CT")
          || address.contains("DE")
          || address.contains("DC")
          || address.contains("FL")
          || address.contains("GA")
          || address.contains("HI")
          || address.contains("ID")
          || address.contains("IL")
          || address.contains("IN")
          || address.contains("IA")
          || address.contains("KS")
          || address.contains("KY")
          || address.contains("LA")
          || address.contains("ME")
          || address.contains("MD")
          || address.contains("MA")
          || address.contains("MI")
          || address.contains("MN")
          || address.contains("MS")
          || address.contains("MO")
          || address.contains("MT")
          || address.contains("NE")
          || address.contains("NV")
          || address.contains("NH")
          || address.contains("NJ")
          || address.contains("NM")
          || address.contains("NY")
          || address.contains("NC")
          || address.contains("ND")
          || address.contains("OH")
          || address.contains("OK")
          || address.contains("OR")
          || address.contains("PA")
          || address.contains("RI")
          || address.contains("SC")
          || address.contains("SD")
          || address.contains("TN")
          || address.contains("TX")
          || address.contains("UT")
          || address.contains("VT")
          || address.contains("VA")
          || address.contains("WA")
          || address.contains("WV")
          || address.contains("WI")
          || address.contains("WY")) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  //  /**
  //   * General isValid()
  //   *
  //   * @return
  //   */
  //  public boolean isValid() {
  //    if ((licenseNumber == null) || (licenseNumber == "")) {
  //      return false;
  //    } else if ((name == null) || (name == "")) {
  //      return false;
  //    } else if ((address == null) || (address == "")) {
  //      return false;
  //    } else if ((dob == null) || (dob == "")) {
  //      return false;
  //    } else if ((issueDate == null) || (issueDate == "")) {
  //      return false;
  //    } else if ((expireDate == null) || (expireDate == "")) {
  //      return false;
  //    } else {
  //
  //      boolean licenseNumberOk = licenseNumber.length() > 0;
  //      boolean nameOk = name.length() > 0;
  //      boolean dobOk = dob.length() > 0;
  //      boolean issueDateOk = issueDate.length() > 0;
  //      boolean expireDateOk = expireDate.length() > 0;
  //
  //      boolean addressOk =
  //          (address.length() > 0)
  //              && ((address.contains("AL")
  //                  || address.contains("AK")
  //                  || address.contains("AZ")
  //                  || address.contains("AR")
  //                  || address.contains("CA")
  //                  || address.contains("CO")
  //                  || address.contains("CT")
  //                  || address.contains("DE")
  //                  || address.contains("DC")
  //                  || address.contains("FL")
  //                  || address.contains("GA")
  //                  || address.contains("HI")
  //                  || address.contains("ID")
  //                  || address.contains("IL")
  //                  || address.contains("IN")
  //                  || address.contains("IA")
  //                  || address.contains("KS")
  //                  || address.contains("KY")
  //                  || address.contains("LA")
  //                  || address.contains("ME")
  //                  || address.contains("MD")
  //                  || address.contains("MA")
  //                  || address.contains("MI")
  //                  || address.contains("MN")
  //                  || address.contains("MS")
  //                  || address.contains("MO")
  //                  || address.contains("MT")
  //                  || address.contains("NE")
  //                  || address.contains("NV")
  //                  || address.contains("NH")
  //                  || address.contains("NJ")
  //                  || address.contains("NM")
  //                  || address.contains("NY")
  //                  || address.contains("NC")
  //                  || address.contains("ND")
  //                  || address.contains("OH")
  //                  || address.contains("OK")
  //                  || address.contains("OR")
  //                  || address.contains("PA")
  //                  || address.contains("RI")
  //                  || address.contains("SC")
  //                  || address.contains("SD")
  //                  || address.contains("TN")
  //                  || address.contains("TX")
  //                  || address.contains("UT")
  //                  || address.contains("VT")
  //                  || address.contains("VA")
  //                  || address.contains("WA")
  //                  || address.contains("WV")
  //                  || address.contains("WI")
  //                  || address.contains("WY")));
  //
  //      return licenseNumberOk && nameOk && dobOk && issueDateOk && expireDateOk && addressOk;
  //    }
  //  }

  /**
   * set notes
   *
   * @param notes - optional notes for driver license
   */
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * set license number
   *
   * @param licenseNumber - license number on driver license
   */
  public void setLicenseNumber(int licenseNumber) {
    this.licenseNumber = Integer.toString(licenseNumber);
  }

  /**
   * set name
   *
   * @param name - name on driver license
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * set address
   *
   * @param address - address on driver license
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * set date of birth
   *
   * @param dob - date of birth on driver license
   */
  public void setDob(String dob) {
    this.dob = dob;
  }

  /**
   * set issue date
   *
   * @param issueDate - issue date on driver license
   */
  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }

  /**
   * set expiration date
   *
   * @param expireDate - expiration date on driver license
   */
  public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
  }
}
