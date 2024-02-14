public class extractMovieTitle {

  public static void main(String[] args) {
    System.out.println(extractTitle("<item><title>Split (2017)</title><meta><imdb>6375308</imdb></meta>")); // returns "Split (2017)"
    System.out.println(extractTitle("<item><title>Les Choristes</title><meta><imdb>6375308</imdb></meta>")); // returns "Split (2017)"

  }

  public static String extractTitle(String a) {
      String pattern = "(.*)(<title>)(.*)(</title.)(.*)"; // this pattern separates the title from the rest of the string
      return a.replaceAll(pattern, "$3"); // replaces String a with only the title and returns it
  }
}
