public class MickeyMouse {

  public static void main(String[] args) {
    Turtle t = new Turtle();
    t.delay(0);
    fractalMickeyMouse(t, 200, 6);
  }

  public static void mickeyFace(Turtle t, double r) {
    t.penup();
    t.forward(r);
    t.right(90);
    t.pendown();
    for (int i = 0; i < 360; i++) { // draws around mickey's face (big circle)
      t.right(1);
      t.forward(2 * (Math.PI) * r / 360);
    }
    t.penup();
    t.left(90);
    t.backward(r); // now at the center of mickey
    t.backward(r / 10); // the "/ 10" is how big we want the nose in comparison to mickey's face
    t.left(90);
    t.pendown();
    for (int i = 0; i < 360; i++) { // draws the nose in a circle aronud the center
      t.right(1);
      t.forward((2 * (Math.PI) * r / 360) / 10);
    }
    t.penup(); // this section sets turtle up for the eyes
    t.right(90);
    t.forward(r / 10);
    t.backward(r / 2);
    t.left(90);
    t.forward(r / 2);
    t.pendown();
    for (int i = 0; i < 360; i++) { // left eye
      t.right(1);
      t.forward((2 * (Math.PI) * r / 360) / 5);
    }
    t.penup(); // sets us up for right eye
    t.right(90);
    t.forward((r / 2) + ((r / 2) - ((2 * r) / 5)));
    t.left(90);
    t.pendown();
    for (int i = 0; i < 360; i++) { // right eye
      t.right(1);
      t.forward((2 * (Math.PI) * r / 360) / 5 );
    }
    t.penup(); // sets up turtle for smile
    t.backward(r / 2);
    t.right(90);
    t.backward((r / 2) - ((2 * r) / 5));
    t.forward(8 * r / 9);
    t.left(90);
    t.pendown();
    for (int i = 0; i < 180; i++) { // draws the smile
      t.backward(8 * (2 * (Math.PI) * r / 360) / 9);
      t.right(1);
    }
    t.penup(); // puts turtle back in the middle
    t.left(90);
    t.forward(8 * r / 9);
    t.pendown();
  }

  public static void fractalMickeyMouse(Turtle t, double r, int level) {
    if (level == 0) {
      mickeyFace(t, r);
    } else {
      mickeyFace(t, r); // draws a mickey
      t.penup(); // puts the turtle at the edge of mickey's head
      t.forward(r);
      t.left(90);
      for (int i = 0; i < 45; i++) { // goes along mickey's head to the angle where the right ear should be
        t.left(1);
        t.forward(2 * (Math.PI) * r / 360);
      }
      t.right(90); // puts turtle in position for right ear
      t.forward(r / 2);
      t.right(45);
      t.pendown();
      fractalMickeyMouse(t, r / 2, level - 1); // right ear

      t.penup(); // this section sets up turtle to draw the left ear of mickey
      t.left(45); // going back to mickeys head
      t.backward((r / 2) - 0.5); // the 0.5 is to help offset the diagonal cause by the imperfect angles used when going around the circle
      t.left(90);
      for (int i = 0; i < 90; i++) { // going around the head of mickey
        t.left(1);
        t.forward(2 * (Math.PI) * r / 360);
      }
      t.right(90); // going to the center of new mickey ear
      t.forward(r / 2);
      t.right(135);
      t.pendown();
      fractalMickeyMouse(t, r / 2, level - 1); // mickey

      t.penup(); // this section returns turtle to the middle
      t.right(45);
      t.forward(r + r / 2);
      t.left(45);
      t.pendown();
    }
  }
}
