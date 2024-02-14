public class WhileLoops {

  public static void main(String[] args) {
    manyHellos(3);
    System.out.println(sumN(4)); // expect 10
    System.out.println(sumN(5)); // expect 15

    System.out.println(yearsToTarget(1000, 0.05, 2000)); // expect 15

    System.out.println(breakEvenQuantity(1, 0.5, 1000)); // expect 2000
    System.out.println(breakEvenQuantity(1, 0.7, 1000)); // expect more than 2000
    // System.out.println(breakEvenQuantity(1, 1.5, 1000)); // INFINITE LOOP


  }

  // Example 1: Simple repetition
  public static void manyHellos(int n) {
    int i = n; // initialization
    while (i > 0) { // loop header : condition
      // loop body
      System.out.println("Hello " + i);
      i--;
    }
    System.out.println(i);
    System.out.println("Goodbye");
  }

  // Example 2: Accumulation
  // Problem: Sum up the first n integers
  // (including n) using a while loop
  public static int sumN(int n) {
    int result = 0;
    int i = 1;
    while (i <= n) {
      result += i;
      i++;
    }
    return result;
  }

  // another strategy
  public static int sumN_v2(int n) {
    int rsult = 0;
    while n> 0 {
      result = result + n;
      n--;
    }
    return result;
  }

  // Example 3: Compound Interest
  // Problem: Given an initial amount of money,
  // and a fixed (compound) interest rate,
  // how many years will it take to reach
  // a certain final amount?
  public static int yearsToTarget(double initMoney, double interestRate, double targetMoney) {
    int year = 0;
    double money = initMoney;
    while (money < targetMoney) {
      year++
      money *= (1 + interestRate);
      System.out.println(year + "\t" + ((int)money*100))/100.0);
      System.out.println(year + "\t" + ((int)money*100))/100.0);
    }
    return year;
  }

  public static int breakEvenQuantity(double p, double c, double k) {
    
  }

}
