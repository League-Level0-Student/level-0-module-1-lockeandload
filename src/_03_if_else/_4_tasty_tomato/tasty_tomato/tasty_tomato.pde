int x=85;
int y=200;

boolean pressHold = false;
void setup() {
    size(800, 800);
    background(20,51,06);
}
void draw() {
    
    noStroke();
    fill(87,138,61);
    rect(194, 103, 12, 50);
    fill(79,06,04);
    ellipse(150, 200, 150, 150);
    ellipse(250, 200, 150, 150);
 noStroke();
      fill(20,51,46);
 if(mousePressed){
          println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
      pressHold = true;
 }
     if (pressHold) {
      ellipse(x, y, 100, 150);
     } 
     if (pressHold) {
      ellipse(x+20, y, 100, 150);
     }
    // ellipse(x+40, y, 70, 190);
    // void keyPressed(){
  //  x+=4;
  //  y+=4;
  //     } 
      
}
