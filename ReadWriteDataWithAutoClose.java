

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
public class ReadWriteDataWithAutoClose {
	public static void main(String[] args) throws Exception {
		File infile = new File("scores.txt");
		File outfile = new File("average.txt");
		if (outfile.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		double average = 0;
		double sum = 0;

		try (
				// Create a Scanner for the input file
				Scanner input = new Scanner(infile); 
				// Create an output file
				PrintWriter output = new PrintWriter(outfile);
		) 
		{
			// Read data from a file
			while (input.hasNext()) {
				String name = input.nextLine();
				int score = input.nextInt();
				input.nextLine();
				sum += score;
			}// Write formatted output to the file
			output.print("Average is: " + (sum/2));
		}
	}
}
