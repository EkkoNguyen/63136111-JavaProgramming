package Lab2;
import java.util.Scanner;

public class Lab2Bai4 {

	public static void main(String[] args) {
		int key;
		// TODO Auto-generated method stub
		do {
			System.out.println("+---------------------------------------------------+");
			System.out.println("1. Giải phương trình bậc nhất");
			System.out.println("2. Giải phương trình bậc 2");
			System.out.println("3. Tính tiền điện");
			System.out.println("4. Kết thúc");
			System.out.println("+---------------------------------------------------+");
			System.out.print("Chọn chức năng: ");
			Scanner scanner = new Scanner(System.in);
			key = scanner.nextInt();
			switch(key) {
				case 1:
					Lab2Bai1.main();
					break;
				case 2:
					Lab2Bai2.main();
					break;
				case 3:
					Lab2Bai3.main();
					break;
				default:
					break;
			}
		}while(key != 4);
	}

}
