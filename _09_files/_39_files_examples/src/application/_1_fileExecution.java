package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class _1_fileExecution {
	public static void main(String[] args) {

		File file = new File("/home/caio_ubuntu/Videos/words.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		
	}
}
