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

  protected String networkType;
  protected String ssid;
  protected String password;
  protected String hidden;
  protected String output;

  ArrayList<Fields> WAPI_ArrayList = new ArrayList<>();

  public WirelessAccessPointsItem(
      String name, String notes, String ssid, String networkType, String password, String hidden) {
    super(name, notes); // superclass LockerItem

    this.ssid = ssid;
    this.networkType = networkType;
    this.password = password;
    this.hidden = hidden;
    this.type = "Wireless Access Points";

    WAPI_ArrayList.add(new NoteField("Notes: ", getNotes()));
    WAPI_ArrayList.add(new TextField("Name: ", getName()));
    WAPI_ArrayList.add(new TextField("SSID: ", getSsid()));
    WAPI_ArrayList.add(new TextField("Network Type: ", getNetworkType()));
    WAPI_ArrayList.add(new TextField("Password: ", getPassword()));
    WAPI_ArrayList.add(new TextField("Hidden: ", getHidden()));
    WAPI_ArrayList.add(new TextField("UID: ", getUid()));
  }

  @Override
  public String toString() {
    output = "";
    for (var toString : WAPI_ArrayList) {
      output += toString.getName() + toString.getValue() + "\n";
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

  public String getSsid() {
    if (isValidSsid() == false) {
      return null;
    } else {
      return ssid;
    }
  }

  public String getNetworkType() {
    if (isValidNetworkType() == false) {
      return null;
    } else {
      return networkType;
    }
  }

  public String getPassword() {
    if (isValidPassword() == false) {
      return null;
    } else {
      return password;
    }
  }

  public String getHidden() {
    if (isValidHidden() == false) {
      return null;
    } else {
      return hidden;
    }
  }

  public String getType() {
    return type;
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

  public boolean isValidHidden() {
    if (hidden.equalsIgnoreCase("yes") || hidden.equalsIgnoreCase("no")) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isValidNetworkType() {
    if (networkType.equalsIgnoreCase("WEP")
        || networkType.equalsIgnoreCase("WPA/WPA2")
        || networkType.equalsIgnoreCase("no encryption") == true) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isValidPassword() {
    if (networkType.equalsIgnoreCase("no encryption")) {
      if ((password != null) || (password != "")) {
        return false;
      } else {
        return true;
      }
    } else {
      if ((password == null) || (password == "")) {
        return false;
      } else {
        return true;
      }
    }
  }

  public boolean isValidSsid() {
    if ((ssid != null) && (ssid != "")) {
      if (ssid.length() > 0) {
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
  //
  //    // equalsIgnoreCase to make it not case-sensitive
  //
  //    if (networkType.equalsIgnoreCase("no encryption")) {
  //      if ((password != null) || (password != "")) {
  //        return false;
  //      }
  //    }
  //
  //    boolean nameOk = name.length() > 0;
  //
  //    boolean hiddenOk = hidden.equalsIgnoreCase("yes") || hidden.equalsIgnoreCase("no");
  //
  //    boolean networkTypeOk =
  //        networkType.equalsIgnoreCase("WEP")
  //            || networkType.equalsIgnoreCase("WPA/WPA2")
  //            || networkType.equalsIgnoreCase("no encryption");
  //
  //    boolean ssidOk = ssid.length() > 0;
  //
  //    return nameOk && hiddenOk && networkTypeOk && ssidOk;
  //  }

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

  public void setTtpe(String type) {
    this.type = type;
  }

  private String deNull(String text) {
    if (text == null) {
      return "";
    } else {
      return text;
    }
  }
}
