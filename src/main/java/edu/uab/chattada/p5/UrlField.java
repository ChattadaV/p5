/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

import java.util.regex.Pattern;

public class UrlField extends Fields {

  private String url;

  public UrlField(String name, String value, String url) {
    super(name, value);

    if (isValid() == false) {
      System.out.println("Invalid Url");
    } else {
      toString();
    }
  }

  /**
   * Is the object valid
   *
   * @return true if valid otherwise false
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
   * Get a text representation of object consisting of <code>QrUrl: description</code>
   *
   * @return text representation
   */
  @Override
  public String toString() {
    return "Url: " + url;
  }

  /**
   * Set (or change) the URL, it will affect the validity of the object
   *
   * @param url new url
   */
  public void setUrl(String url) {
    this.url = url;
  }
}
