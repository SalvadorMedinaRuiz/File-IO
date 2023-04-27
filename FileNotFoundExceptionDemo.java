

import java.util.Scanner;
import java.io.*;

public class FileNotFoundExceptionDemo { 
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);   
    // Prompt the user to enter a file name
    System.out.print("Enter a filename: ");
    String filename = kb.nextLine();
    File file = new File(filename);
    
    try (
      Scanner infile = new Scanner(file);
    		)
    {
      System.out.println("File " + filename + " exists "); 
      // Processing file ...
    }
    catch (FileNotFoundException ex) {
      System.out.println("Exception: " +  filename + " not found");
    }
    finally {
    	kb.close();
    }
    
  }
}
