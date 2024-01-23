package Lab2;

import java.util.Scanner;

public class Lab2Bai1 {

	public static void main() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a: ");
		float a = scanner.nextFloat();
		System.out.print("Nhập b: ");
		float b = scanner.nextFloat();
		if(a == 0){
			if(b == 0){
				System.out.print("Pt vô số nghiệm");
			}
			else{
				System.out.print("Pt vô nghiệm");
			}
		}else{
			System.out.printf("Pt có nghiệm x = %.3f",-b/a);
		}
	}
}
