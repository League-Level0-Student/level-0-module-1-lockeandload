int x=85;
int y=200;

int pressCount = 0;

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
      fill(20,51,6);
 if(mousePressed){
          println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
      pressCount += 1;
      println (pressCount);
 }
     if (pressCount>1) {
      ellipse(x, y, 100, 160);
     } 
     
     if (pressCount>8) {
      ellipse(x+20, y, 100, 160);
     }
     
     if (pressCount>13) {
      ellipse(x+40, y, 100, 160);
     } 
     
     if (pressCount>20) {
      ellipse(x+60, y, 100, 160);
     }
     
     if (pressCount>30) {
      ellipse(x+80, y, 100, 160);
     }
     
     if (pressCount>40) {
      ellipse(x+100, y, 100, 160);
     }
     
     if (pressCount>50) {
      ellipse(x+120, y, 100, 160);
     }
     
     if (pressCount>60) {
      ellipse(x+140, y, 100, 160);
     }
     
     if (pressCount>70) {
      ellipse(x+160, y, 100, 160);
     }
     
     if (pressCount>80) {
      ellipse(x+180, y, 100, 160);
     }
     
     if (pressCount>100) {
      ellipse(x+200, y, 100, 160);
     }
     
     if (pressCount>110) {
      ellipse(199, 128, 100, 160);
     }
     
    if (pressCount>1200) {
      fill(136, 8, 8);    
    textSize(70);
      text("Why would you do this?", 4,400);
     }  
     
}
