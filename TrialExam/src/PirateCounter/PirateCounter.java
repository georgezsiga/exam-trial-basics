package PirateCounter;
import java.util.*;
/**
 * Created by georgezsiga on 4/11/17.
 */
// Write a function that takes any list that contains pirates as in the example,
// And returns a list of names containing the pirates that
// - have wooden leg and
// - have more than 15 gold
public class PirateCounter {

  public String hasNoLegAndGold(ArrayList arrayList) {
    String piratesWithNoLegAndWithGold = "";
    for (int i = 0; i < arrayList.size() ; i++) {
      Pirate pirate = (Pirate) arrayList.get(i);
      if (pirate.hasWoodenLeg && (pirate.getGold() > 15)) {
                piratesWithNoLegAndWithGold = piratesWithNoLegAndWithGold + " " + pirate.getName();
      }
    }
    System.out.println(piratesWithNoLegAndWithGold);
    return piratesWithNoLegAndWithGold;
  }

  public static void main(String... args){
    PirateCounter pirateCounter = new PirateCounter();
    ArrayList<Pirate> pirates = new ArrayList<>();

    // Given this list...

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));

    pirateCounter.hasNoLegAndGold(pirates);
  }
}
