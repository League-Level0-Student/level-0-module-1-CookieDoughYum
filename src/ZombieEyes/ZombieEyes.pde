void setup(){
  size(500,500);
  PImage face = loadImage("Zombie.jpg");
  face.resize(500,500);
image(face, 0, 0);
}
void draw(){
  fill(#0B139B);
  if(mousePressed){
    fill(#E53B0C);
  }
  ellipse(190,215,100,100);
  ellipse(315,215,100,100);
  fill(#000000);
  ellipse(190,215,20,20);
  ellipse(315,215,20,20);
}