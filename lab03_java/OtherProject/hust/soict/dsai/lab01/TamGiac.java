//LeQuocViet20215165
package lab01_java;

import java.util.Scanner;

public class TamGiac {
	public static void main(String[] args) {
		//NHapp n
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap n:  ");
		int n= keyboard.nextInt();
		//print * && " "
		for(int i=1;i<=n;i++) {
			
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		keyboard.close();
	}
	    

}
