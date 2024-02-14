public class gameday {

  public static void main(String[] args) {
    System.out.println(response("scoreus: 155")); // expect "GOOAAALLL! Home score: 55"
    System.out.println(response("scorethem: 60")); // expect "DEFENSE --- DEFENSE --- DEFENSE! Away score: 60"
    System.out.println(response("lose"));
    System.out.println(response("win"));
  }
  // this method takes a given input and produces a custom response
  public static String response(String status) {
    String result = "";
    if (status.substring(0, 3).equals("win")) { // the if statements in this code identify which phrase has been entered
    result += "GOOO EAGLES!";
    } else if (status.substring(0, 4).equals("lose")) {
      result += "Good Game!";
    } else if (status.substring(0, 7).equals("scoreus")) {
      result += "GOOAAALLL! Home score: " + status.substring(9, (status.length())); // last substring adds the score
    } else if (status.substring(0, 9).equals("scorethem")) {
      result += "DEFENSE --- DEFENSE --- DEFENSE! Away score: " + status.substring(11, (status.length()));
    } else {
      result += "wrong input"; // contingency if an input is entered that isn't standard
    }
    return result;
  }
}
