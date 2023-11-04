package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter M number of rows: ");
		int m = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter N number of columns: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		System.out.println();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("\nEnter the value to be searched for: ");
		int x = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("-----------------------");
					System.out.println("Position " + i + "," + j + ":\n");
					if (j-1 >= 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (j+1 < mat[i].length) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i-1 >= 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (i+1 < mat.length) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					System.out.println("-----------------------");
					System.out.println();
				}
			}
		}
		
		
		sc.close();
	}

}
