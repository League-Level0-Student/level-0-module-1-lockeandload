int x = 400; 
int y = 800; 

void setup() {
    size(800, 950);
    
}
    
void draw() {
  
  background(0, 0, 40); 
  if(mousePressed){
     // x += (int)random(-1, 3);
      y += (int)random(-150, -1);
      println (y);
   
  }
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    ellipse(88, 130, 90, 90);
    

}
