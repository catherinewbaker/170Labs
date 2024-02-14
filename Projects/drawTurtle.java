public class drawTurtle {

  public static void main(String[] args) {
    Turtle gwen = new Turtle();

    //Setting speed, color, and starting postion
    gwen.delay(10);
    gwen.color("green");
    gwen.penup();
    gwen.right(90);
    gwen.forward(122); //approximaion of circle radius
    gwen.pendown();
    gwen.left(90);

    //drawing the body of the turtle
    gwen.color(181, 101, 29);
    circle(gwen, 10, 80);


    //moving into position for and drawing the first leg
    gwen.color("green");
    legMove(gwen, 10, 80);
    gwen.right(105);
    semicircle(gwen, 3, 50);
    gwen.right(106); //this turn is used to get the turtle back on the circle's track and the degree number will be different for each circle size

    //leg #2
    gwen.penup();
    legMove(gwen, 10, 80);
    gwen.right(105);
    gwen.pendown();
    semicircle(gwen, 3, 50);
    gwen.right(106);

    //leg #3
    gwen.penup();
    legMove(gwen, 10, 80);
    gwen.right(105);
    gwen.pendown();
    semicircle(gwen, 3, 50);
    gwen.right(106);

    //leg #4
    gwen.penup();
    legMove(gwen, 10, 80);
    gwen.right(105);
    gwen.pendown();
    semicircle(gwen, 3, 50);
    gwen.right(106);

    //Postioning and drawing tail
    gwen.color("orange");
    gwen.penup();
    gwen.forward(15); //these two commands get the turtle in position to draw th tail
    gwen.right(40); //they will vary based on circle size
    gwen.pendown();
    tail(gwen, 25, 2);

    //Positioning and drawing head
    gwen.color("red");
    gwen.penup();
    gwen.right(67);
    gwen.forward(245); //approximation of circle diameter
    gwen.right(20);
    gwen.pendown();
    semicircle(gwen, 5, 50);

    //move back to starting position
    gwen.penup();
    gwen.right(10);
    gwen.forward(123);
    gwen.left(10);
    gwen.pendown();
  }

  public static void semicircle(Turtle t, double length, int numSides) { //used for head and legs
    for (int i = 0; i < numSides; i++) {
      t.forward(length);
      t.left(240.0/numSides);
    }
    fillColor(t, 90);
  }
  public static void circle(Turtle t, double length, int numSides) { //used for body
    for (int k = 0; k < numSides; k++) {
      t.forward(length);
      t.left(360.0/numSides);
    }
    fillColor(t, 90);
  }
  public static void tail(Turtle t, double length, int numSides){ //used for tail
    for (int j = 0; j < numSides; j++) {
      t.forward(length);
      t.left(100);
    }
    fillColor(t, 60);
  }

  public static void legMove (Turtle t, double length, int numSides) { //used to get into position to draw legs
    for (int l = 0; l <(numSides/5); l++) {
      t.forward(length);
      t.left(360.0/numSides);
    }
  }
  public static void fillColor(Turtle t, int degree) {
      t.penup();
      t.left(degree);
      t.forward(10);
      t.fill();
      t.backward(10);
      t.right(degree);
      t.pendown();
    }
}
