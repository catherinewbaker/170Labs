public class Square {

  public static void main(String[] args) {
    Turtle bob = new Turtle();
/*    bob.forward(100);
    bob.left(90);
    bob.forward(100);
    bob.left(90);
    bob.forward(100);
    bob.left(90);
    bob.forward(100);
    bob.left(90);
*/
    // let's use a FOR loop
    for (int i = 0; i < 4; i++) {
      bob.forward(100);
      bob.left(90);
    }
  }



}
