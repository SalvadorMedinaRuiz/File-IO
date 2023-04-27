
import java.io.PrintWriter;
import java.io.IOException;

public class FinallyDemo {
  public static void main(String[] args) {
    PrintWriter output = null;

    try {
      // Create a file
      output = new PrintWriter("text.txt");

      // Write formatted output to the file
      output.println("Welcome to Java");
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
    finally {
      // Close the file
      if (output != null) output.close();
    }
    
    System.out.println("End of the program");  
  }
}
