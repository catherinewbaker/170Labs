import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab12{
	public static void main(String[] args){
		double total = 0.0;

				// get file
				String fileInName = "items.txt";
				String fileOutName = "receipt.txt";

				// Read File
				Scanner scanner = null;
				File fileIn = new File(fileInName);
				scanner = new Scanner(fileIn);



				// write File
				//out.write("====================================");
				//out.newLine();

				File fileOut = new File(fileOutName);
				FileWriter fw = new FileWriter(fileOut);
				BufferedWriter out = new BufferedWriter(fw);

				out.write("====================================");
				out.newLine();



	}
}
