public class PolygonFlower {

  public static void main(String[] args) {
    Turtle erin = new Turtle();
    flower(erin, 8, 14, 50);
  }

  public static void polygon(Turtle t, int numSides, double length) {
    for (int i = 0; i < numSides; i++) {
      t.forward(length);
      t.left(360.0 / numSides);
    }
  }

  public static void petal(Turtle t, int numLayers, double length) {
    for (int i = 0; i < numLayers; i++) {
      polygon(t, i + 3, length);
    }
  }

  public static void flower(Turtle t, int numPetals, int numLayers, double length) {
    for (int i = 0; i < numPetals; i++) {
      petal(t, numLayers, length);
      t.forward(length);
      t.right(360.0/numPetals);
    }
  }

}
