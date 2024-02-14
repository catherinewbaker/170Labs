public class storyteller {

  public static void main(String[] args) {
//    storyteller("Sarah", "Kelly", 16, "rubies", "yelled at", "rocks", "sad", "stopped yelling"); // TC1
    storyteller("Lani", "Janice", 24, "dolls", "cast a spell on", "bricks", "dsitraught", "reversed the spell"); // TC2
  }

  public static void storyteller(String name1, String name2, int quantity, String item, String meanPhrase, String item2, String feeling, String oppositeMeanPhrase) {
    System.out.print(name1 + " was a beautiful princess. " + name2 + " was a wicked witch. " + name1 + " had " + quantity + " expensive ");
    System.out.print(item + ", whereas " + name2 + " had only " + (quantity / 2) + ". Becasue of envy, " + name2 + " " + meanPhrase);
    System.out.print(" Alice, yelling these arcane magical words: " + (name1.substring((name1.length()-1),(name1.length())).toUpperCase()) + "aa" + (name1.substring(0, 1).toLowerCase()));
    System.out.print(" " + name2.substring((name2.length()-1),(name2.length())).toLowerCase() + "ee" + (name2.substring(0, 1).toLowerCase()) + " ");
    System.out.print(item.substring((item.length()-1),(item.length())) + "ii" + (item.substring(0, 1).toLowerCase()) + "! ");
    System.out.print((name1.substring((name1.length()-1),(name1.length())).toUpperCase()) + "AA" + (name1.substring(0, 1).toUpperCase()) + " ");
    System.out.print(name2.substring((name2.length()-1),(name2.length())).toUpperCase() + "EE" + (name2.substring(0, 1).toUpperCase()) + " ");
    System.out.print(item.substring((item.length()-1),(item.length())).toUpperCase() + "II" + (item.substring(0, 1).toLowerCase()).toUpperCase() + "! ");
    System.out.print("Suddenly, " + name1 + "'s " + quantity + " " +item + " turned into " + item2 + ". " + name1 + " became very " + feeling + ". ");
    System.out.print("Seeing that " + name1 + " was " + feeling + ", " + name2 + " realized she was wrong and " + oppositeMeanPhrase + ". " + name1);
    System.out.println(" and " + name2 + " became friends and they lived happily ever after.");
  }
} // the most complicated part of this code ar ethe parts where the magical spell is written. First
// I identified the letters I wanted to pickout through .substring(), and then I used .toLowerCase
// and .toUpperCase to adjust the cases. To acount for not knowing the lengths of some words, but
// still having to use the last letter of them, I made the parameters of .substring(), .length()-1
// to .length(). This selects the last letter of any word used.
