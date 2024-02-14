public class DashedPolygons {

  public static void main(String[] args) {
    Turtle dave = new Turtle();
    dashedPolygon(dave, 100, 7, 6);
    dave.penup();
    dave.forward(200);
    dave.pendown();
    dashedPolygon(dave, 150, 5, 6);
  }

// draw a dashed line
public static void dashedLine(Turtle t, double length, int numDashes) {
  for (int i = 0; i < numDashes - 1; i++) {
    t.forward(length / (2 * numDashes - 1));
    t.penup();
    t.forward(length / (2 * numDashes - 1));
    t.pendown();
  }
  t.forward(length / (2 * numDashes - 1));
}

// draw a dashed Polygon
public static void dashedPolygon(Turtle t, double length, int numDashes, int numSides) {
  for (int i = 0; i < numSides; i++) {
    dashedLine(t, length, numDashes);
    t.left(360.0/numSides); // using 360.0 will preserve decimals in division
  }
}





}
