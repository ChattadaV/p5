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

/**
 * Sub class WirelessAccessPointsItem that stores all confidential and non-confidential Wireless
 * Access Points Information
 *
 * @author Chattada Viriyaphap <chattada@uab.edu>
 */
public class WirelessAccessPointsItem extends LockerItem {

  // set type
  protected String networkType;
  protected String ssid;
  protected String password;
  protected String hidden;
  protected String output;

  // ArrayList of Wireless Access Points Items/Info
  ArrayList<Fields> WAPI_ArrayList = new ArrayList<>();

  /**
   * Main method to create Wireless Access Points Items/Info in ArrayList
   *
   * @param name - name of Wireless Access Points
   * @param notes - optional notes for Wireless Access Points
   * @param ssid - ssid (identification abbreviation) for Wireless Access Points
   * @param networkType - type of network for Wireless Access Points
   * @param password - password (if any) to access Wireless Access Points
   * @param hidden - if Wireless Access Points is hidden or not
   */
  public WirelessAccessPointsItem(
      String name, String notes, String ssid, String networkType, String password, String hidden) {
    super(name, notes); // calling name and value from superclass LockerItem

    this.ssid = ssid;
    this.networkType = networkType;
    this.password = password;
    this.hidden = hidden;
    this.type = "Wireless Access Points";

    // ArrayList of Wireless Access Points Items/Info
    WAPI_ArrayList.add(new NoteField("Notes: ", getNotes()));
    WAPI_ArrayList.add(new TextField("Name: ", getName()));
    WAPI_ArrayList.add(new TextField("SSID: ", getSsid()));
    WAPI_ArrayList.add(new TextField("Network Type: ", getNetworkType()));
    WAPI_ArrayList.add(new TextField("Password: ", getPassword()));
    WAPI_ArrayList.add(new TextField("Hidden: ", getHidden()));
    WAPI_ArrayList.add(new TextField("UID: ", getUid()));
  }

  /**
   * toString to get a text block of all wireless access points items/info
   *
   * @return String text representation (text block) of all wireless access points items/info
   */
  @Override
  public String toString() {
    output = "";
    for (var toString : WAPI_ArrayList) {
      output += toString.getName() + toString.getValue() + "\n";
    }
    output += "\n";

    return output;
  }

  /**
   * getNotes to get optional notes of wireless access points
   *
   * @return String optional notes of wireless access points
   */
  public String getNotes() {
    return notes;
  }

  /**
   * getName to get the name of wireless access points
   *
   * @return String name of wireless access points
   */
  public String getName() {
    if (isValidName() == false) {
      return null;
    } else {
      return name;
    }
  }

  /**
   * getSsid to get ssid (identification abbreviation) of wireless access points
   *
   * @return String ssid (identification abbreviation) of wireless access points
   */
  public String getSsid() {
    if (isValidSsid() == false) {
      return null;
    } else {
      return ssid;
    }
  }

  /**
   * getNetworkType to get type of network of wireless access points
   *
   * @return String type of network of wireless access points
   */
  public String getNetworkType() {
    if (isValidNetworkType() == false) {
      return null;
    } else {
      return networkType;
    }
  }

  /**
   * getPassword to get password to access wireless access points
   *
   * @return String password to access wireless access points
   */
  public String getPassword() {
    if (isValidPassword() == false) {
      return null;
    } else {
      return password;
    }
  }

  /**
   * getHidden to check if wireless access points is hidden or not
   *
   * @return String yes if wireless access points is hidden. no if wireless access points is not
   *     hidden.
   */
  public String getHidden() {
    if (isValidHidden() == false) {
      return null;
    } else {
      return hidden;
    }
  }

  /**
   * getType to get type of item (wireless access points)
   *
   * @return String of type (wireless access points)
   */
  public String getType() {
    return type;
  }

  /**
   * isValidName to check if name of wireless access points is valid
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
   * isValidHidden to check if wireless access point's hidden or not hidden keyword is valid
   *
   * @return true if valid. false if invalid (i.e. does not contain "yes" or "no")
   */
  public boolean isValidHidden() {
    if (hidden.equalsIgnoreCase("yes") || hidden.equalsIgnoreCase("no")) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * isValidNetworkType to check if network type of wireless access points is valid
   *
   * @return true if valid. false if invalid (i.e. does not contain "WEP" or "WPA/WPA2" or "no
   *     encryption"))
   */
  public boolean isValidNetworkType() {
    if (networkType.equalsIgnoreCase("WEP")
        || networkType.equalsIgnoreCase("WPA/WPA2")
        || networkType.equalsIgnoreCase("no encryption") == true) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * isValidPassword to check if password of wireless access points is valid
   *
   * @return true if valid. false if invalid (i.e. null or "" when encrypted. not null or not ""
   *     when not encrypted)
   */
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

  /**
   * isValidSsid to check if ssid (identification abbreviation) of wireless access points is valid
   *
   * @return true if valid. false if invalid (i.e. null or "")
   */
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

  /**
   * set type of network
   *
   * @param networkType - type of network of wireless access points
   */
  public void setNetworkType(String networkType) {
    this.networkType = deNull(networkType);
  }

  /**
   * set ssid (identification abbreviation)
   *
   * @param ssid - ssid (identification abbreviation) of wireless access points
   */
  public void setSsid(String ssid) {
    this.ssid = deNull(ssid);
  }

  /**
   * set password of wireless access points
   *
   * @param password - password of wireless access points
   */
  public void setPassword(String password) {
    this.password = deNull(password);
  }

  /**
   * set if wireless access points is hidden or not
   *
   * @param hidden - wireless access points is hidden or not hidden
   */
  public void setHidden(String hidden) {
    this.hidden = hidden;
  }

  /**
   * set type of item (wireless access points)
   *
   * @param type - type of item (wireless access points)
   */
  public void setTtpe(String type) {
    this.type = type;
  }

  /**
   * deNull to return "" if text is null
   *
   * @param text - input text (any info of wireless access points)
   * @return String "" when input text is null
   */
  private String deNull(String text) {
    if (text == null) {
      return "";
    } else {
      return text;
    }
  }
}
