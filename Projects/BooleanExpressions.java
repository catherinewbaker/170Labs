public class BooleanExpressions {

  public static void main(String[] args) {



      // Relational (comparison) operators
      // < less than
      // > greater than
      // <= less or equal
      //  >= greater or equal
      // == equals
      // != not equals

      // Boolean (logical) operators
      // && and
      // || or
      // ! not
      System.out.println("- - Boolean operators test - -");
      System.out.println(!true); // false
      System.out.println(!false); // true

      System.out.println(true && true); // true
      System.out.println(true && false); // false
      System.out.println(false && true); // false
      System.out.println(false && false); // false

      System.out.println(true || true); // true
      System.out.println(true || false); // true
      System.out.println(false || true); // true
      System.out.println(false || false); // false

      // Boolean operator precedence
      // 1) !
      // 2) &&
      // 3) ||
      System.out.println(false || !true && true); // false
    }

}
