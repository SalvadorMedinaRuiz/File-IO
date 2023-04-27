

import java.util.Scanner; 
import java.util.*;
import java.io.File;

public class ReadData {
  public static void main(String[] args) throws Exception {
    // Create a File instance
    File file = new File("scores.txt");

    // Create a Scanner for the file
    Scanner input = new Scanner(file);

    // Read data from a file
    while (input.hasNext()) { //checks if there is a string and if there is keep going
      String firstName = input.next(); //grabs a WORD
      String mi = input.next(); //grabs the next word
      String lastName = input.next(); //grabs the next word
      int score = input.nextInt(); //grabs the next int
      System.out.println(
        firstName + " " + mi + " " + lastName + " " + score);
    }

    // Close the file
    input.close();
  }
}
