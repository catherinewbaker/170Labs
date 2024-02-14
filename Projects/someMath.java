public class someMath {

  public static void main(String[] args) {
    System.out.println("--- sumOfSquares ---");
    System.out.println(sumOfSquares(3)); // we should expect 14
    System.out.println(sumOfSquares(4)); // we should expect 30
    System.out.println(sumOfSquares(5)); // we should expect 55
    System.out.println(sumOfSquares(10)); // we should expect 385

    System.out.println("--- product ---");
    System.out.println(product(2, 3)); // we should expect 6
    System.out.println(product(4, 5)); // we should expect 20
    System.out.println(product(2, 15)); // we should expect 30
    System.out.println(product(10, 11)); // we should expect 110

    System.out.println("--- compoundInterest ---");
    System.out.println(compoundInterest(15, 0.20, 10)); // we should expect 92.88
    System.out.println(compoundInterest(500, 0.02, 15)); // we should expect 672.93
    System.out.println(compoundInterest(1000, 0.05, 3)); // we should expect 1157.63
    System.out.println(compoundInterest(5000, 0.10, 5)); // we should expect 8052.55

    System.out.println("--- polySpiralLength ---");
    System.out.println(polySpiralLength(3, 20, 3)); // we should expect 900.0
    System.out.println(polySpiralLength(5, 10, 4)); // we should expect 2100.0
    System.out.println(polySpiralLength(8, 5, 3)); // we should expect 1500.0
  }

// a)
  public static int sumOfSquares(int n) { // this returns the sum of (n)^2 + (n - 1)^2 + (n - 2)^2 + ... all the way to 1
    int result = 0;
    for (int i = 1; i <= n; i++) {
      result = result + (i * i);
    }
    return result;
  }

// b)
  public static int product(int x, int y) { // multiplies x * y without using "*"
    int result = 0;
    for (int i = 1; i <= y; i++) {
      result = result + x; // if multiplying 2 * 3 is adding 3 to itself 2 times, this equation adds x to result y times
    }
    return result;
  }

// c)
  public static double compoundInterest(double money, double interestRate, int years) { // gives the final amount of money after compounding interest without using "Math." functions
    double result = money;
    for (int k = 1; k <= years; k++) { // this repeats the equation for the amount of time the money is gathering interest. it is equivalent to setting the below equation to the power of (years)
      result = result + (result * interestRate); // this is equivalent to the interest equation Amount = (initial amount)^(rate)
    }
    return result;
  }

// d)
  public static double polySpiralLength(int n, double base, int rounds) { // computes the length of the polyspiral figures we drew for previous class work
    double result = 0;
    for (int i = 0; i < (n * rounds); i++) { // "n * rounds" makes the loop continue as long as the polyspiral adds another base
      result = result + ((i + 1) * base); // this adds the new length of the base everytime it increases
    }
    return result;
  }
}
