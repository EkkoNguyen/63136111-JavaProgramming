package Lab2;

import java.util.Scanner;

public class Lab2Bai2 {

	public static void main() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a: ");
		float a = scanner.nextFloat();
		System.out.print("Nhập b: ");
		float b = scanner.nextFloat();
		System.out.print("Nhập c: ");
		float c = scanner.nextFloat();
		if(a== 0) {
			if(b == 0){
				if(c == 0){
					System.out.print("Pt vô số nghiệm");
				}
				else{
					System.out.print("Pt vô nghiệm");
				}
			}else{
				System.out.printf("Pt có nghiệm x = %.3f",-c/b);
			}
		}else {
			double delta = Math.pow(b, 2) - 4*a*c;
			if(delta < 0) {
				System.out.print("Pt vô nghiệm");
			}else if(delta == 0) {
				System.out.printf("Pt có nghiệm kép x = %.3f",-b/2*a);
			}else {
				System.out.printf("Pt có nghiệm 2 nghiệm x = %.3f và x = %.3f",(-b + Math.sqrt(delta))/2*a,(-b - Math.sqrt(delta))/2*a);
			}
		}
	}

}
