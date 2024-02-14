public class SquareLine {

  public static void main(String[] args) {
    Turtle bob = new Turtle();

    for (int k = 0; k < 3; k++) {
      //draw a line of square using nested FOR loop
      for (int j = 0; j < 5; j++) {
        // draw a square
        for (int i = 0; i < 4; i++) {
          bob.forward(40);
          bob.left(90);
        }
        bob.penup();
        bob.forward(100);
        bob.pendown();
      }
      bob.penup();
      bob.backward(500);
      bob.left(90);
      bob.forward(60);
      bob.right(90);
      bob.pendown();
    }
    bob.penup();
    bob.left(90);
    bob.backward(180);
    bob.right(90);
    bob.pendown();
  }

}
