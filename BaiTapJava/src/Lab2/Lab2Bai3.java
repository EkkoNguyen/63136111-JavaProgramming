package Lab2;

import java.util.Scanner;

public class Lab2Bai3 {

	public static void main() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện sử dụng trong tháng này: ");
		float dien = scanner.nextFloat();
		if(dien > 0 && dien < 50) {
			System.out.printf("Tiền = %.3f", dien*1000);
		}else if(dien >= 50){
			System.out.printf("Tiền = %.3f", 50*1000 + (dien - 50)*1200);
		}
	}
}
