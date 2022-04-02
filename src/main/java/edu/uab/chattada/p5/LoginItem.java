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
    LI_ArrayList.add(new UrlField("URL: ", getUrl()));
  }

  public String getNotes() {
    return notes;
  }

  public String getName() {
    return name;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public String getType() {
    return type;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

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
