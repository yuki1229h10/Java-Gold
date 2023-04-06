package practice.chapter1.section3.five.higherOrderFunction;

import java.util.ArrayList;

/** for文を使った記法 */
// public class Main {
// public static void main(String[] args) {
// List<Hero> heroes = new ArrayList<>();

// boolean anyoneKnockedOut = false;
// for (Hero h : heroes) {
// if (h.hp == 0) {
// anyoneKnockedOut = true;
// break;
// }
// }
// }
// }

/** 高階関数の記法 */
public class Main {
  public static void main(String[] args) {
    List<Hero> heroes = new ArrayList<>();

    boolean anyoneKnockedOut = heroes.stream().anyMatch(h -> h.hp == 0);
  }
}
