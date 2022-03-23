/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

import java.util.ArrayList;
import java.lang.String;
import edu.uab.chattada.p5.Fields;

public class WirelessAccessPointsItem extends LockerItem {

  private String networkType;
  private String ssid;
  private String password;
  private String hidden;
  private String output;

  ArrayList<Fields> WAPI_ArrayList = new ArrayList<>();

  public WirelessAccessPointsItem(
      String name, String notes, String ssid, String networkType, String password, String hidden) {
    super(name, notes); // superclass LockerItem

    this.ssid = ssid;
    this.networkType = networkType;
    this.password = password;
    this.hidden = hidden;

    WAPI_ArrayList.add(new NoteField("Notes: ", getNotes()));
    WAPI_ArrayList.add(new TextField("Name: ", getName()));
    WAPI_ArrayList.add(new TextField("SSID: ", getSsid()));
    WAPI_ArrayList.add(new TextField("Network Type: ", getNetworkType()));
    WAPI_ArrayList.add(new TextField("Password: ", getPassword()));
    WAPI_ArrayList.add(new TextField("Hidden: ", getHidden()));
  }

  @Override
  public String toString() {
    output = "\n";
    output +=
        WAPI_ArrayList.get(0).getName()
            + WAPI_ArrayList.get(0).getValue()
            + "\n"
            + WAPI_ArrayList.get(1).getName()
            + WAPI_ArrayList.get(1).getValue()
            + "\n"
            + WAPI_ArrayList.get(2).getName()
            + WAPI_ArrayList.get(2).getValue()
            + "\n"
            + WAPI_ArrayList.get(3).getName()
            + WAPI_ArrayList.get(3).getValue()
            + "\n"
            + WAPI_ArrayList.get(4).getName()
            + WAPI_ArrayList.get(4).getValue()
            + "\n"
            + WAPI_ArrayList.get(5).getName()
            + WAPI_ArrayList.get(5).getValue()
            + "\n\n"
            + "================================================"
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

  public String getName() {
    if (isValid() == false) {
      return null;
    } else {
      return name;
    }
  }

  public String getSsid() {
    if (isValid() == false) {
      return null;
    } else {
      return ssid;
    }
  }

  public String getNetworkType() {
    if (isValid() == false) {
      return null;
    } else {
      return networkType;
    }
  }

  public String getPassword() {
    if (isValid() == false) {
      return null;
    } else {
      return password;
    }
  }

  public String getHidden() {
    if (isValid() == false) {
      return null;
    } else {
      return hidden;
    }
  }

  public boolean isValid() {

    // equalsIgnoreCase to make it not case-sensitive

    if (networkType.equalsIgnoreCase("no encryption")) {
      if ((password != null) || (password != "")) {
        return false;
      }
    }

    boolean nameOk = name.length() > 0;

    boolean hiddenOk = hidden.equalsIgnoreCase("yes") || hidden.equalsIgnoreCase("no");

    boolean networkTypeOk =
        networkType.equalsIgnoreCase("WEP")
            || networkType.equalsIgnoreCase("WPA/WPA2")
            || networkType.equalsIgnoreCase("no encryption");

    boolean ssidOk = ssid.length() > 0;

    return nameOk && hiddenOk && networkTypeOk && ssidOk;
  }

  public void setNetworkType(String networkType) {
    this.networkType = deNull(networkType);
  }

  public void setSsid(String ssid) {
    this.ssid = deNull(ssid);
  }

  public void setPassword(String password) {
    this.password = deNull(password);
  }

  public void setHidden(String hidden) {
    this.hidden = hidden;
  }

  private String deNull(String text) {
    if (text == null) {
      return "";
    } else {
      return text;
    }
  }
}
