public class FractalTree1 {

  public static void main(String[] args) {
    Turtle t = new Turtle();
    t.delay(1);
    t.left(90);
    tree(t, 150, 10);
  }

  public static void tree(Turtle t, double size, int level) {
    if (level == 0) {
        t.forward(size);
        t.backward(size);
    } else {
        // stem
        t.forward(size);
        // first branch
        t.left(45);
        tree(t, size * 0.6, level - 1);
        // second branch
        t.right(45 + 45);
        tree(t, size * 0.6, level - 1);
        t.left(45);
        t.backward(size);        
    }
  }
}

