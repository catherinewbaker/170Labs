// Towers of Hanoi
//
// You can play the game here:
//   https://www.mathsisfun.com/games/towerofhanoi.html

public class Hanoi {

  public static void main(String[] args) {
    System.out.println("----- Towers of Hanoi (version 1) -----");
    hanoi(3, "A", "C", "B");

    System.out.println("----- Towers of Hanoi (version 2) -----");
    hanoi2(3, "A", "C", "B");

    System.out.println("----- Towers of Hanoi (version 3) -----");
    hanoi3(3, "A", "C", "B");

    System.out.println("----- Towers of Hanoi (version 4) -----");
    int count = hanoi4(3, "A", "C", "B");
    System.out.println("Total moves: " + count);
  }


  // Towers of Hanoi
  // Moves n disks from rod "source" to rod "target" using
  // a temporay rod "temp"
  public static void hanoi(int n, String source, String target, String temp) {
    if (n == 1) {
        // base case: just move one disk from source to target
        System.out.println("Move from " + source + " to " + target);
    } else {
        // recursive case:
        // 1) move n-1 disks from source to temporary
        // 2) move 1 disk from source to target
        // 3) move n-1 disks from temporary to target
        hanoi(n - 1, source, temp, target);
        hanoi(1, source, target, temp);
        hanoi(n - 1, temp, target, source);
    }
  }


  // We can rewrite the method with a base case of zero disks
  public static void hanoi2(int n, String source, String target, String temp) {
    if (n == 0) {
    // base case: there are no disks, do nothing
        return;
    } else {
        // recursive case:
        // 1) move n-1 disks from source to temporary
        // 2) move 1 disk from source to target
        // 3) move n-1 disks from temporary to target
        hanoi2(n-1, source, temp, target);
        System.out.println("Move from " + source + " to " + target);
        hanoi2(n-1, temp, target, source);
    }
  }


  // We can also switch the logic of the if .. else statement.
  // This method works like hanoi2, but it's a little less
  // readable because the base case is not written explicitly
  // (but it's still there!).
  public static void hanoi3(int n, String source, String target, String temp) {
    if (n > 0) {
        // recursive case:
        // 1) move n-1 disks from source to temporary
        // 2) move 1 disk from source to target
        // 3) move n-1 disks from temporary to target
        hanoi3(n-1, source, temp, target);
        System.out.println("Move from " + source + " to " + target);
        hanoi3(n-1, temp, target, source);
    }
  }


  // If we want to count the number of moves, we need to percolate
  // this value backwards from the recursive call using "return"
  // statements. This version of the method prints all the moves
  // and returns the total number of moves.
  public static int hanoi4(int n, String source, String target, String temp) {
    if (n == 1) {
        // base case: move one disk from source to target, and
        // return the number of moves (which is just 1)
        System.out.println("Move from " + source + " to " + target);
        return 1;
    } else {
        // recursive case:
        // 1) move n-1 disks from source to temporary
        // 2) move 1 disk from source to target
        // 3) move n-1 disks from temporary to target
        // Accumulate the total number of moves taken by each of the
        // three recursive calls, and return it
        int moves = 0;
        moves += hanoi4(n-1, source, temp, target);
        moves += hanoi4(1, source, target, temp);
        moves += hanoi4(n-1, temp, target, source);
        return moves;
    }
  }

}

