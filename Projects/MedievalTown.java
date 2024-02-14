public class MedievalTown {

  public static void main(String[] args) {
    Turtle Lee = new Turtle();
    Lee.delay(1);
    Lee.penup();
    Lee.backward(450);
    Lee.right(90);
    Lee.forward(300);
    Lee.left(90);
    Lee.pendown();
    castleTowers(Lee, 80);
    castleTowers(Lee, 254);
    Lee.penup();
    Lee.backward(200);
    Lee.pendown();
    castleWall(Lee, 0);
    castleWall(Lee, 120);
    Lee.penup();
    Lee.backward(40);
    Lee.pendown();
    castleGate(Lee, 0, 0);
    castleGate(Lee, 200, 30);
    castleGate(Lee, 50, 20);
    castleGate(Lee, 50, 20);
    Lee.penup();
    Lee.backward(30);
    Lee.right(90);
    Lee.forward(90);
    Lee.left(90);
    Lee.pendown();
    tree(Lee);
    Lee.penup();
    Lee.backward(80);
    Lee.left(90);
    Lee.forward(40);
    Lee.right(90);
    Lee.pendown();
    tree(Lee);
    Lee. penup();
    Lee.backward(640);
    Lee.left(90);
    Lee.forward(130);
    Lee.pendown();
    mountain(Lee, 0, 0);
    mountain(Lee, 80, 45);
    mountain(Lee, 20, 10);
    star(Lee, 130, 170);
    star(Lee, 20, 220);
    star(Lee, 0, 170);
    star(Lee, 40, 40);
    Lee.penup();
    Lee.right(90);
    Lee.forward(490);
    Lee.left(90);
    Lee.pendown();
    star(Lee, 0, 0);
    star(Lee, 0, 400);
    Lee.penup();
    Lee.right(90);
    Lee.forward(80);
    Lee.left(90);
    Lee.forward(30);
    Lee.pendown();
    star(Lee, 0, 0);
    Lee.penup();
    Lee.right(180);
    Lee.forward(20);
    Lee.left(90);
    Lee.forward(170);
    Lee.left(90);
    Lee.pendown();
    star(Lee, 0, 0);
  }

  public static void castleTowers(Turtle t, int position) {
    t.penup();
    t.forward(position);
    t.pendown();
    t.pendown(); // puts the castle in position on the page
    t.forward(50); // base
    t.left(90);
    t.forward(100); // right wall
    t.right(60);
    t.forward(20);
    t.left(60); // right widening
    t.forward(20);
    t.left(90); // start of first small square
    for (int i = 0; i < 4; i++) {
      t.forward(9.5);
      t.left(90);
      t.forward(10);
      t.right(90);
      t.forward(9.5);
      t.right(90);
      t.forward(10);
      t.left(90);
    } // this loops builds the top of the castle
    t.forward(10);
    t.left(90); // ends the top
    t.forward(20);
    t.left(60);
    t.forward(20);
    t.right(60); // left widening
    t.forward(10);
    t.left(90); // starts the left wall
    t.penup();
    t.forward(10);
    t.pendown(); // moves us into the castle
    for (int l = 0; l < 3; l++) {
      for (int k = 0; k < 2; k++) {
        for (int j = 0; j < 4; j++) {
          t.forward(10);
          t.left(90);
        } // one window
        t.penup();
        t.forward(20);
        t.pendown(); // two windows on a row
      }
      t.penup();
      t.backward(40);
      t.right(90);
      t.forward(20);
      t.left(90);
      t.pendown();
    } // this loop series builds the windows
    t.penup();
    t.backward(10);
    t.right(90);
    t.pendown();
    t.backward(60);
    t.forward(90);
    t.left(90); // completes the left wall
  }

  public static void castleWall(Turtle t, int position) {
    t.color("red");
    t.penup();
    t.forward(position);
    t.pendown(); // puts the wall into place
    for (int k = 0; k < 3; k++) {
      for (int j = 0; j < 8; j++) {
        t.forward(10);
        t.left(90);
        t.forward(5);
        t.left(90);
        t.forward(10);
        t.left(90);
        t.forward(5);
        t.left(90);
        t.forward(10); // builds the bottom row
      }
      t.backward(80); // puts us in place
      t.left(90);
      t.forward(5);
      t.right(90);
      t.forward(5);
      t.left(90);
      t.forward(5);
      t.left(90);
      t.forward(5);
      t.left(90);
      t.forward(5);
      t.left(90);
      t.forward(5); // builds the first brick of the second level of the wall
      for (int j = 0; j < 7; j++) {
        t.forward(10);
        t.left(90);
        t.forward(5);
        t.left(90);
        t.forward(10);
        t.left(90);
        t.forward(5);
        t.left(90);
        t.forward(10);
      } // build the second level of the wall but not the last brick
      t.forward(5);
      t.left(90);
      t.forward(5);
      t.left(90);
      t.forward(5);
      t.left(90);
      t.forward(5);
      t.left(90); // builds the last brick
      t.backward(75);
      t.left(90);
      t.forward(5);
      t.right(90); // puts us in place for the final for loops
    } // this loops repeats two levels 3 times so the wall is almost done
    for (int j = 0; j < 8; j++) {
      t.forward(10);
      t.left(90);
      t.forward(5);
      t.left(90);
      t.forward(10);
      t.left(90);
      t.forward(5);
      t.left(90);
      t.forward(10);
    } // final level of the wall
    t.backward(80);
    t.right(90);
    t.forward(30);
    t.left(90); // sets us in place for the next object
  }

  public static void castleGate(Turtle t, int distance, int height) {
    t.color("pink");
    t.penup();
    t.forward(distance);
    t.left(90);
    t.forward(height);
    t.pendown(); // sets the starting point for the gate
    t.forward(35); // left outer wall
    for (int i = 0; i < 180; i++) {
      t.right(1);
      t.forward(0.349);
    } // semi circle
    t.forward(35);
    t.right(90); // right outer wall
    t.forward(10);
    t.right(90); // base
    t.forward(35); // right inner wall
    for (int i = 0; i < 180; i++) {
      t.left(1);
      t.forward(0.175);
    } // inner semi circle
    t.forward(35);
    t.right(90); // left inner wall
    t.forward(10);
    t.right(180); // sets us in place for the next object
  }

  public static void tree(Turtle t) {
    t.color("green");
    for (int j = 0; j < 4; j++) {
      t.left(90);
      t.forward(40);
      t.backward(25); // creates the middle line and sets us in place for the leaves
      for (int i = 0; i < 5; i++) {
        t.forward(5);
        t.left(135);
        t.forward(10 * Math.sqrt(2));
        t.backward(10 * Math.sqrt(2));
        t.right(270);
        t.forward(10 * Math.sqrt(2));
        t.backward(10 * Math.sqrt(2));
        t.left(135);
      } // leaves
      t.backward(40);
      t.right(90); // runs us back to the base of the tree
      t.penup();
      t.forward(30);
      t.pendown(); // sets us in place for the next object
    }
  }

  public static void mountain(Turtle t, int height, int distance) {
    t.color("blue");
    t.penup();
    t.forward(height);
    t.left(90);
    t.forward(distance);
    t.right(180);
    t.pendown(); // sets us in place for the start of each mountain
    t.left(30);
    t.forward(190);
    t.right(90); // peak
    t.forward(150);
    t.left(150);
  }

  public static void star(Turtle t, int height, int distance) {
    t.color("yellow");
    t.penup();
    t.forward(height);
    t.right(90);
    t.backward(distance);
    t.pendown(); // sets us in place for each star
    for (int i = 0; i < 8; i++) {
      t.forward(10);
      t.backward(10);
      t.left(45);
    } // makes the star
    t.left(90); // re orients turtle to the correct place for the start of the method
  }






}
