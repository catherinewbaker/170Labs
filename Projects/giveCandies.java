public class giveCandies {

    // write your method here
    public static String giveCandies(int n, int s) {
        int d = n / s;
        int r = n % s;
        String answer = "I have " + n + " candies and " + s + " students. I can give " + d + " candies to each student and have " + r + " left.";
        return answer;
    }

    public static void main(String[] args) {
        // test your method here
        giveCandies(5, 2);
    }

}
