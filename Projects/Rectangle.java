public class Rectangle {

  public static void main(String[] args) {
    Turtle bob = new Turtle();

    // draw a rectangle 100 x 60
    for (int i = 0; i < 2; i++) {
      bob.forward(100);
      bob.left(90);
      bob.forward(60);
      bob.left(90);
    }
  }
}
