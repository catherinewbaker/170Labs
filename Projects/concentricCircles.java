public class polyswirlLines {

  public static void main(String[] args) {
    Turtle t = new Turtle();
    circle(t, 500, 5);
  }

  public static void cLines(Turtle t, double size, int level) {
    if (level == 0) {
      t.forward(size / level);
    } else {
      circle(t, size / level, level - 1);
    }
  }

  public static void line(Turtle t, double size, int level) {
    t.forward(size);
    t.right(90);
  }
}
