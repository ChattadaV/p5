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

public class CreditCardItem extends LockerItem {

  private String cardNumber01;
  private String cardNumber02;
  private String cardNumber03;
  private String cardNumber04;
  private String expireDate;
  private String cvv;
  private String pin;
  private String zipCode;
  private String issuerPhone;
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

  ArrayList<Fields> CCI_ArrayList = new ArrayList<>();

  public CreditCardItem(
      String name,
      String notes,
      int cardNumber01,
      int cardNumber02,
      int cardNumber03,
      int cardNumber04,
      int expireYear,
      int expireMonth,
      int expireDay,
      int cvv,
      int pin,
      int zipCode,
      int issuerPhone) {

    super(name, notes); // superclass LockerItem

    expireDate = LocalDate.of(expireYear, expireMonth, expireDay).toString();

    this.cardNumber01 = Integer.toString(cardNumber01);
    this.cardNumber02 = Integer.toString(cardNumber02);
    this.cardNumber03 = Integer.toString(cardNumber03);
    this.cardNumber04 = Integer.toString(cardNumber04);
    this.cvv = Integer.toString(cvv);
    this.pin = Integer.toString(pin);
    this.zipCode = Integer.toString(zipCode);
    this.issuerPhone = Integer.toString(issuerPhone);

    CCI_ArrayList.add(new NoteField("Notes: ", getNotes()));
    CCI_ArrayList.add(new TextField("Name: ", getName()));
    CCI_ArrayList.add(new TextField("Card Number: ", getCardNumber()));
    CCI_ArrayList.add(new DateField("Expiration Date: ", getExpireDate()));
    CCI_ArrayList.add(new TextField("CVV: ", getCvv()));
    CCI_ArrayList.add(new TextField("PIN: ", getPin()));
    CCI_ArrayList.add(new TextField("Zip Code: ", getZipCode()));
    CCI_ArrayList.add(new TextField("Issuer Phone Number: ", getIssuerPhone()));
    CCI_ArrayList.add(new TextField("UID: ", getUid()));
  }

  @Override
  public String toString() {
    //    output = "\n";
    //    output +=
    //        CCI_ArrayList.get(0).getName()
    //            + CCI_ArrayList.get(0).getValue()
    //            + "\n"
    //            + CCI_ArrayList.get(1).getName()
    //            + CCI_ArrayList.get(1).getValue()
    //            + "\n"
    //            + CCI_ArrayList.get(2).getName()
    //            + CCI_ArrayList.get(2).getValue()
    //            + "\n"
    //            + CCI_ArrayList.get(3).getName()
    //            + CCI_ArrayList.get(3).getValue()
    //            + "\n"
    //            + CCI_ArrayList.get(4).getName()
    //            + CCI_ArrayList.get(4).getValue()
    //            + "\n"
    //            + CCI_ArrayList.get(5).getName()
    //            + CCI_ArrayList.get(5).getValue()
    //            + "\n"
    //            + CCI_ArrayList.get(6).getName()
    //            + CCI_ArrayList.get(6).getValue()
    //            + "\n"
    //            + CCI_ArrayList.get(7).getName()
    //            + CCI_ArrayList.get(7).getValue()
    //            + "\n\n"
    //            +
    // "================================================================================================"
    //            + "\n";

    output = "";
    for (var toString : CCI_ArrayList) {
      output = output + toString.getName() + toString.getValue() + "\n";
    }
    output +=
        "=========================================================================================\n";

    return output;
  }

  public String getNotes() {
    return notes;
  }

  public String getName() {
    if (isValidName() == false) {
      return null;
    } else {
      return name;
    }
  }

  public String getCardNumber() {
    if ((isValidCardNumber01()
            || isValidCardNumber02()
            || isValidCardNumber03()
            || isValidCardNumber04())
        == false) {
      return null;
    } else {
      return cardNumber01 + " " + cardNumber02 + " " + cardNumber03 + " " + cardNumber04;
    }
  }

  public String getExpireDate() {
    if (isValidExpireDate() == false) {
      return null;
    } else {
      return expireDate;
    }
  }

  public String getCvv() {
    if (isValidCvv() == false) {
      return null;
    } else {
      return cvv;
    }
  }

  public String getPin() {
    if (isValidPin() == false) {
      return null;
    } else {
      return pin;
    }
  }

