/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  isValidUrl() - Regular Expression Test is from https://www.geeksforgeeks.org/check-if-an-url-is-valid-or-not-using-regular-expression/
 */

package edu.uab.chattada.p5;

import java.util.ArrayList;
import java.lang.String;
import edu.uab.chattada.p5.Fields;
import java.util.regex.Pattern;

public class LoginItem extends LockerItem {

  protected String username;
  protected String password;
  protected String url;
  protected String type;

  ArrayList<Fields> LI_ArrayList = new ArrayList<>();

  public LoginItem(String name, String notes, String username, String password, String url) {

    super(name, notes);
    this.username = username;
    this.password = password;
    this.url = url;
    this.type = "Login Item";

    LI_ArrayList.add(new NoteField("Notes: ", getNotes()));
    LI_ArrayList.add(new TextField("Name: ", getName()));
    LI_ArrayList.add(new TextField("Username: ", getUsername()));
    LI_ArrayList.add(new TextField("Type: ", getType()));
    LI_ArrayList.add(new PasswordField("Password: ", getPassword()));
    LI_ArrayList.add(new TextField("URL: ", getUrl()));
  }

  @Override
  public String toString() {
    output = "";
    for (var toString : LI_ArrayList) {
      output += toString.getName() + toString.getValue() + "\n";
    }
    output += "\n";

    return output;
  }

  @Override
  public String getNotes() {
    return notes;
  }

  @Override
  public String getName() {
    if (isValidName() == false) {
      return null;
    } else {
      return name;
    }
  }

  public String getUsername() {
    if (isValidUsername() == false) {
      return null;
    } else {
      return username;
    }
  }

  public String getPassword() {
    if (isValidPassword() == false) {
      return null;
    } else {
      return password;
    }
  }

  public String getUrl() {
    if (isValidUrl() == false) {
      return null;
    } else {
      return url;
    }
  }

  public boolean isValidName() {
    if ((name != null) || (name != "")) {
      return name.length() > 0;
    } else {
      return false;
    }
  }

  public boolean isValidUsername() {
    if ((username != null) || (username != "")) {
      return username.length() > 0;
    } else {
      return false;
    }
  }

  public boolean isValidPassword() {
    if ((password != null) || (password != "")) {
      return password.length() > 0;
    } else {
      return false;
    }
  }

  /**
   * Is the object valid
   *
   * @return true if valid otherwise false
   */
  public boolean isValidUrl() {

    // regular expression test does not like to be fed a null url
    if (url == null) {
      return false;
    }

    /*
     * Regular Expression Test is from https://www.geeksforgeeks.org/check-if-an-url-is-valid-or-not-using-regular-expression/
     */
    var p =
        Pattern.compile(
            "((http|https)://)(www.)?"
                + "[a-zA-Z0-9@:%._\\+~#?&//=]"
                + "{2,256}\\.[a-z]"
                + "{2,6}\\b([-a-zA-Z0-9@:%"
                + "._\\+~#?&//=]*)");
    var m = p.matcher(url);
    return m.matches();
  }

  @Override
  public String getType() {
    return type;
  }

  @Override
  public void setNotes(String notes) {
    this.notes = notes;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public void setType(String type) {
    this.type = type;
  }
}
