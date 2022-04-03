/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  isValidUrl() - Regular Expression Test is from https://www.geeksforgeeks.org/check-if-an-url-is-valid-or-not-using-regular-expression/
 */

package edu.uab.chattada.p5;

import java.util.regex.Pattern;

/**
 * Sub class UrlField that can display URL for specific item
 *
 * @author Chattada Viriyaphap <chattada@uab.edu>
 */
public final class UrlField extends Fields {

  /** set type of url */
  protected String url;

  /**
   * Main method to display URL for specific item
   *
   * @param name - type of URL (URL, Main website URL, personal website URL, etc)
   * @param url - value of URL (link)
   */
  public UrlField(String name, String url) {
    super(name, ""); // calling name from superclass Fields
    type = "URL Field";

    if (isValid() == true) {
      this.url = url;
    } else {
      this.url = null;
    }
  }

  /**
   * isValid() to check if the URL is valid
   *
   * @return true if valid. false if invalid.
   */
  public boolean isValid() {

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
   * Set (or change) the URL, it will affect the validity of the object
   *
   * @param url - new URL
   */
  public void setUrl(String url) {
    this.url = url;
  }
}
