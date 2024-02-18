package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import Lab4Bai4.SanPham;

public class Lab5Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int key;
		ArrayList<SanPham> list = new ArrayList<>();
		// TODO Auto-generated method stub
		do {
			System.out.println("+---------------------------------------------------+");
			System.out.println("1. Nhập danh sách sản phẩm từ bản phím");
			System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
			System.out.println("3. Tìm và xóa họ tên nhập từ bàn phím");
			System.out.println("4. Xuất giá trung bình của các sản phẩm");
			System.out.println("5. Kết thúc");
			System.out.println("+---------------------------------------------------+");
			System.out.print("Chọn chức năng: ");
			key = scanner.nextInt();
			switch(key) {
				case 1:
					int i = 1;
					while(true){
						System.out.printf("Nhập sản phẩm thứ %d: \n",i);
						SanPham sp = new SanPham();
						sp.nhap();
						list.add(sp);
						i++;
						System.out.print("Nhập thêm (Y/N)? ");
						if(scanner.next().equals("N")){
							break;
						}
					}
					break;
				case 2:
					Collections.sort(list, new Comparator<SanPham>() {
			            @Override
			            public int compare(SanPham o1, SanPham o2) {
			            	return Double.compare(o1.getDonGia(), o2.getDonGia());
			            }
			        });
					Collections.reverse(list);
					System.out.println("\nDanh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
					for (SanPham sp : list) {
			            sp.xuat();
			        }
					break;
				case 3:
					System.out.print("\nNhập tên sản phẩm cần xóa: ");
					String tenSp = scanner.next();
					Iterator<SanPham> iterator = list.iterator();
			        while (iterator.hasNext()) {
			            SanPham sp = iterator.next();
			            if (sp.getTenSp().equals(tenSp)) {
			                iterator.remove();
			                break;
			            }
			        }
					break;
				case 4:
					double tongGia = 0;
			        for (SanPham sp : list) {
			            tongGia += sp.getDonGia();
			        }
			        double giaTrungBinh = tongGia/list.size();
			        System.out.println("\nGiá trung bình của các sản phẩm: " + giaTrungBinh);
					break;
				default:
					break;
			}
		}while(key != 5);
	}
}
