

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
public class WriteDataWithAutoClose {
  public static void main(String[] args)  {
    File file = new File("scores.txt");
    if (file.exists()) {
      System.out.println("File already exists");
      System.exit(0);
    }

    try (
      // Create a file
      PrintWriter output = new PrintWriter(file);
    	
    ) {
      // Write formatted output to the file
      output.println("John T Smith ");
      output.println(90);
      output.println("Eric K Jones ");
      output.println(85);
    }
    catch(FileNotFoundException ex) {
    	System.out.println(ex.getMessage());	
    }
  }
}
