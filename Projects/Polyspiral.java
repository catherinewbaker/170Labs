public class Polyspiral {

  public static void main(String[] args) {
    Turtle Lee = new Turtle();
    polyspiral(Lee, 3, 20, 3); // Test Case #1
//    polyspiral(Lee, 5, 10, 4); // Test Case #2
//    polyspiral(Lee, 8, 5, 3); // Test Case #3

  }

  public static void polyspiral(Turtle t, int n, double base, int rounds) {
      for (int j = 0; j < (n * rounds); j++) { // n * rounds tell the loops to continue until the shape has been made "rounds" number of times
        t.forward((j + 1) * base);
        t.right(360.0 / n); // makes the angle that the program turns adjustable to the shape
      }
      for (int i = ((n * rounds) - 1); i >= 0; i--) {
        t.left(360.0 / n);
        t.backward((i + 1) * base);
      }
  }
}
