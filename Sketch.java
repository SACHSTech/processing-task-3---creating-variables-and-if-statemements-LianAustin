import processing.core.PApplet;

public class Sketch extends PApplet {
 /*
  * A program that uses java processing to create a remote control which will randomly be placed on the screen as well as display the time
  * @author: Austin L
  */

  // Sets the size of the window
  public void settings() {
    size(200, 200);
  }

  // Sets the background color to green
  public void setup() {
    if(second() % 2 == 0) {
      background(0,0,255);
    } else if (second() % 2 != 0) {
      background(0,255,0);
    }
  }

  // Position the control at a random location
  float fltControlX = random(width - 30);
  float fltControlY = random(height - 30);

  // Position the antenna at the center top of the control
  float fltAntennaX = fltControlX + 7.5f; // Position the antenna at the middle of the control
  float fltAntennaY = fltControlY - 15; // Position the antenna just above the control

  // Position the button in the middle of the control
  float fltButtonX = fltControlX + 15;
  float fltButtonY = fltControlY + 15;

  public void draw() {
    setup();

    // Fetches the time from the computer and stores it in a string
    int intSec = second();
    int intMin = minute();
    int intHour = hour();
    String strTime = str(intHour) + ":" + str(intMin) + ":" + str(intSec);

    // Displays the time on the screen
    fill(50);
    textSize(32);
    textAlign(CENTER, CENTER);  // Set the text alignment to center
    text(strTime, width / 2, height / 2);

    // Creates rectangle (remote control antenna)
    stroke(255);
    rect(fltAntennaX, fltAntennaY, 15, 15);

    // Creates square (remote control)
    stroke(255);
    square(fltControlX, fltControlY, 30);

    // Creates circle (remote control button)
    stroke(255);
    fill(255, 0, 0);
    ellipse(fltButtonX, fltButtonY, 10, 10);
  }
}
