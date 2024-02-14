public class fractalFlowers {

  public static void main(String[] args) {
    Turtle t = new Turtle();
    t.delay(0);
    t.penup(); // Test Case 1: this section of code is the code for simple flower
    t.left(90);
    t.backward(300);
    t.right(90);
    t.backward(390);
    t.left(90);
    t.pendown();
    simpleFlower(t, 200);
    t.penup(); // Test Case 2: this section of code is for the first fractal flower
    t.right(90);
    t.forward(220);
    t.left(90);
    t.pendown();
    t.forward(150);
    fractalFlower(t, 250, 3);
    t.penup(); // Test Case 3: this section draws the third fractal flower
    t.backward(150);
    t.right(90);
    t.forward(330);
    t.left(90);
    t.pendown();
    t.forward(200);
    fractalFlower(t, 300, 4);
    t.backward(200);
  }

  public static void simpleFlower(Turtle t, double size) {
    t.forward(size); // stem
    for (int i = 0; i < 8; i++) { // draws the petals
      t.right(360.0 / 8);
      t.forward(size / 3);
      t.backward(size / 3);
    }
    t.backward(size); // returns the turtle to it's original position
  }

  public static void fractalFlower(Turtle t, double size, int level) {
    if (level == 0) {
      simpleFlower(t, size); // draws a simple flower at the base case. called the simple flower method instead of code for simplicity sake
    } else {
      t.forward(size);
      for (int i = 0; i < 8; i++) {
        t.right(360.0 / 8);
        t.forward(size / 3);
        fractalFlower(t, (size / 3), level - 1); // draws another flower before the turtle goes back on the petals
        t.backward(size / 3);
      }
      t.backward(size);
    }
  }
}
