import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
  background(255);
  size(400, 400);
  textSize(18);
  fill(0);
  textAlign(CENTER);
  text("Space to Clear, Click to Draw", 200, 20);
}   
public void draw()
{
  pepe();
  lines();
}

public void lines()
{
  if (keyPressed)
  {
    if (key == ' ')
    {
      background(255);
      stroke(0);
      fill(0);
      textSize(18);
      text("Space to Clear, Click to Draw", 200, 20);
      textAlign(CENTER);
    }
  }
  // textSize(18);
  // fill(0);
  // textAlign(CENTER);
  // text("Space to Clear, Click to Draw", 200, 20);
}
public void pepe()
{
  // background(255);
  if (mousePressed)
  {
    fill(0, 255, 0);
    stroke(0);
    ellipse(pmouseX - 7, pmouseY + 25, 110, 65);//mouth
    noStroke();
    ellipse(pmouseX - 25, pmouseY - 5, 40, 50);//eyehump thing
    ellipse(pmouseX+15, pmouseY-5, 40, 50);
    ellipse(pmouseX - 5, pmouseY - 10, 20, 20);//filler
    ellipse(pmouseX+25, pmouseY-5, 40, 35);
    ellipse(pmouseX - 15, pmouseY - 5, 10, 10);//eyelid left
    ellipse(pmouseX +15, pmouseY - 5, 10, 10);//eyelid right
    stroke(0);
    fill(255);
    ellipse(pmouseX - 20, pmouseY-5, 40, 30);//eyes
    ellipse(pmouseX + 20, pmouseY-5, 40, 30);
    fill(0); 
    ellipse(pmouseX - 15, pmouseY, 10, 10);//pupil
    ellipse(pmouseX + 25, pmouseY, 10, 10);
    fill(0, 255, 0);
    ellipse(pmouseX - 20, pmouseY - 10, 37, 17);//eyelid left
    ellipse(pmouseX + 21, pmouseY - 10, 37, 17);//eyelid right

    //    noFill();
    fill(162, 75, 75);
    // bezier(pmouseX - 30, pmouseY + 30, pmouseX - 5, pmouseY + 32, pmouseX + 15, pmouseY + 35, pmouseX+40, pmouseY + 30); lq mouth
    bezier(pmouseX + 35, pmouseY + 40, pmouseX - 60, pmouseY + 45, pmouseX - 60, pmouseY +20, pmouseX + 40, pmouseY + 30);
    // line(pmouseX + 50, pmouseY + 40, pmouseX - 15, pmouseY + 40);
    noStroke();
    ellipse(pmouseX + 37, pmouseY + 33, 10, 5);
    ellipse(pmouseX + 35, pmouseY + 37, 10, 5);
    noFill();
   // bezier(pmouseX - 40, pmouseY + 40, pmouseX , pmouseY + 30, pmouseX +10, pmouseX + 40, pmouseY + 40);
  }
  
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
