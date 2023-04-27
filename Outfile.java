import java.io.*;
import java.util.*;
public class Outfile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean done = false;

		PrintWriter outf = null;
		try
		{
			outf = new PrintWriter(new FileOutputStream("letter.txt", true));
			while(!done) {
				System.out.print("Enter string: ");
				String phrase = scan.nextLine();

				outf.println(phrase);
				System.out.println("Done? y/n: ");
				done = scan.nextLine().equalsIgnoreCase("Y");

			}
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
			System.exit(1);
		}
		finally
		{
			outf.close();
		}	
	}

}
