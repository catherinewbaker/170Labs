public class myFractal {

  public static void main(String[] args) {
    Turtle t = new Turtle();
    t.delay(1);
    t.penup(); // gets turtle in position
    t.left(90);
    t.backward(200);
    t.pendown();
    tree(t, 200, 10);
  }

  public static void branch(Turtle t, double size) {
    int red = (int)(Math.random() * 256); // these make the random coloring of the branches more efficient to label
    int blue = (int)(Math.random() * 256);
    int green = (int)(Math.random() * 256);
    t.color(red, blue, green);
    t.forward(size);// draws the stem
    t.left(50);
    t.color(red, blue, green);
    t.forward(size / 2); // draws the left, longer stem
    t.backward(size / 2);
    t.right(120);
    t.color(red, blue, green);
    t.forward(size / 3); // draws the right, shorter stem
    t.backward(size / 3);
    t.left(70);
    t.backward(size);
  }

  public static void tree(Turtle t, double size, int level) {
    int red = (int)(Math.random() * 256);
    int blue = (int)(Math.random() * 256);
    int green = (int)(Math.random() * 256);
    if (level == 0) {
      branch(t, size);
    } else {
      t.color(red, blue, green); // this is the branch method repeated with recursion in as needed
      t.forward(size);
      t.left(50);
      t.color(red, blue, green);
      t.forward(size / 2);
      tree(t, size / 2, level - 1); // repeats breanch level amount of times on the branch
      t.backward(size / 2);
      t.right(120);
      t.color(red, blue, green);
      t.forward(size / 3);
      tree(t, size / 3, level - 1); // repeats breanch level amount of times on the branch
      t.backward(size / 3);
      t.left(70);
      t.backward(size);
    }
  }
}
