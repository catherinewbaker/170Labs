public class Accumulation {

  public static void main(String[]args) {
    System.out.println("--- Test sumN ---");
    System.out.println(sumN(1)); // expect 1
    System.out.println(sumN(2)); // expect 3
    System.out.println(sumN(5)); // expect 15

    System.out.println("--- Test multN ---");
    System.out.println(multN(1)); // expect 1
    System.out.println(multN(2)); // expect 2
    System.out.println(multN(3)); // expect 6
    System.out.println(multN(5)); // expect 120
    System.out.println(multN(0)); // expect 1 because you start result from 1

    System.out.println("--- Test sunMult5 ---");
    System.out.println(sumMult5(0)); // expect 0
    System.out.println(sumMult5(3)); // expect 0
    System.out.println(sumMult5(5)); // expect 5
    System.out.println(sumMult5(12)); // expect 15
    System.out.println(sumMult5(15)); // expect 30
    System.out.println(sumMult5(16)); // expect 30

    System.out.println("--- Test multiplyString ---");
    System.out.println(multiplyString("hey", 3)); // expect "heyheyhey"
    System.out.println(multiplyString("hey", 0)); // expect ""
    System.out.println(multiplyString("hey", 1)); // expect "hey"
    System.out.println(multiplyString("", 100)); // expect ""
    System.out.println(multiplyString("h", 5)); // expect "hhhhh"

  }

  //Sum all the positive integers between 1 and n (incuded)
  public static int sumN(int n) {
    int result = 0;
    for (int i = 1; i <= n; i++) {
      result = result + i; // same as "result += i;""
    }
    return result;
  }

// Multiply all the positive integers between 1 and n (included)
  public static int multN(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result = result * i;
    }
    return result;
  }

// sum all the positive integers multiple of 5 up to n (included)
  public static int sumMult5(int n) {
    int result = 0;
    for (int i = 5; i <= n; i += 5) { // i += 5 means i = i + 5
      result += i; // += is a shortcut for result = result + i
    }
    return result;
  }

// multiply a given string n times (i.e. multiS)
  public static int multiplyString(String s, int n) {
    String result = "";
    for (int i = 0; i < n; i++) {
      result += s;
    }
    return ; /// WHAT DO WE RETURN?
  }

// 1) Initialize a variable that will contain the result
// 2) Update the result inside a loop
// 3) After the loop, finalize (if needed) and return the result



}
