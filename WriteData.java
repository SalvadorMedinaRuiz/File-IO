
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class WriteData {
  public static void main(String[] args)  {
    File file = new File("anotherscores.txt");
    if (file.exists()) {
      System.out.println("File already exists");
      System.exit(0);
    }

    PrintWriter output = null;
    // Create a file
    
    try {
    output = new PrintWriter(file);

    // Write formatted output to the file
    output.println("John T Smith ");
    output.println(90);
    output.println("Eric K Jones ");
    output.println(85);
    
    }
    
    catch(FileNotFoundException ex) {
    	System.out.println(ex.getMessage());	
    }
    // Close the file
    finally {
    output.close();
    }
  }
}
