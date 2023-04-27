

import java.util.Scanner; 
import java.io.File;

public class ReadDataWithFinally {
	public static void main(String[] args) throws Exception {
		// Create a File instance
		File file = new File("scores.txt");
		Scanner input = null;
		try {
			// Create a Scanner for the file
			input = new Scanner(file);

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

		finally 
		{// Close the file
			if (input != null) 
				input.close();
		}
	}
}

