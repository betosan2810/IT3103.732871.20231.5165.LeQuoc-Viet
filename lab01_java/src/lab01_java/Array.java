//Le Quoc Viet 20215165
package lab01_java;

import java.util.Arrays;
public class Array {
	public static void main(String[] args) {
		int[] numbers = new int[] {1,5,3,6,7,9,3,4,12,11};
		int sum = 0;
		
		// sap xep mang
		Arrays.sort(numbers);
		
		// tinh tong cac phan tu trong mang
		for (int number : numbers) {
			sum += number;
		}
		
		// hien thi ket qua
		System.out.println("Mang da sap xep: " + Arrays.toString(numbers));
		System.out.println("Gia tri trung binh cua mang la: " + (double) sum / numbers.length);

}
}
