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

public class DriverLicenseItem extends LockerItem {

  private String address;
  private String licenseNumber;
  private String dob;
  private String issueDate;
  private String expireDate;
  private String output;

  //  private int dob_year;
  //  private int dob_month;
  //  private int dob_day;
  //  private int issueDate_year;
  //  private int issueDate_month;
  //  private int issueDate_day;
  //  private int expireDate_year;
  //  private int expireDate_month;
  //  private int expireDate_day;

  ArrayList<Fields> DLI_ArrayList = new ArrayList<>();

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

    super(name, notes); // superclass LockerItem

    this.address = address;
    this.licenseNumber = Integer.toString(licenseNumber);
    dob = LocalDate.of(dobYear, dobMonth, dobDay).toString();
    issueDate = LocalDate.of(issueYear, issueMonth, issueDay).toString();
    expireDate = LocalDate.of(expireYear, expireMonth, expireDay).toString();
    //    this.dob_year = dob_year;
    //    this.dob_month = dob_month;
    //    this.dob_day = dob_day;
    //    this.issueDate_year = issueDate_year;
    //    this.issueDate_month = issueDate_month;
    //    this.issueDate_day = issueDate_day;
    //    this.expireDate_year = expireDate_year;
    //    this.expireDate_month = expireDate_month;
    //    this.expireDate_day = expireDate_day;

    DLI_ArrayList.add(new NoteField("Notes: ", getNotes()));
    DLI_ArrayList.add(new TextField("License Number: ", getLicenseNumber()));
    DLI_ArrayList.add(new TextField("Name: ", getName()));
    DLI_ArrayList.add(new TextField("Address: ", getAddress()));
    DLI_ArrayList.add(new DateField("DOB: ", getDob()));
    DLI_ArrayList.add(new DateField("Issue Date: ", getIssueDate()));
    DLI_ArrayList.add(new DateField("Expire Date: ", getExpireDate()));

    //    TextField DLI_name = new TextField("Name", this.name);
    //    NoteField DLI_notes = new NoteField("Notes", this.notes);
    //    TextField DLI_address = new TextField("Address", this.address);
    //    TextField DLI_dob = new TextField("DOB", this.dob);
    //    DateField DLI_issueDate =
    //        new DateField("Issue Date", this.issueDate_year, this.issueDate_month,
    // this.issueDate_day);
    //    DateField DLI_expireDate =
    //        new DateField(
    //            "Expire Date", this.expireDate_year, this.expireDate_month, this.expireDate_day);
  }

  @Override
  public String toString() {
    output = "\n";
    output +=
        DLI_ArrayList.get(0).getName()
            + DLI_ArrayList.get(0).getValue()
            + "\n"
            + DLI_ArrayList.get(1).getName()
            + DLI_ArrayList.get(1).getValue()
            + "\n"
            + DLI_ArrayList.get(2).getName()
            + DLI_ArrayList.get(2).getValue()
            + "\n"
            + DLI_ArrayList.get(3).getName()
            + DLI_ArrayList.get(3).getValue()
            + "\n"
            + DLI_ArrayList.get(4).getName()
            + DLI_ArrayList.get(4).getValue()
            + "\n"
            + DLI_ArrayList.get(5).getName()
            + DLI_ArrayList.get(5).getValue()
            + "\n"
            + DLI_ArrayList.get(6).getName()
            + DLI_ArrayList.get(6).getValue()
            + "\n\n"
            + "================================================================================================"
            + "\n";

    return output;
  }

  public String getNotes() {
    return notes;
  }

  public String getName() {
    return name;
  }

  public String getLicenseNumber() {
    if (isValidLicenseNumber() == false) {
      return null;
    } else {
      return licenseNumber;
    }
  }

  public String getAddress() {
    if (isValidAddress() == false) {
      return null;
    } else {
      return address;
    }
  }

  public String getDob() {
    if (isValidDob() == false) {
      return null;
    } else {
      return dob;
    }
  }

  public String getIssueDate() {
    if (isValidIssueDate() == false) {
      return null;
    } else {
      return issueDate;
    }
  }

  public String getExpireDate() {
    if (isValidExpireDate() == false) {
      return null;
    } else {
      return expireDate;
    }
  }

  public boolean isValidLicenseNumber() {
    if ((licenseNumber != null) && (licenseNumber != "") && (licenseNumber.length() > 0)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isValidName() {
    if ((name != null) && (name != "") && (name.length() > 0)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isValidDob() {
    if ((dob != null) && (dob != "") && (dob.length() > 0)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isValidIssueDate() {
    if ((issueDate != null) && (issueDate != "") && (issueDate.length() > 0)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isValidExpireDate() {
    if ((expireDate != null) && (expireDate != "") && (expireDate.length() > 0)) {
      return true;
    } else {
      return false;
    }
  }

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

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public void setLicenseNumber(int licenseNumber) {
    this.licenseNumber = Integer.toString(licenseNumber);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }

  public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
  }
}
