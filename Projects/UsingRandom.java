public class UsingRandom {

  public static void main(String[] args) {
    // Math.random() generates a pseudo-random number
    // between 0 (inclusive) and 1 (exclusive):
    // 0 <= Math.random() < 1
    System.out.println(Math.random());

    // What are the possible values for x?
    // double 0.0 <= x < 30.0
    double x = Math.random() * 30;
    System.out.println("x: " + x);

    // What are the possible values for y?
    // int 0 <= y <= 29 (int)
    int y = (int)(Math.random() * 30);
    System.out.println("y: " + y);

    // What are the possible values for z?
    // int -15 <= z <=  14
    int z = (int)(Math.random() * 30) - 15;
    System.out.println("z: " + z);

    // General formula for a random int x
    // such that a <= x <= b
    // int x = (int)(Math.random() * (b - a + 1)) + a
  }
}

