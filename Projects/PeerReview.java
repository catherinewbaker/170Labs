public class PeerReview {

  public static void main(String[] args) {
//    System.out.println(notification(0)); // (TC1) expect "You need to write and turn in a paper to receive peer reviews!"
//    System.out.println(notification(30)); // (TC2) expect "You may use five peer reviews to improve your grade"
//    System.out.println(notification(52)); // (TC3) expect "You may peer review four times to improve your grade"
//    System.out.println(notification(65)); // (TC4) expect "You get three peer reviews to improve your grade! use them wisely!"
//    System.out.println(notification(76)); // (TC5) expect "You can peer review two times to improve your grade"
//    System.out.println(notification(87)); // (TC6) expect "feel free to peer review one time to improve your grade"
//    System.out.println(notification(92)); // (TC7) expect "Great job! No peer review necessary!"
    System.out.println(notification(102)); // (TC8) expect "Grades can't be above 100!"
  }

  public static String notification(double grade) {
    String response = "";
    if (grade > 100) {
      response = "Grades can't be above 100!";
    } else if (grade >= 90) {
      response = "Great job! No peer review necessary!";
    } else if (grade >= 80) {
      response = "feel free to peer review one time to improve your grade";
    } else if (grade >= 70) {
      response = "You can peer review two times to improve your grade";
    } else if (grade >= 60) {
      response = "You get three peer reviews to improve your grade! use them wisely!";
    } else if (grade >= 50) {
      response = "You may peer review four times to improve your grade";
    } else if (grade < 50 && grade > 0) {
      response = "You may use five peer reviews to improve your grade";
    } else if (grade <= 0) {
      response = "You need to write and turn in a paper to receive peer reviews!";
    }
    return response;
  }





}
