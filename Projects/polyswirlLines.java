public class polyswirlLines {

  public static void main(String[] args) {
    Turtle t = new Turtle();
    t.left(180);
    t.forward(200);
    t.right(180);
    cLines(t, 400, 5);
//    cLines(t, 300, 3);
  }

  public static void cLines(Turtle t, double size, int level) {
    if (level == 0) {
      t.forward(0);
    } else {
      line(t, size, level);
    }
  }

  public static void line(Turtle t, double size, int level) {
    t.forward(size);
    t.right(90);
    cLines(t, size / 2, level - 1);
  }
}
