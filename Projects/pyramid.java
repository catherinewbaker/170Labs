public class pyramid {

  public static void main(String[] args) {
    Turtle Lee = new Turtle();
    Lee.delay(10);
    pyramid(Lee, 800, 5); // Test Case #1
//    pyramid(Lee, 800, 10); // Test Case #2
//    pyramid(Lee, 1200, 10); // Test Case #3
  }

  public static void pyramid(Turtle t, double base, int levels) {
    for (int k = 0; k < levels; k++) { // maps the pyramid
      for (int j = 0; j < ((2 * k) + 1); j++) { // maps the row
        for (int i = 0; i < 4; i++) { // this for loop draws one square
          t.forward((base / (levels * levels)));
          t.left(90);
        }
        t.forward(base / (levels * levels)); // sets up up for the next square on a row
      }
      t.penup();
      t.backward((((2 * k) + 1) * (base / (levels * levels))) + (base / (levels * levels)));
      t.right(90);
      t.forward(base / (levels * levels));
      t.left(90);
      t.pendown(); // this series takes up to the left end of a row and goes back one and down one, one square length. it sets us up for the next row
    }

    for (int k = levels-1; k >= 0; k--) { // this sequence reverses the pyramid
      t.penup();
      t.right(90);
      t.backward(base / (levels * levels));
      t.left(90);
      t.forward((((2 * k) + 1) * (base / (levels * levels))) + (base / (levels * levels)));
      t.pendown();
      for (int j = ((2 * k)); j >= 0; j--) {
        t.backward(base / (levels * levels));
        for (int i = 3; i >= 0; i--) {
          t.right(90);
          t.backward((base / (levels * levels)));
        }
      }
    }
  }





}
