import processing.core.PApplet;
import processing.core.PApplet;

public class Sketch extends PApplet {
 /*
  * A program that uses java processing to create a remote control
  * @author: Austin L
  */

  // Sets the size of the window
  public void settings() {
    size(300, 300);

  }

  /**
   * Sets background to light green
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Converts width and height to float
    float fltWidth = (float) (width);
    float fltHeight = (float) (height);

	  // Creates rectangle (remote control antenna)
    stroke(255);
    rect((fltWidth / 2.033898305f), (fltHeight / 2.666666667f), (fltWidth / 20f), (fltHeight / 3f));

    // Creates rectangle (remote control)
    stroke(255);
    square((fltWidth / 3f), (fltHeight / 1.714285714f), fltWidth / 2.72727272727272727272727272f);
    fill(0, 0, 0);

    // Creates circle (remote control button)
    stroke(255);
    fill(255, 0, 0);
    ellipse((fltWidth / 1.935483871f) , (fltHeight / 1.304347826f), (fltWidth / 4f), (fltHeight / 4f));

  }
}