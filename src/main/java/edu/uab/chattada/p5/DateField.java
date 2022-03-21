/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

import java.time.LocalDate;

public class DateField extends Fields {

  private String date;
  private String dateIssue;
  private String dateExpire;

  public DateField(
      String name,
      String value,
      int year_issue,
      int month_issue,
      int day_issue,
      int year_expire,
      int month_expire,
      int day_expire) {
    super(name, value);

    dateIssue = getDate(year_issue, month_issue, day_issue);
    dateExpire = getDate(year_expire, month_expire, day_expire);
  }

  public String getDate(int year, int month, int day) {
    date = LocalDate.of(year, month, day).toString();
    return date;
  }
}
