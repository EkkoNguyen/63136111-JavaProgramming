package Lab1;

import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		float dai = scanner.nextFloat();
		System.out.print("Nhập chiều rộng: ");
		float rong = scanner.nextFloat();
		double chu_vi = (dai + rong)*2;
		double dien_tich = dai * rong;
		float canh_nho_nhat = Math.min(dai, rong);
		System.out.printf("%.3f %.3f %.3f", chu_vi, dien_tich, canh_nho_nhat);
	}

}
