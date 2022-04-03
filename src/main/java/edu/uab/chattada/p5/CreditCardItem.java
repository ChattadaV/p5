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
 * Subclass CreditCardItem that stores both confidential and non confidential credit card
 * information
 *
 * @author Chattada Viriyaphap <chattada@uab.edu>
 */
public class CreditCardItem extends LockerItem {

  /** set type of cardNumber01 */
  protected String cardNumber01;
  /** set type of cardNumber02 */
  protected String cardNumber02;
  /** set type of cardNumber03 */
  protected String cardNumber03;
  /** set type of cardNumber04 */
  protected String cardNumber04;
  /** set type of expireDate */
  protected String expireDate;
  /** set type of cvv */
  protected String cvv;
  /** set type of pin */
  protected String pin;
  /** set type of zipCode */
  protected String zipCode;
  /** set type of issuerPhone */
  protected String issuerPhone;
  /** set type of output */
  protected String output;

  // Info ArrayList of Credit Card Item
  ArrayList<Fields> CCI_ArrayList = new ArrayList<>();

  /**
   * Main method to create credit card info in ArrayList
   *
   * @param name - name of credit card's owner
   * @param notes - optional notes for credit card
   * @param cardNumber01 - first 4 digit of credit card number (16 total)
   * @param cardNumber02 - second 4 digit of credit card number (16 total)
   * @param cardNumber03 - third 4 digit of credit card number (16 total)
   * @param cardNumber04 - last 4 digit of credit card number (16 total)
   * @param expireYear - card expiration year
   * @param expireMonth - card expiration month
   * @param expireDay - card expiration day
   * @param cvv - security code on the back of credit card
   * @param pin - pin to access credit card
   * @param zipCode - zip code of credit card's owner's residence
   * @param issuerPhone - credit card's company phone number
   */
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

    super(name, notes); // callling name and notes from superclass LockerItem

    // Using Java LocalDate library to obtain card expiration date
    this.expireDate = LocalDate.of(expireYear, expireMonth, expireDay).toString();

    this.cardNumber01 = Integer.toString(cardNumber01);
    this.cardNumber02 = Integer.toString(cardNumber02);
    this.cardNumber03 = Integer.toString(cardNumber03);
    this.cardNumber04 = Integer.toString(cardNumber04);
    this.cvv = Integer.toString(cvv);
    this.pin = Integer.toString(pin);
    this.zipCode = Integer.toString(zipCode);
    this.issuerPhone = Integer.toString(issuerPhone);
    this.type = "Credit Card";

    // ArrayList of Credit Card Item/Info
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

  /**
   * toString to get a text block of all credit card item/info
   *
   * @return String text representation (text block) of all credit card item/info
   */
  @Override
  public String toString() {
    output = "";
    for (var toString : CCI_ArrayList) {
      output = output + toString.getName() + toString.getValue() + "\n";
    }
    output += "\n";

    return output;
  }

  /**
   * getNotes to get optional notes of credit card
   *
   * @return String optional notes of credit card
   */
  public String getNotes() {
    return notes;
  }

  /**
   * getName to get the name of credit card's owner
   *
   * @return String name of credit card's owner
   */
  public String getName() {
    if (isValidName() == false) {
      return null;
    } else {
      return name;
    }
  }

  /**
   * getCardNumber to get all 16 digits of credit card number
   *
   * @return String 16-digit credit card number
   */
  public String getCardNumber() {
    if ((isValidCardNumber01()
            && isValidCardNumber02()
            && isValidCardNumber03()
            && isValidCardNumber04())
        == true) {
      return cardNumber01 + " " + cardNumber02 + " " + cardNumber03 + " " + cardNumber04;
    } else {
      return null;
    }
  }

  /**
   * getExpireDate to get expiration date of credit card using Java Local Date library (specified in
   * main method)
   *
   * @return String expiration date of credit card
   */
  public String getExpireDate() {
    if (isValidExpireDate() == false) {
      return null;
    } else {
      return expireDate;
    }
  }

  /**
   * getCvv to get security code (cvv) on the back of credit card
   *
   * @return String 3-digit security code (cvv) on the back of credit card
   */
  public String getCvv() {
    if (isValidCvv() == false) {
      return null;
    } else {
      return cvv;
    }
  }

  /**
   * getPin to get pin to access/use credit card
   *
   * @return String pin to access/use credit card
   */
  public String getPin() {
    if (isValidPin() == false) {
      return null;
    } else {
      return pin;
    }
  }

  /**
   * getZipCode to get the zip code of credit card's owner's residence (required in some cases to
   * access/use credit card)
   *
   * @return String 5-digit zip code of credit card's owner's residence
   */
  public String getZipCode() {
    if (isValidZipCode() == false) {
      return null;
    } else {
      return zipCode;
    }
  }

  /**
   * getIssuerPhone to get credit card's company phone number (used to activate, deactivate, or ask
   * customer representatives some questions)
   *
   * @return String 10-digit credit card's company phone number
   */
  public String getIssuerPhone() {
    if (isValidIssuerPhone() == false) {
      return null;
    } else {
      return issuerPhone;
    }
  }

