public class ValuesandReferences {

  public static void main(String[] args) {
    int a = 5;
    int b = 7;
    System.out.println("a: " + a + ", b: " + b);
    a = b;
    System.out.println("a: " + a + ", b: " + b);
    b = 8;
    System.out.println("a: " + a + ", b: " + b);

    // watch now
    int[] x = new int[3];
    int[] y = new int[3];
    x[0] = 5;
    y[0] = 7;
    System.out.println("x[0]: " + x[0] + ", y[0]: " + y[0]);
    x = y;
    System.out.println("x[0]: " + x[0] + ", y[0]: " + y[0]);
    y[0] = 8;
    System.out.println("x[0]: " + x[0] + ", y[0]: " + y[0]);

    // Example 2: methods
    int k = 10;
    System.out.println("k: " + k);
    f(k);
    System.out.println("k: " + k);

    int[]h = new int[3];
    h[0] = 10;
    System.out.println("h[0]: " + h[0]);
    g(h);
    System.out.println("h[0]: " + h[0]);
  }


  public static void f(int k) {
    k = k + 1;
  }

  public static void g(int[] h) {
    h[0] = h[0] + 1;
  }

}
