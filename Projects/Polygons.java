// we can make our programs more general using methods
public class Polygons {

  public static void main(String[] args) {
    Turtle carl = new Turtle();
    square(carl, 100);  // method call: carl = t, 100 = size
    square(carl, 200);  // it refers to the below method
    triangle(carl, 150); // allows turtle to draw independent shapes
    pentagon(carl, 50);
    carl.color("blue");
    polygon(carl, 75, 6);
    carl.color("orange");
    polygon(carl, 90, 7);
  }

// draw a square
public static void square(Turtle t, double size) { // signature
  // method body
  for (int i = 0; i < 4; i++) {
    t.forward(size);
    t.left(90);
  }
}

// draw a triangle
public static void triangle(Turtle t, double size) {
  // method body
  for (int i = 0; i < 3; i++) {
    t.forward(size);
    t.left(120);
  }
}

//draw a pentagon
public static void pentagon(Turtle t, double size) {
  // method body
  for (int i = 0; i < 5; i++) {
    t.forward(size);
    t.left(72);
  }
}

//draw a Polygon
public static void polygon(Turtle t, double size, int numSides) {
  // method body
  for (int i = 0; i < numSides; i++) {
    t.forward(size);
    t.left(360.0/numSides);





}
