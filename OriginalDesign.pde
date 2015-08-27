PImage img;
void setup()
{
  background(255);
  size(400, 400);
  textSize(18);
  fill(0);
  textAlign(CENTER);
  text("Space to Clear, Click to Draw", 200, 20);
 
}   
void draw()
{
  pepe();
  lines();
}

void lines()
{

}
void pepe()
{
  // background(255);
  if (mousePressed)
  {
    fill(0, 255, 0);
    stroke(0);
    ellipse(pmouseX - 7, pmouseY + 25, 110, 65);//mouth
    noStroke();
    ellipse(pmouseX - 25, pmouseY - 5, 40, 50);//eyehump thing
    ellipse(pmouseX+15,pmouseY-5,40,50);
    ellipse(pmouseX - 5, pmouseY - 10, 20,20);//filler
    ellipse(pmouseX+25, pmouseY-5, 40, 35);
    ellipse(pmouseX - 15,pmouseY - 5,10,10);//eyelid left
    ellipse(pmouseX +15 ,pmouseY - 5,10,10);//eyelid right
    stroke(0);
    fill(255);
    ellipse(pmouseX - 20, pmouseY-5, 40, 30);//eyes
    ellipse(pmouseX + 20, pmouseY-5, 40, 30);
    fill(0); 
    ellipse(pmouseX - 15, pmouseY, 10, 10);//pupil
    ellipse(pmouseX + 25, pmouseY, 10, 10);
    fill(0,255,0);
    ellipse(pmouseX - 20,pmouseY - 10,37,17);//eyelid left
    ellipse(pmouseX + 21 ,pmouseY - 10,37,17);//eyelid right

    noFill();
    bezier(pmouseX - 30, pmouseY + 30, pmouseX - 5, pmouseY +35, pmouseX + 5, pmouseY +25, pmouseX+40, pmouseY + 30);
    //bezier(pmouseX - 30, pmouseY + 30, pmouseX - 5, pmouseY +35, pmouseX + 5, pmouseY +20, pmouseX+40, pmouseY + 30);
    // line(pmouseX + 50, pmouseY + 40, pmouseX - 15, pmouseY + 40); 

  }
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
}
