package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		System.out.println("Nhập các phần tử của List: ");
		int i = 1;
		while(true){
			System.out.printf("Nhập phần tử thứ %d: ",i);
			Double x = scanner.nextDouble();
			list.add(x);
			i++;
			System.out.print("Nhập thêm (Y/N)? ");
			if(scanner.next().equals("N")){
				break;
			}
		}
		System.out.println("Các phần tử trong list: ");
		for (Double x : list) {
			System.out.println(x);
		}
	}

}
