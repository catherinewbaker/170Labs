public class FractalTree3 {

  public static void main(String[] args) {
    Turtle t = new Turtle();
    t.delay(1);
    t.left(90);
    t.penup();
    t.backward(200);
    t.pendown();
    tree(t, 150, 10);
  }

  public static void tree(Turtle t, double size, int level) {
    int red = (int)(Math.random() * 256);
    int green = (int)(Math.random() * 256);
    int blue = (int)(Math.random() * 256);
    t.color(red, green, blue);
    if (level == 0) {
        t.forward(size);
        t.penup();
        t.backward(size);
        t.pendown();
    } else {
        // stem
        t.forward(size);
        // first branch
        t.left(30);
        tree(t, size * 0.8, level - 1);
        // second branch
        t.right(30 + 45);
        tree(t, size * 0.6, level - 1);
        t.left(45);
        t.penup();
        t.backward(size);
        t.pendown();        
    }
  }
}

