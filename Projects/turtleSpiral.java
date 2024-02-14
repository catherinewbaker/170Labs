public class turtleSpiral {

  public static void main(String[] args) {
    Turtle t = new Turtle();
    t.penup();
    t.left(180);
    t.forward(200);
    t.right(180);
    t.pendown();
    turtleSpiral(t, 400, 5); // TC1A RECUR
    turtleSpiralIter(t, 400, 5); // TC1B ITER
    //turtleSpiral(t, 100, 20); // TC2A RECUR
    //turtleSpiralIter(t, 100, 20); // TC2B ITER
    //turtleSpiral(t, 500, 200); // TC3A RECUR
    //turtleSpiralIter(t, 500, 200); // TC3B ITER
  }

  public static void turtleSpiral(Turtle t, double size, double minSize) {
    if (size <= minSize) { // continues the loop as long as size >= minSize
      t.forward(0); // stops turtle
    } else {
      t.forward(size); // creates a side
      t.right(90);
      turtleSpiral(t, size * 0.9, minSize); // shrinks size til the loop gets stopped
    }
  }

  public static void turtleSpiralIter(Turtle t, double size, double minSize) {
    t.forward(size); // initial side
    int i = 1;
    while ((size * (Math.pow(0.9, i))) >= minSize) { // continues the loop as long as size >= minSize
      t.right(90);
      t.forward(size * (Math.pow(0.9, i))); // this equation  is equivalent to shrinking size with recursion each time i increases
      i++;
    }
  }
}
