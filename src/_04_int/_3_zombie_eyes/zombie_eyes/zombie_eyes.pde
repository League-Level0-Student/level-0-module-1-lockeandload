
void setup() {
PImage face = loadImage("face.jpeg");
size(255,255);
background(120,99,29);
face.resize(255, 255);
image(face, 0, 0);
}
import java.util.Random;
void draw() {
  Random Rhehehe = new Random();
    int passInt = Rhehehe.nextInt(255);
    System.out.println (passInt);
fill(mouseX, mouseY, passInt);
ellipse(85, 120, 40, 50);
ellipse(145, 120, 40, 50);

}