  /**
   * isValidName to check if the credit card's owner's name is valid
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
   * isValidCardNumber01 to check if the first 4 digits of credit card number is valid
   *
   * @return true if valid. false if invalid (i.e. null or "" or does not contain 4-digit number)
   */
  public boolean isValidCardNumber01() {
    if ((cardNumber01 != null) && (cardNumber01 != "")) {
      if (cardNumber01.length() == 4) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  /**
   * isValidCardNumber02 to check if the second 4 digits of credit card number is valid
   *
   * @return true if valid. false if invalid (i.e. null or "" or does not contain 4-digit number)
   */
  public boolean isValidCardNumber02() {
    if ((cardNumber02 != null) && (cardNumber02 != "")) {
      if (cardNumber02.length() == 4) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  /**
   * isValidCardNumber03 to check if the third 4 digits of credit card number is valid
   *
   * @return true if valid. false if invalid (i.e. null or "" or does not contain 4-digit number)
   */
  public boolean isValidCardNumber03() {
    if ((cardNumber03 != null) && (cardNumber03 != "")) {
      if (cardNumber03.length() == 4) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  /**
   * isValidCardNumber04 to check if the last 4 digits of credit card number is valid
   *
   * @return true if valid. false if invalid (i.e. null or "" or does not contain 4-digit number)
   */
  public boolean isValidCardNumber04() {
    if ((cardNumber04 != null) && (cardNumber04 != "")) {
      if (cardNumber04.length() == 4) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  /**
   * isValidExpireDate to check if the expiration date of credit card is valid
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
   * isValidCvv to check if the security code (cvv)on the back of credit card is valid
   *
   * @return true if valid. false if invalid (i.e. null or "" or does not contain 3-digit number)
   */
  public boolean isValidCvv() {
    if ((cvv != null) && (cvv != "")) {
      if (cvv.length() == 3) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  /**
   * isValidPin to check if the pin to access/use credit card is valid
   *
   * @return true if valid. false if invalid (i.e. null or "")
   */
  public boolean isValidPin() {
    if ((pin != null) && (pin != "")) {
      if (pin.length() > 0) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  /**
   * isValidZipCode to check if the zip code of credit card's owner's residence is valid
   *
   * @return true if valid. false if invalid (i.e. null or "" or does not contain 5-digit number)
   */
  public boolean isValidZipCode() {
    if ((zipCode != null) && (zipCode != "")) {
      if (zipCode.length() == 5) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  /**
   * isValidIssuerPhone to check if the credit card's company phone number is valid
   *
   * @return true if valid. false if invalid (i.e. null or "" or does not contain 10-digit number)
   */
  public boolean isValidIssuerPhone() {
    if ((issuerPhone != null) && (issuerPhone != "")) {
      if (issuerPhone.length() == 10) {
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

  /**
   * set notes
   *
   * @param notes - optional notes for credit card
   */
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * set name
   *
   * @param name - name of credit card's owner
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * set first 4 digits of credit card number
   *
   * @param cardNumber01 - first 4 digits of credit card number
   */
  public void setCardNumber01(int cardNumber01) {
    this.cardNumber01 = Integer.toString(cardNumber01);
  }

  /**
   * set second 4 digits of credit card number
   *
   * @param cardNumber02 - second 4 digits of credit card number
   */
  public void setCardNumber02(int cardNumber02) {
    this.cardNumber03 = Integer.toString(cardNumber02);
  }

  /**
   * set third 4 digits of credit card number
   *
   * @param cardNumber03 - third 4 digits of credit card number
   */
  public void setCardNumber03(int cardNumber03) {
    this.cardNumber03 = Integer.toString(cardNumber03);
  }

  /**
   * set last 4 digits of credit card number
   *
   * @param cardNumber04 - last 4 digits of credit card number
   */
  public void setCardNumber04(int cardNumber04) {
    this.cardNumber04 = Integer.toString(cardNumber04);
  }

  /**
   * set expiration date of credit card
   *
   * @param expireDate - expiration date of credit card
   */
  public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
  }

  /**
   * set security code (cvv) on the back of credit card
   *
   * @param cvv - security code (cvv) on the back of credit card
   */
  public void setCvv(int cvv) {
    this.cvv = Integer.toString(cvv);
  }

  /**
   * set pin to access/use credit card
   *
   * @param pin - pin to access/user credit card
   */
  public void setPin(int pin) {
    this.pin = Integer.toString(pin);
  }

  /**
   * set zip code of credit card's owner's residence
   *
   * @param zipCode - zip code of credit card's owner's residence
   */
  public void setZipCode(int zipCode) {
    this.zipCode = Integer.toString(zipCode);
  }

  /**
   * set phone number of credit card's company
   *
   * @param issuerPhone - phone number of credit card's company
   */
  public void setIssuerPhone(int issuerPhone) {
    this.issuerPhone = Integer.toString(issuerPhone);
  }
}
