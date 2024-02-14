import java.util.Scanner;
import java.util.InputMismatchException;

public class restaurantOrder{

  public static void main(String[] args) {
    Scanner scan = new Scanner();
    String input;
    String name = "[N/A]";
    String order = "[N/A]";
    int amount = 0;

    System.out.println("Welcome to Berry Blast! Please enter your order. Once all"
    + " sections are completed, please quit the program and your order will be placed."
    + " Please remember that the max amount of items that can be ordered at one time "
    + "is 10, and names can be no longer than 12 characters.");
    System.out.println("Enter 'n' for name.\nEnter 'o' for order.\nEnter 'a' for amount.\nEnter 'q' to quit.");
    System.out.println("Thank you for dining with us at Berry Blast Restaurant!");

    while( ! input.equals("q")) {
      if (input.equals("n")){
        System.out.println("Enter name:");
        String newname = scan.next();
        checkName(newname);
        name = newName;
      } else if (input.equals("o")){
        System.out.println("Enter order:");
        order = scan.next();
      } else if (input.equals("a")){
        System.out.println("Enter amount:");
        int newAmount = scan.next();
        checkAmount(newAmount);
        amount = newAmount;
      }
      System.out.println("Name: " + name + "\nOrder: " + order + "\nAmount: " + amount);
    }
  }

  public static String checkName(String a) {
    String b = "";
    if (a.length() < 12) {
      b = a;
    } else if (a.length() >= 12) {
      b = a.substring(0, 12);
    }
    return b;
  }

  public static int checkAmount(int x) {
    if (x > 10) {
      x = 10;
    }
    return x;
  }
}
