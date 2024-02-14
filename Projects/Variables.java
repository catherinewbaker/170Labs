public class Variables {

  public static void main(String[] args) {
    int x; // declaration of a variable x of type int
    x = 3; // assign value 3 to variable x
    System.out.println(x);
    int y = 5;
    System.out.println(y);
    int z;
    z = x + y;
    System.out.println(z);

    System.out.println("x contains: " + x);
    System.out.println("y contains: " + y);
    System.out.println("z contains: " + z);
    x = 30;
    y = 50;
    System.out.println("x contains: " + x);
    System.out.println("y contains: " + y);
    System.out.println("z contains: " + z);
    z = 100;
    System.out.println("x contains: " + x);
    System.out.println("y contains: " + y);
    System.out.println("z contains: " + z);
    x = x + 1;
    System.out.println("x contains: " + x);
    // x = 5.2; // ERROR: incompatible type
    x = (int)5.2;
      System.out.println("x contains: " + x);
    // double x = 5.2; ERROR: we cannot re-declare the same variable twice

  }


}
