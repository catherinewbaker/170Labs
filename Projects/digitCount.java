public class digitCount {

  public static void main(String[] args) {
    System.out.println(digitCount(456234, 8)); // 0
    System.out.println(digitCount(456234, 5)); // 1
    System.out.println(digitCount(456234, 4)); // 2
    System.out.println(digitCount(-456234, 4)); // 2
    System.out.println(digitCount(0, 0)); // 1
  }
  // take number and returns how many times digit occurs in number
  public static int digitCount(int number, int digit) {
    int result = 0;
    int number2 = Math.abs(number); // makes the number positive
    String s = "" + number2; // solely for the purpose of tracking the length
    if (digit == 0) { // contingency plan if digit = 0 since you can't really % by 0
      for (int i = 0; i < s.length(); i++) { // length of the number
        if ((number2 % 10) == 0) { // adds one to result if the last number is 0
          result += 1;
        }
        number2 = number2 / 10; // int division removes the last digit of number
      }
    } else {
      for (int i = 0; i < s.length(); i++) { // length of the number
        if (((number2 % 10) % digit) == 0) { // singles out the last digit of number and mods it by digit, if they equal each other, it will equal 0
          result += 1; // and add 1 to result
        }
        number2 = number2 / 10; // removes the last digit
      }
    }
    return result;
  }


}
