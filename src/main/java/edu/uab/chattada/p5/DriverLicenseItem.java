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

  public static java.util.ArrayList<Fields> DLI_ArrayList = new java.util.ArrayList<Fields>();

  public DriverLicenseItem(
      String name, String notes, String address, String dob, String issueDate, String expireDate) {

    super(name, notes);

    this.address = address;
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

    DLI_ArrayList.add(new TextField("Name: ", name));
    DLI_ArrayList.add(new NoteField("Notes: ", notes));
    DLI_ArrayList.add(new DateField("DOB: ", dob));
    DLI_ArrayList.add(new DateField("Issue Date: ", issueDate));
    DLI_ArrayList.add(new DateField("Expire Date: ", expireDate));

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
            + "\n";

    return output;
  }
}
