int pressCount = 0;
PImage pepperoni;
PImage mushroom;
PImage olive;
void setup() {
    size(1500, 1000);
    background(123,92,0);
    pepperoni = loadImage("pepperoni.png");
   // mushroom = loadImage("mushroom.png");
   // olive = loadImage("olive.png");
  fill(100,111,42);
ellipse(750, 500, 800, 843);

fill(138, 3, 3);
ellipse(750, 500, 770, 793);

fill(161,165,92);
ellipse(750, 500, 720, 763);
 
      
}
void draw() {
  if(mousePressed){
      pressCount += 1;
      println (pressCount);  
  }


if (pressCount>1) {
  println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");    
int pizzaX = (int) random (450) + 500;
 int pizzaY = (int) random (700) + 100;
 image (pepperoni, pizzaX, pizzaY);
  } 
//top left (500, 100) bottom right (950, 800)


}
