public class Flowers {

  public static void main (String[] args) {
    Turtle Lee = new Turtle();
    grass(Lee, 15, 50);
    flower(Lee, 4, 15, 80, 50);


  }

  public static void grass(Turtle t, int numGrass, double length) {
    t.penup();
    t.backward(((length / 2) * numGrass) / 2); // This equation finds half the distance of "grass" section of the drawing
    t.pendown(); //this three command sequence makes sure that the middle of the grass is centered in the turtle program for optimal visiblity of our garden
    for (int i = 0; i < numGrass; i++) {
      t.color("green");
      t.left(60);
      t.forward(length);
      t.penup();
      t.right(60);
      t.backward(length / 2);
      t.pendown();
      t.right(60);
      t.forward(length);
      t.left(60);
    }
    t.penup();
    t.backward((length / 2) * numGrass); // takes us back to the start of the grass
    t.pendown();
  }


  public static void flower(Turtle t, int numStems, int numGrass, double height, double length) {
    for (int i = 0; i < numStems; i++) {
      t.penup();
      t.forward((length * numGrass) / (2 * (numStems + 1))); // separates the stems equally in the grass
      t.pendown();
      t.color("green");
      t.left(90);
      t.forward(height);
      t.right(180);
      for (int k = 0; k < 3; k++) {
        for (int j = 0; j < 6; j++) {
          t.color("pink");
          t.forward(20);
          t.left(60);
        }
        t.right(120);
      }
      t.left(180);
      t.penup();
      t.backward(height);
      t.right(90);
      t.pendown();
    }
    t.penup();
    t.backward(((length / 2) * numGrass) / 2 - (length * numGrass) / (2 * (numStems + 1))); // moves turtle back to the starting place
    t.pendown();
  }
}
