public class Conditionals {

  public static void main(String[] args) {
    System.out.println("--- Test smallestNumber ---");
    System.out.println(smallestNumber(5, 2); // 2.0
    System.out.println(smallestNumber(2, 3); // 2.0
    System.out.println(smallestNumber(5, 5); // 5.0

    System.out.println("--- Test longestString ---");
    System.out.println(longestString("economics", "mathematics"); // "mathematics"
    System.out.println(longestString("mathematics", "economics"); // "mathematics"
    System.out.println(longestString("aaa", "bbb"); // "bbb"
    System.out.println(longestString("bbb", "aaa"); // "aaa"

    System.out.println("--- Test stateOfWater ---");
    System.out.println(stateOfWater(-10); // "solid"
    System.out.println(stateOfWater(0); // "liquid"
    System.out.println(stateOfWater(30); // "liquid"
    System.out.println(stateOfWater(100); // "gas"
    System.out.println(stateOfWater(150); // "gas"

    System.out.println("--- Test letterGrade ---");
    System.out.println(letterGrade(10000); // "too many points!"
    System.out.println(letterGrade(1000); // "A"
    System.out.println(letterGrade(850); // "B"
    System.out.println(letterGrade(730); // "C"
    System.out.println(letterGrade(616); // "D"
    System.out.println(letterGrade(430); // "F"






  }

  //Returns the smallest of two numbers
  public static double smallestNumber(double x, double y) {
    if (x < y) {
      return x;
    } else {
      return y;
    }
  }

  // Returns the longest string
  public static String longestString(String s1, String s2) {
    if (s1.length() > s2.length()) {
      return s1;
    } else {
      return s2;
    }
  }

  // takes a number (temp) and returns the state of water at that temperature
  public static String stateOfWater(double temp) {
    String state;
    if (temp < 0) {
      state = "solid"
  //} else if (0 <= temp <= 100) { // ERROR: caparing boolean and an int
  //} else if (temp >= 0 && temp <= 100) { // excess code
  } else if (temp <= 100) {
      state = "liquid"
    } else {
      state = "gas"
    }
    return state;
  }

  // Returns a letter grade diven the number of points
  public static String lettergrade(int points) {
    String letter;
    if (points > 1000) {
      letter = "too many points!"
    } else if (points >= 900) {
      letter = "A";
    } else if (points >= 800) {
      letter = "B"
    } else if (points >= 700) {
      letter = "C"
    } else if (points >= 600) {
      letter = "D"
    } else {
      letter = "F"
    }
    return letter;
  }



















}
