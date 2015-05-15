void setup(){
  size(1000,700);
  background(0);
  rect(0,0,10,10);
  PImage start;
  start = loadImage("startscreen.jpg");
}

void draw(){
  image(start, 500, 350);
}
