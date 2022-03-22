/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

import java.util.ArrayList;

public class DriverLicenseItem extends LockerItem {

  private String address;
  private String uid;
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
      String uid,
      String address,
      String dob,
      String issueDate,
      String expireDate) {

    super(name, notes); // superclass LockerItem

    this.address = address;
    this.uid = uid;
    this.dob = dob;
    this.issueDate = issueDate;
    this.expireDate = expireDate;
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
    DLI_ArrayList.add(new TextField("License Number: ", getUid()));
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
            + "\n";

    return output;
  }

  public String getNotes() {
    if (isValid() == false) {
      return null;
    } else {
      return notes;
    }
  }

  public String getUid() {
    if (isValid() == false) {
      return null;
    } else {
      return uid;
    }
  }

  public String getName() {
    if (isValid() == false) {
      return null;
    } else {
      return name;
    }
  }

  public String getAddress() {
    if (isValid() == false) {
      return null;
    } else {
      return address;
    }
  }

  public String getDob() {
    if (isValid() == false) {
      return null;
    } else {
      return dob;
    }
  }

  public String getIssueDate() {
    if (isValid() == false) {
      return null;
    } else {
      return issueDate;
    }
  }

  public String getExpireDate() {
    if (isValid() == false) {
      return null;
    } else {
      return expireDate;
    }
  }

  public boolean isValid() {
    if (notes == null) {
      return false;
    } else if ((uid == null) || (uid == "")) {
      return false;
    } else if ((name == null) || (name == "")) {
      return false;
    } else if ((address == null) || (address == "")) {
      return false;
    } else if ((dob == null) || (dob == "")) {
      return false;
    } else if ((issueDate == null) || (issueDate == "")) {
      return false;
    } else if ((expireDate == null) || (expireDate == "")) {
      return false;
    } else {
      return true;
    }
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public void setUid(String uid) {
    this.uid = uid;
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
