import java.io.*;
import java.util.Scanner;
public class StringText {

	public static void main (String[] args) { // throws FileNotFoundException{
		Scanner scan = new Scanner(System.in);
		File afile = new File ("data.txt");
		
		System.out.print("Enter output filename: ");
		String outfilename = scan.next();
		File copyfile = new File(outfilename);
		
		try (Scanner txtfile = new Scanner (afile);
				PrintWriter outf  = new PrintWriter(copyfile);	) {		

			System.out.println("Length of file: " + afile.length());
			System.out.println("Actual name of file: " + afile.getName());
			
			while (txtfile.hasNext()) {
				String phrase = txtfile.nextLine();
				System.out.println(phrase);
				outf.println(phrase);
			}
			
		}
		catch (FileNotFoundException e){
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		
	
	}
	
}
