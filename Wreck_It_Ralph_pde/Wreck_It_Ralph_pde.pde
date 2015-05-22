PImage start;
PImage building;
boolean startGame = false;
void setup() {
  size(1000, 750);
  start = loadImage("startscreen.jpg");
  building = loadImage("building.jpg");
}

void draw() {
  background(0);
  image(start, 190, 115);
  if (startGame == true) {
    background(0);
    image(building, 190, 42, 503, 708);
  }
}

void keyPressed() {
  if (keyCode == 32) {
    startGame = true;
  }
}

