package openFileLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainApp {
 
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		String fileName;
		boolean stopFlag = false;
		do{
			System.out.println("Enter a file name you wish to open: ");
			fileName = keyboard.nextLine();
			
			Scanner input = null;
			try {
				File file = new File(fileName);
				input = new Scanner(file);
				while (input.hasNextLine()) {
					System.out.println(input.nextLine());
				}
				stopFlag = true;
			} catch (FileNotFoundException e) {
				System.out.println("The file was not found!");
			} finally {
				if (input != null) {
					input.close();
				}
			}
		}while(!stopFlag);

		
	}
	
	
}
