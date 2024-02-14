public class MultiSquareSpiral {

  public static void main(String[] args) {
    Turtle erin = new Turtle();
    squareSpiral2(erin, 10, 19);

  }

  public static void square(Turtle t, double x) {
    for (int i = 0; i < 4; i++) {
      t.forward(x);
      t.left(90);
    }
  }

  public static void multiSquare(Turtle t, double base, int numSquares) {
    for (int i = 0; i < numSquares; i++) {
      square(t, base * (i + 1));
    }
  }

  public static void multiSquare2(Turtle t, double base, int numSquares) {
    for (int i = 1; i <= numSquares; i++) {
      square(t, base * i); // each square has a different size
    }
  }

  public static void concentricSquares(Turtle t, double base, int numSquares) {
    for (int i = 0; i < numSquares; i++) {
      square(t, (2 * i + 1) * base);
      t.penup();
      t.backward(base);
      t.left(90);
      t.backward(base);
      t.right(90);
      t.pendown();
    }
    t.penup();
    t.forward(base * numSquares);
    t.left(90);
    t.forward(base * numSquares);
    t.right(90);
    t.pendown();

  }

  public static void squareSpiral(Turtle t, double base, int numSides) {
    for (int i = 0; i < numSides; i++) {
      t.forward((i + 1) * base);
      t.left(90);
    }
    for (int i = numSides - 1; i >= 0; i--) { // ... 4 3 2 1 0
      t.right(90);
      t.backward((i + 1) * base);
    }
  }

  public static void squareSpiral2(Turtle t, double base, int numSides) {
    for (int i = 0; i < numSides; i++) { // 0 1 2 3 4
      t.forward((i + 1) * base);
      t.left(90);
    }
    for (int i = 0; i < numSides; i++) { // 0 1 2 3 4
      t.right(90);
      t.backward((numSides - i) * base);
    }

  }


}
