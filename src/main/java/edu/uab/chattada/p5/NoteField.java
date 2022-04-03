/*
 * Author: Chattada Viriyaphap <chattada@uab.edu>
 * Assignment:  p5 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.chattada.p5;

/**
 * Sub class NoteField that can display optional notes for specific item
 *
 * @author Chattada Viriyaphap <chattada@uab.edu>
 */
public class NoteField extends Fields {

  /**
   * Main method to display optional notes for specific items
   *
   * @param name - type of notes (String notes, side notes, important notes, confidential notes,
   *     etc)
   * @param value - value of notes (String text inside the notes)
   */
  public NoteField(String name, String value) {
    super(name, value); // calling name nad value from superclass Fields
    type = "Note Field";
  }
}
