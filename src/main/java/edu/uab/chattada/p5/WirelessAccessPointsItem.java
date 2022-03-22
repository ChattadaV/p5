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

  private String description;
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

    WAPI_ArrayList.add(new NoteField("Notes: ", notes));
    WAPI_ArrayList.add(new TextField("Name: ", name));
    WAPI_ArrayList.add(new TextField("SSID: ", ssid));
    WAPI_ArrayList.add(new TextField("Network Type: ", networkType));
    WAPI_ArrayList.add(new TextField("Password: ", password));
    WAPI_ArrayList.add(new TextField("Hidden: ", hidden));
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
            + "\n";

    return output;
  }

  //  public boolean isValid() {
  //
  //    boolean networkTypeOk =
  //        networkType.equals("WEP")
  //            || networkType.equals("WPA/WPA2")
  //            || networkType.equals("no encryption");
  //
  //    boolean ssidOK = ssid.length() > 0;
  //
  //    return networkTypeOk && ssidOK;
  //  }
  //
  //  public void setNetworkType(String networkType) {
  //    this.networkType = deNull(networkType);
  //  }
  //
  //  public void setSsid(String ssid) {
  //    this.ssid = deNull(ssid);
  //  }
  //
  //  public void setPassword(String password) {
  //    this.password = deNull(password);
  //  }
  //
  //  public void setHidden(boolean hidden) {
  //    this.hidden = hidden;
  //  }
  //
  //  private String deNull(String text) {
  //    if (text == null) {
  //      return "";
  //    } else {
  //      return text;
  //    }
  //  }
}
