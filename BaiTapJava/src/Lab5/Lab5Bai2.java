package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Lab5Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int key;
		ArrayList<String> list = new ArrayList<>();
		// TODO Auto-generated method stub
		do {
			System.out.println("+---------------------------------------------------+");
			System.out.println("1. Nhập danh sách họ và tên");
			System.out.println("2. Xuất danh sách vừa nhập");
			System.out.println("3. Xuất danh sách ngẫu nhiên");
			System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
			System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
			System.out.println("6. Kết thúc");
			System.out.println("+---------------------------------------------------+");
			System.out.print("Chọn chức năng: ");
			key = scanner.nextInt();
			switch(key) {
				case 1:
					int i = 1;
					while(true){
						System.out.printf("Nhập phần tử thứ %d: ",i);
						String x = scanner.next();
						list.add(x);
						i++;
						System.out.print("Nhập thêm (Y/N)? ");
						if(scanner.next().equals("N")){
							break;
						}
					}
					break;
				case 2:
					System.out.println("\nDanh sách họ và tên vừa nhập:");
					for (String x : list) {
						System.out.println(x);
					}
					break;
				case 3:
					System.out.println("\nDanh sách ngẫu nhiên:");
					Collections.shuffle(list); 
					for (String x : list) {
						System.out.println(x);
					}
					break;
				case 4:
					System.out.println("\nDanh sách sau khi sắp xếp giảm dần:");
					Collections.sort(list);
					Collections.reverse(list);
					for (String x : list) {
						System.out.println(x);
					}
					break;
				case 5:
					System.out.print("\nNhập họ và tên cần xóa: ");
					String ten = scanner.next();
					Iterator<String> iterator = list.iterator();
			        while (iterator.hasNext()) {
			            String tenList = iterator.next();
			            if (tenList.equals(ten)) {
			                iterator.remove();
			                break;
			            }
			        }
					break;
				default:
					break;
			}
		}while(key != 6);
	}
}
