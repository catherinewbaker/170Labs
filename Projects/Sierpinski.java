public class Sierpinski {

  public static void main(String[] args) {
    Turtle t = new Turtle();
    t.delay(1);
    sierpinski(t, 400, 7);
    // how many small triangles?
    // level 0: 1
    // level 1: 3
    // level 2: 3 * 3 = 9
    // level N: 3^N

    // what is the size of each small triangle?
    // level 0: 400
    // level 1: 400 / 2 = 200
    // level 2: 400 / (2 * 2) = 100
    // level N: 400 / (2^N)

    // how many times is sierpinski called?
    // level 0: 1
    // level 1: 1 + 3 = 4
    // level 2: 1 + 3 + 3*3 = 13
    // level 3: 1 + 3 + 3*3 + 3*3*3 = 40
    // level N: 1 + 3 + 3^2 + ... + 3^N
  }

  // Draws a fractal Sierpinski triangle.
  // Parameters:
  //   size: length of the side of the triangle
  //   level: depth of recursion, integer >= 0
  public static void sierpinski(Turtle t, double size, int level) {
    if (level == 0) {
        // base case: a Sierpinsky triangle at level 0 is just a triangle
        triangle(t, size);
    } else {
        // recursive case: shrink the previous level of Sierpinski
        // triangle in half, and repeat it three times
        sierpinski(t, size / 2, level - 1);
        t.forward(size / 2);
        sierpinski(t, size / 2, level - 1); 
        t.left(120);
        t.forward(size / 2);
        t.right(120);
        sierpinski(t, size / 2, level - 1);
        t.left(60);
        t.backward(size / 2);
        t.right(60);
    }
  }

  public static void triangle(Turtle t, double x) {
    for (int i = 0; i < 3; i++) {
        t.forward(x);
        t.left(120);
    }
  }
}

