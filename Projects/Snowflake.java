public class Snowflake {

  public static void main(String[] args) {
    Turtle t = new Turtle();
    t.delay(1);
    t.penup();
    t.backward(440);
    t.left(90);
    t.forward(300);
    t.right(90);
    t.pendown();
    snowflakeSide(t, 400, 5);
    // how many lines?
    // level 0: 1
    // level 1: 4
    // level 2: 4 * 4 = 16
    // level 3: 4 * 4 * 4 = 64
    // level N: 4^N

    // what is the length of each line?
    // level 0: 400
    // level 1: 400 / 3
    // level 2: 400 / (3 * 3)
    // level 3: 400 / (3 * 3 * 3)
    // level N: 400 / (3^N)

    // how many times is snowflakeSide called?
    // level 0: 1
    // level 1: 1 + 4 = 5
    // level 2: 1 + 4 + 4*4 = 21
    // level N: 1 + 4 + 4^2 + ... + 4^N

    // full snowflake
    t.penup();
    t.backward(400);
    t.right(90);
    t.forward(200);
    t.left(90);
    t.pendown();
    snowflake(t, 400, 5);

    // square flake
    t.penup();
    t.forward(510);
    t.pendown();
    squareflake(t, 250, 5);
  }

  // Recursive method that draws a side of a fractal snowflake with
  // a given lenght, at a given level (recursion depth).
  public static void snowflakeSide(Turtle t, double length, int level) {
    if (level == 0) {
        // base case: a straight line
        t.forward(length);
    } else {
        // recursive case: shrink the snowflake side from the previous level
        // by three, and repeat it four times following a specific pattern
        snowflakeSide(t, length / 3, level - 1);
        t.left(60);
        snowflakeSide(t, length / 3, level - 1);
        t.right(120);
        snowflakeSide(t, length / 3, level - 1);
        t.left(60);
        snowflakeSide(t, length / 3, level - 1);
    }
  }

  // This method is not recursive, it simply repeats three snowlake sides
  // to compose a full snowflake
  public static void snowflake(Turtle t, double length, int level) {
    for (int i = 0; i < 3; i++) {
        snowflakeSide(t, length, level);
        t.right(120);
    }
  }

  // Modification of the snowflake: a "square flake".
  // The idea of recursion is exactly the same as before,
  // only the geometry is different
  public static void squareflakeSide(Turtle t, double length, int level) {
    if (level == 0) {
        t.forward(length);
    } else {
        squareflakeSide(t, length / 3, level - 1);
        t.left(90);
        squareflakeSide(t, length / 3, level - 1);
        t.right(90);
        squareflakeSide(t, length / 3, level - 1);
        t.right(90);
        squareflakeSide(t, length / 3, level - 1);
        t.left(90);
        squareflakeSide(t, length / 3, level - 1);
    }
  }

  public static void squareflake(Turtle t, double length, int level) {
    for (int i = 0; i < 4; i++) {
        squareflakeSide(t, length, level);
        t.right(90);
    }
  }

}

