

import java.util.Scanner; 
import java.io.*;

public class ReadDataWithAutoClose {
	public static void main(String[] args)  {
		// Create a File instance
		boolean fileFound = true;
		Scanner kb = new Scanner(System.in);
		do {

			System.out.print("Enter filename: ");
			String name = kb.next();
			File file = new File(name);

			try (
					Scanner input = new Scanner(file); 
					) // Create a Scanner for the file
			{
				// Read data from a file
				while (input.hasNext()) {
					String firstName = input.next();
					String mi = input.next();
					String lastName = input.next();
					int score = input.nextInt();
					System.out.println(
							firstName + " " + mi + " " + lastName + " " + score);
				}
			}
				catch (FileNotFoundException ex)
				{
					System.out.println("File not found. Try again.");
					fileFound = false;
				}

			}while(!fileFound);
		}
	}

