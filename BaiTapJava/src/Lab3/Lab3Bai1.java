package Lab3;

import java.util.Scanner;

public class Lab3Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ok = true;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số N muốn kiểm tra: ");
		int N = scanner.nextInt();
		for(int i=2; i <= Math.sqrt(N); i++){ 
			if(N % i == 0){
				ok = false;
				break;
			}
		}
		if(ok == true && N!=1) {
			System.out.printf("%d là số nguyên tố",N);
		}else {
			System.out.printf("%d không phải số nguyên tố",N);
		}
	}

}
