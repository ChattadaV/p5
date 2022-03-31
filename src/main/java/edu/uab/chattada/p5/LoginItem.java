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

public class LoginItem extends LockerItem {

  private String username;
  private String password;
  private String url;

  ArrayList<Fields> LI_ArrayList = new ArrayList<>();

  public LoginItem(String name, String notes, String username, String password, String url) {

    super(name, notes);
    this.username = username;
    this.password = password;
    this.url = url;

    LI_ArrayList.add(new NoteField("Notes: ", notes));
    LI_ArrayList.add(new TextField("Name: ", name));
    LI_ArrayList.add(new TextField("Username: ", username));
    LI_ArrayList.add(new TextField("Password: ", password));
    LI_ArrayList.add(new UrlField("URL: ", url));

    // build a textfield named USERNAME with the value userName
    // add to fields
    // build a password field name PASSWORD with value password
    // add to fields
    // build url field with name URL with value url
    // add to fields
  }
}
