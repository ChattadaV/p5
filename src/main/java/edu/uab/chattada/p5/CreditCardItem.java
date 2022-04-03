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

  protected String cardNumber01;
  protected String cardNumber02;
  protected String cardNumber03;
  protected String cardNumber04;
  protected String expireDate;
  protected String cvv;
  protected String pin;
  protected String zipCode;
  protected String issuerPhone;
  protected String output;

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
    this.type = "Credit Card";

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
    output = "";
    for (var toString : CCI_ArrayList) {
      output = output + toString.getName() + toString.getValue() + "\n";
    }
    output += "\n";

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
            && isValidCardNumber02()
            && isValidCardNumber03()
            && isValidCardNumber04())
        == true) {
      return cardNumber01 + " " + cardNumber02 + " " + cardNumber03 + " " + cardNumber04;
    } else {
      return null;
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
