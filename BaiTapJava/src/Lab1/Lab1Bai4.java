package Lab1;

import java.util.Scanner;

public class Lab1Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a: ");
		float a = scanner.nextFloat();
		System.out.print("Nhập b: ");
		float b = scanner.nextFloat();
		System.out.print("Nhập c: ");
		float c = scanner.nextFloat();
		double delta = Math.pow(b, 2) - 4 * a * c;
		System.out.printf("%f %f",delta,Math.sqrt(delta));
	}

}
