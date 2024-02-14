public class Star {

// Draw a simple star
  public static void star(Turtle t, double length) {
    for (int i = 0; i < 5; i++) {
      t.forward(length);
      t.right(144);

    }
  }

  public static void main(String[] args) {
    Turtle sun = new Turtle();
    star(sun, 100);

  }
}
