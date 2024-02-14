public class RandomNumbers {

  public static void main(String[] args) {
    System.out.println(random(3));
    System.out.println(random(50));
    System.out.println(random(100));
  }

  public static double random(int n) {
    double x = Math.random() * n;
    return x;
  }
}
