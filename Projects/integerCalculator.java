public class integerCalculator {

  public static void main(String[] args) {
    Addition(2, 3); // Test Case #1
    Addition(10, 7); // Test Case #2
    Subtraction(3, 1); // Test Case #1
    Subtraction(15, 4); // Test Case #2
    Multiplication(2, 3); // Test Case #1
    Multiplication(10, 12); // Test Case #2
    Division(6, 2); // Test Case #1
    Division(11, 2); // Test Case #2
  }

  public static void Addition(int x, int y) {
    int z = x + y;
    System.out.println(x + " + " + y + " = " + z); // shows the viewer the fill arithmetic statement
  }

  public static void Subtraction(int u, int v) {
    int w = u - v;
    System.out.println(u + " - " + v + " = " + w); // shows the viewer the fill arithmetic statement
  }

  public static void Multiplication(int r, int s) {
    int t = r * s;
    System.out.println(r + " * " + s + " = " + t); // shows the viewer the fill arithmetic statement
  }

  public static void Division(int o, int p) {
    Double n = (double)o; // recasts variable o as a double so that division doesn't return an error
    Double q = n / p; // making q a double allows the quotient to have a decimal in case it's necessary
    System.out.println(o + " / " + p + " = " + q); // shows the viewer the fill arithmetic statement
  }

}