  public String getZipCode() {
    if (isValidZipCode() == false) {
      return null;
    } else {
      return zipCode;
    }
  }

  public String getIssuerPhone() {
    if (isValidIssuerPhone() == false) {
      return null;
    } else {
      return issuerPhone;
    }
  }

  public boolean isValidName() {
    if ((name != null) && (name != "") && (name.length() > 0)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isValidCardNumber01() {
    if ((cardNumber01 != null) && (cardNumber01 != "") && (cardNumber01.length() == 4)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isValidCardNumber02() {
    if ((cardNumber02 != null) && (cardNumber02 != "") && (cardNumber02.length() == 4)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isValidCardNumber03() {
    if ((cardNumber03 != null) && (cardNumber03 != "") && (cardNumber03.length() == 4)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isValidCardNumber04() {
    if ((cardNumber04 != null) && (cardNumber04 != "") && (cardNumber04.length() == 4)) {
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

  public boolean isValidCvv() {
    if ((cvv != null) && (cvv != "") && (cvv.length() == 3)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isValidPin() {
    if ((pin != null) && (pin != "") && (pin.length() == 3)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isValidZipCode() {
    if ((zipCode != null) && (zipCode != "") && (zipCode.length() == 5)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isValidIssuerPhone() {
    if ((issuerPhone != null) && (issuerPhone != "") && (issuerPhone.length() == 10)) {
      return true;
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
  //    if ((name == null) || (name == "")) {
  //      return false;
  //    } else if ((cardNumber01 == null) || (cardNumber01 == "")) {
  //      return false;
  //    } else if ((cardNumber02 == null) || (cardNumber02 == "")) {
  //      return false;
  //    } else if ((cardNumber03 == null) || (cardNumber03 == "")) {
  //      return false;
  //    } else if ((cardNumber04 == null) || (cardNumber04 == "")) {
  //      return false;
  //    } else if ((expireDate == null) || (expireDate == "")) {
  //      return false;
  //    } else if ((cvv == null) || (cvv == "")) {
  //      return false;
  //    } else if ((pin == null) || (pin == "")) {
  //      return false;
  //    } else if ((zipCode == null) || (zipCode == "")) {
  //      return false;
  //    } else if ((issuerPhone == null) || (issuerPhone == "")) {
  //      return false;
  //    } else {
  //
  //      boolean nameOk = name.length() > 0;
  //      boolean cardNumber01Ok = cardNumber01.length() == 4;
  //      boolean cardNumber02Ok = cardNumber02.length() == 4;
  //      boolean cardNumber03Ok = cardNumber03.length() == 4;
  //      boolean cardNumber04Ok = cardNumber04.length() == 4;
  //      boolean expireDateOk = expireDate.length() > 0;
  //      boolean cvvOk = cvv.length() == 3;
  //      boolean pinOk = pin.length() > 0;
  //      boolean zipCodeOk = zipCode.length() == 5;
  //      boolean issuerPhoneOk = issuerPhone.length() == 10;
  //
  //      return nameOk
  //          && cardNumber01Ok
  //          && cardNumber02Ok
  //          && cardNumber03Ok
  //          && cardNumber04Ok
  //          && expireDateOk
  //          && cvvOk
  //          && pinOk
  //          && zipCodeOk
  //          && issuerPhoneOk;
  //    }
  //  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCardNumber01(int cardNumber01) {
    this.cardNumber01 = Integer.toString(cardNumber01);
  }

  public void setCardNumber02(int cardNumber02) {
    this.cardNumber03 = Integer.toString(cardNumber02);
  }

  public void setCardNumber03(int cardNumber03) {
    this.cardNumber03 = Integer.toString(cardNumber03);
  }

  public void setCardNumber04(int cardNumber04) {
    this.cardNumber04 = Integer.toString(cardNumber04);
  }

  public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
  }

  public void setCvv(int cvv) {
    this.cvv = Integer.toString(cvv);
  }

  public void setPin(int pin) {
    this.pin = Integer.toString(pin);
  }

  public void setZipCode(int zipCode) {
    this.zipCode = Integer.toString(zipCode);
  }

  public void setIssuerPhone(int issuerPhone) {
    this.issuerPhone = Integer.toString(issuerPhone);
  }
}
