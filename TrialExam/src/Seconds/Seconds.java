package Seconds;

import java.util.ArrayList;

/**
 * Created by georgezsiga on 4/11/17.
 */

public class Seconds {


  public ArrayList<Integer> everySecondNumber(ArrayList list) {
    ArrayList<Integer> sortedList = new ArrayList<>();
    for (int i = 1; i < list.size() ; i+=2) {
      Integer number = (int) list.get(i);
      sortedList.add(number);
    }
    return sortedList;
  }

  public static void main(String[] args) {
    // Create a function that takes a list as a parameter,
    // and returns a new list with every second element from the orignal list
    // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);


  }
}
