public class House {

  public static void main(String[] args) {
    Turtle dave = new Turtle();
    house(dave);
  }

  public static void house(Turtle t) {
    front(t);
    t.left(90);
    t.forward(80);
    t.right(90);
    top(t);
    t.left(90);
    t.backward(80);
    t.right(90);
  }

  public static void front(Turtle t) {
    walls(t);
    t.forward(30);
    door(t);
    t.penup();
    t.left(90);
    t.forward(50);
    t.right(90);
    t.backward(20);
    t.pendown();
    windows(t);
    t.penup();
    t.backward(10);
    t.left(90);
    t.backward(50);
    t.right(90);
    t.pendown();
  }

  public static void top(Turtle t) {
    roof(t);
    t.penup();
    t.forward(10);
    t.left(90);
    t.forward(10);
    t.right(90);
    t.pendown();
    chimney(t);
    t.penup();
    t.backward(10);
    t.right(90);
    t.forward(10);
    t.left(90);
    t.pendown();
  }

  public static void walls(Turtle t) {
    square(t, 80);
  }

  public static void windows(Turtle t) {
    square(t, 20);
    t.penup();
    t.forward(40);
    t.pendown();
    square(t, 20);
    t.penup();
    t.backward(40);
    t.pendown();
  }

  public static void door(Turtle t) {
    for (int i = 0; i < 2; i++) {
      t.forward(20);
      t.left(90);
      t.forward(30);
      t.left(90);
    }
  }

  public static void roof(Turtle t) {
    t.forward(80);
    t.left(135);
    t.forward(40 * Math.sqrt(2));
    t.left(90);
    t.forward(40 * Math.sqrt(2));
    t.left(135);
  }

  public static void chimney(Turtle t) {
    t.left(90);
    t.forward(20);
    t.right(90);
    t.forward(10);
    t.right(90);
    t.forward(10);
    t.backward(10);
    t.left(90);
    t.backward(10);
    t.left(90);
    t.backward(20);
    t.right(90);
  }

  public static void square(Turtle t, double x) {
    for (int i = 0; i < 4; i++) {
      t.forward(x);
      t.left(90);
    }
  }

}
