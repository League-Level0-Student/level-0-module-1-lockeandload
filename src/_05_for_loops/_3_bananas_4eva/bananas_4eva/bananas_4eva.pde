background (0, 0, 0);
int x=0;
int y=8;
size (2000, 270);
textSize (10);
fill (255, 255, 0);
for (int thing = 0; thing < 18; thing += 1, y += 15) {
  for (int banana = 0; banana<57; banana += 1, x += 35) {
    text ("banana", x, y);
  }
  x = 0;
}
