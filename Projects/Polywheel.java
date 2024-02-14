public class Polywheel {

  public static void main(String[] args) {
    Turtle Lee = new Turtle();
    Lee.delay(50);
//    polywheel(Lee, 3, 100); // Test Case #1
//    polywheel(Lee, 4, 50); // Test Case #2
//    polywheel(Lee, 5, 40); // Test Case #3
//    polywheel(Lee, 6, 30); // Test Case #4
    polywheel(Lee, 12, 15); // Test Case #5
  }

  public static void polywheel(Turtle t, int numSides, double length) {
    for (int j = 0; j < numSides; j++) { // creates as many shapes as there are sides so that it doesn't repeat any shapes
      for (int i = 0; i < numSides; i++) { // this for loop creats one shape
        t.forward(length);
        t.left(360.0 / numSides); // calculates the angle for us
      }
      t.forward(length);
      t.right(360.0 / numSides); // this moves us forward one side and turn turtle so that it is in place for the next shape
    }
  }



}
