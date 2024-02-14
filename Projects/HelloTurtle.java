public class HelloTurtle {

public static void main(String[] args) {
  Turtle amy = new Turtle(); // create a turtle named amy
  amy.forward(100); // move amy forward 100 steps
  amy.left(90); //rotate amy 90 degrees to the left
  amy.backward(50);
  amy.right(45);
  amy.penup(); // makes turtle move without a line
  amy.forward(100);
  amy.pendown();
  amy.forward(50);
  amy.color("red");
  amy.forward(100);



  }

}
