public class Change {

  public static void main(String[] args) {
    System.out.println(money(34.33, 40)); // [1, 0, 2, 1, 1, 2] ($5.67)
    System.out.println(money(15.00, 15)); // [0, 0, 0, 0, 0, 0] ($0.00)
    System.out.println(money(25.68, 35)); // [1, 4, 1, 0, 1, 2] ($9.32)
    System.out.println(money(10.55, 100)); // [17, 4, 1, 2, 0, 0] ($89.45)
  }

  // this method takes the total price at a store and the cash received for payment
  // and returns an array (in the form of a string) where position 0 is the number of
  // five dollar bills needed, 1 is the number of one dollar bills, 2 is the number,
  // of quarters, 3 is dimes, 4 is nickles, and 5 is pennies.
  public static String money(double total, int cash) {
    int[] a = new int[6];
    double change = cash - total;
    a[0] = 0;
    a[1] = 0;
    a[2] = 0;
    a[3] = 0;
    a[4] = 0;
    a[5] = 0;
    while (change > 0) { // runs the if statements until change = 0
      if (change >= 5) { // identifies which array position to pull from next (fives, ones, etc.)
        a[0] = a[0] + 1; // adds one to array position 0
        change -= 5; // subtracts the amount we already accounted for
      } else if (change >= 1) { // each "else if" statement continues like the one above
        a[1] = a[1] + 1;        // but with their respective change amount
        change -= 1;
      } else if (change >= 0.25) {
        a[2] = a[2] + 1;
        change -= 0.25;
      } else if (change >= 0.10) {
        a[3] = a[3] + 1;
        change -= 0.10;
      } else if (change >= 0.05) {
        a[4] = a[4] + 1;
        change -= 0.05;
      } else if (change >= 0.01) {
        a[5] = a[5] + 1;
        change -= 0.01;
      } else if (change < 0.01) {
          break;
        }

    }
    String result = "["; // this next section just turns the array into a string
    for (int i = 0; i < a.length - 1; i++) {
      result += a[i] + ", ";
    }
    if (a.length > 0) {
      result += a[a.length - 1];
    }
    result += "]";

    return result;
  }


}
