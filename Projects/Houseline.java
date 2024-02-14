public class Houseline {

  public static void main(String[] args) {
    Turtle Lee = new Turtle();
    Lee.delay(2);
    Lee.penup();
    Lee.backward(300); // This is to make the houses more centered on the page. It serves no perpose other than to make a nicer looking picture.
    Lee.pendown();
    houseline(Lee, 5);

  }

  public static void houseline(Turtle t, int numHouses) {
    for (int j = 0; j < numHouses; j++) {
      house(t, (j + 1)); // 1 is added to j because j starts at 0. Alternatively, I could have started j at 1 and added one to numHouses in "j < numHouses"
      t.penup(); // Below is the equation that moves our houses apart in a decreasing manner. The one is addedso that there can
      t.forward(100 / (j+1) + 1); // still be distinction between some of the smaller houses
      t.pendown();
    }
    t.penup();
    for (int h = (numHouses-1); h >= 0; h--) {
      t.backward(2 * ((80.0 / (h+1)) + (100 / (h+1) + 1)) / numHouses); // this equation does not put turtle back in its proper place. I could not figure out the right one.
    }
    t.pendown();

  }
/* The following is the "house" code that we were allowed to use. Notice each
parameter has an added "int k". Also notice that each length in the following
methods is divided by the number k (excluding those mentioned in methods that are
repeated inside another method so as not to divide by k multiple times). This is
so that the variable k can be renamed as a variable in the method houseline
that is ascending, and therefore consistenly changing the size of each repeated
house.
*/
  public static void house(Turtle t, int k) {
    front(t, k);
    t.left(90);
    t.forward(80.0/k);
    t.right(90);
    top(t, k);
    t.left(90);
    t.backward(80.0/k);
    t.right(90);
  }

  public static void front(Turtle t, int k) {
    walls(t, k);
    t.forward(30.0/k);
    door(t, k);
    t.penup();
    t.left(90);
    t.forward(50.0/k);
    t.right(90);
    t.backward(20.0/k);
    t.pendown();
    windows(t, k);
    t.penup();
    t.backward(10.0/k);
    t.left(90);
    t.backward(50.0/k);
    t.right(90);
    t.pendown();
  }

  public static void top(Turtle t, int k) {
    roof(t, k);
    t.penup();
    t.forward(10.0/k);
    t.left(90);
    t.forward(10.0/k);
    t.right(90);
    t.pendown();
    chimney(t, k);
    t.penup();
    t.backward(10.0/k);
    t.right(90);
    t.forward(10.0/k);
    t.left(90);
    t.pendown();
  }

  public static void walls(Turtle t, int k) {
    square(t, 80, k);
  }

  public static void windows(Turtle t, int k) {
    square(t, 20, k);
    t.penup();
    t.forward(40.0/k);
    t.pendown();
    square(t, 20, k);
    t.penup();
    t.backward(40.0/k);
    t.pendown();
  }

  public static void door(Turtle t, int k) {
    for (int i = 0; i < 2; i++) {
      t.forward(20.0/k);
      t.left(90);
      t.forward(30.0/k);
      t.left(90);
    }
  }

  public static void roof(Turtle t, int k) {
    t.forward(80.0/k);
    t.left(135);
    t.forward(40 * Math.sqrt(2)/k);
    t.left(90);
    t.forward(40 * Math.sqrt(2)/k);
    t.left(135);
  }

  public static void chimney(Turtle t, int k) {
    t.left(90);
    t.forward(20.0/k);
    t.right(90);
    t.forward(10.0/k);
    t.right(90);
    t.forward(10.0/k);
    t.backward(10.0/k);
    t.left(90);
    t.backward(10.0/k);
    t.left(90);
    t.backward(20.0/k);
    t.right(90);
  }

  public static void square(Turtle t, double x, int k) {
    for (int i = 0; i < 4; i++) {
      t.forward(x/k);
      t.left(90);
    }
  }




}
