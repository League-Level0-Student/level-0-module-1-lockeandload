int pressCount = 0;
PImage pepperoni;
PImage mushroom;
PImage olive;
void setup() {
    size(1500, 1000);
    background(123,92,0);
    pepperoni = loadImage("pepperoni.png");
    mushroom = loadImage("mushroom.png");
    olive = loadImage("olive.png");
}
void draw() {
  if(mousePressed){
      pressCount += 1;
      println (pressCount);  
  }
  fill(100,111,42);
ellipse(750, 500, 800, 843);

fill(138, 3, 3);
ellipse(750, 500, 770, 793);

fill(161,165,92);
ellipse(750, 500, 720, 763);

if (pressCount>0) {
  println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");    
  image(pepperoni,500,200);
     } 



}
