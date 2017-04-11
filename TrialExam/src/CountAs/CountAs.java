package CountAs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by georgezsiga on 4/11/17.
 */
public class CountAs {

  public List<String> readFile(String filename) {
    List<String> linesInTheFile = new ArrayList<>();
    try {
      Path filePath = Paths.get(filename);
      linesInTheFile = Files.readAllLines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("0");
      System.exit(0);
    }
    return linesInTheFile;
  }

  public int checkTheAs(String string) {

    return numberOfAs;
  }

  public static void main(String[] args) {
    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a" in the file, and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result
  }
}
