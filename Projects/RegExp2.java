public class RegExp2 {

  public static void main(String[] args) {
    String s = "Snnnnoooppp! I can't believe I forgot my snopppppp-ing fishing pole at home! I'm so angry I could just shout \"SNOP\"!";
    String pattern = "([sS]+)([nN])(\\w*)";
    s = s.replaceAll(pattern, "****");
    System.out.println("After re-assigning result back to text => " + s);
  }
}
