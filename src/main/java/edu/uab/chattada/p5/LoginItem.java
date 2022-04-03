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

/**
 * Sub class LoginItem that stores all information to log into the locker system
 *
 * @author Chattada Viriyaphap <chattada@uab.edu>
 */
public class LoginItem extends LockerItem {

  /** set type of username */
  protected String username;
  /** set type of password */
  protected String password;
  /** set type of url */
  protected String url;
  /** set type of type */
  protected String type;

  // ArrayList of all Login items
  ArrayList<Fields> LI_ArrayList = new ArrayList<>();

  /**
   * Main method to create Login Item/Info as a ArrayList
   *
   * @param name - name of Login Item
   * @param notes - optional notes of Login item
   * @param username - username of Login item (used to access locker system)
   * @param password - password of Login item (used to access locker system)
   * @param url - URL of Login item
   */
  public LoginItem(String name, String notes, String username, String password, String url) {

    super(name, notes); // calling name and notes from super class LockerItem
    this.username = username;
    this.password = password;
    this.url = url;
    this.type = "Login Item";

    // ArrayList that stores all Login items/info
    LI_ArrayList.add(new NoteField("Notes: ", getNotes()));
    LI_ArrayList.add(new TextField("Name: ", getName()));
    LI_ArrayList.add(new TextField("Username: ", getUsername()));
    LI_ArrayList.add(new TextField("Type: ", getType()));
    LI_ArrayList.add(new PasswordField("Password: ", getPassword()));
    LI_ArrayList.add(new TextField("URL: ", getUrl()));
  }

  /**
   * toString to get a text block of all login items/info
   *
   * @return String text representation (text block) of all login items/info
   */
  @Override
  public String toString() {
    output = "";
    for (var toString : LI_ArrayList) {
      output += toString.getName() + toString.getValue() + "\n";
    }
    output += "\n";

    return output;
  }

  /**
   * getNotes to get optional notes of login item/info
   *
   * @return String optional notes of login item/info
   */
  @Override
  public String getNotes() {
    return notes;
  }

  /**
   * getName to get name of specific login item/info
   *
   * @return String name of specific login item/info
   */
  @Override
  public String getName() {
    if (isValidName() == false) {
      return null;
    } else {
      return name;
    }
  }

  /**
   * getUsername to get username of login item/info
   *
   * @return String username of login item/info (used to access locker system)
   */
  public String getUsername() {
    if (isValidUsername() == false) {
      return null;
    } else {
      return username;
    }
  }

  /**
   * getPassword to get password of login item/info
   *
   * @return String password of login item/info (used to access locker system)
   */
  public String getPassword() {
    if (isValidPassword() == false) {
      return null;
    } else {
      return password;
    }
  }

  /**
   * getUrl to get URL of login item/info
   *
   * @return String URL of login item/info
   */
  public String getUrl() {
    if (isValidUrl() == false) {
      return null;
    } else {
      return url;
    }
  }

  /**
   * getType to get type of login item/info
   *
   * @return String type of login item/info
   */
  @Override
  public String getType() {
    return type;
  }

  /**
   * isValidName to check if name of login item/info is valid
   *
   * @return true if valid. false if invalid (i.e.null or "")
   */
  public boolean isValidName() {
    if ((name != null) || (name != "")) {
      return name.length() > 0;
    } else {
      return false;
    }
  }

  /**
   * isValidUsername to check if username of login item/info is valid
   *
   * @return true if valid. false if invalid (i.e.null or "")
   */
  public boolean isValidUsername() {
    if ((username != null) || (username != "")) {
      return username.length() > 0;
    } else {
      return false;
    }
  }

  /**
   * isValidPassword to check if password of login item/info is valid
   *
   * @return true if valid. false if invalid (i.e.null or "")
   */
  public boolean isValidPassword() {
    if ((password != null) || (password != "")) {
      return password.length() > 0;
    } else {
      return false;
    }
  }

  /**
   * isValidUrl to check if URL of login item/info is valid
   *
   * @return true if valid. false if invalid
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

  /**
   * set notes
   *
   * @param notes - optional notes of login items/info
   */
  @Override
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * set name
   *
   * @param name - name of login items/info
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   * set username
   *
   * @param username - username of login items/info (used to access locker system)
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * set password
   *
   * @param password - password of login items/info (used to access locker system)
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * set URL
   *
   * @param url - URL of login items/info
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * set type
   *
   * @param type - type of login items/info
   */
  @Override
  public void setType(String type) {
    this.type = type;
  }
}
