package Two;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Two {
	
	public static void main(String[] args) {
		// i. From user Input System.in you will create a file name userInput.txt
		System.out.print("Enter the file name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		File file = new File(name);
		
		try {
			if(file.createNewFile()) {
				System.out.println("The file: "+ file.getPath() +" was created successfully.");
			}else {
				System.out.println("File not created.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ii. Create a new directory called /dir
		System.out.println();
		File dir = new File("dir");
		if(dir.mkdir()) {
			System.out.println("Directory was created:  "+ dir.getAbsolutePath());
		}
		
		
		// iii. move the userInput.txt file to dir
		System.out.println();
		Path temp = null;
		try {
			 temp = Files.move(Paths.get(file.getAbsolutePath()), Paths.get(dir.getAbsolutePath() + "\\" +name));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e);
		}
		
		if(temp != null) {System.out.println("The file was moved to /dir.");}
		
		//iv. List all the files inside /dir storing the name of the first file
		System.out.println();
		String[] fileList = dir.list();
		
		System.out.println("First item: " + fileList[0]);
		
		//v. and copy with the name userInput.txt.bck
		System.out.println();
		temp = null;
		try {
			temp = Files.copy(Paths.get(dir.getAbsolutePath() + "\\"+fileList[0]), Paths.get(dir.getAbsolutePath() + "\\userInput.txt.bck" ));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(temp != null) {System.out.println("The file was copied and saved as userInput.txt.bck.");}
		
		
		//vi. remove the userInput.txt
		System.out.println();
		file = new File(dir.getAbsolutePath() + "\\"+fileList[0]);
		if(file.delete()) {System.out.println("File " + fileList[0] + " was deleted." );}
		
		input.close();
	}

}
