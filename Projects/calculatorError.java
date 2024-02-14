import java.io.IOException;

public class calculatorError {

  public static void main(String[] args) {
    division(4, 2);
    division(5, 2);
  }

  public static double division(double x, double y) {
    try { x % 2 != 0}
    catch (ArithmeticException x) {
      throw new ArithmeticException("Stop messing up my math work! I'm only dividing by evens!");
    }
    double z = x / y;
    return z;
  }
}
