package Lab1;

import java.util.Scanner;

public class Lab1Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh của một khối lập phương: ");
		float canh = scanner.nextFloat();
		double the_tich = Math.pow(canh, 3);
		System.out.printf("%.3f",the_tich);
	}

}
