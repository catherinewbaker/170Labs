public class Multistar {

  public static void main(String[] args) {
    Turtle Lee = new Turtle();
    Lee.delay(30);
//    multistar(Lee, 7, 100); // Test Case #1
//    multistar(Lee, 10, 70); // Test Case #2
    multistar(Lee, 25, 120); // Test Case #3
  }

  public static void multistar(Turtle t, int n, double length) {
    for (int i = 0; i < n; i++) {
      t.forward(length); // creates a stem
      for (int j = 0; j < n; j++) { // this loop creates the pinwheel
        t.forward(length / 4);
        t.backward(length / 4);
        t.left(360.0 / n);
      }
      t.backward(length); // takes turtle back to the center
      t.left(360.0 / n); // turns turtle
    }
  }
}
