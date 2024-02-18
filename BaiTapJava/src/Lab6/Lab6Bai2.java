package Lab6;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab6Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<SanPham> list = new ArrayList<>();
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
		System.out.println("\nThông tin các sản phẩm có hãng là 'Nokia':");
        for (SanPham sp : list) {
            if (sp.getHang().equalsIgnoreCase("Nokia")) {
                sp.xuat();
            }
        }
	}
	
}

class SanPham{
	private String tenSp;
	private double donGia;
	private String hang;

    public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public String getHang() {
		return hang;
	}

	public void setHang(String hang) {
		this.hang = hang;
	}

	public SanPham(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }
    
    public SanPham() {
    	this.tenSp = "";
        this.donGia = 0;
        this.hang = "";
	}
    
    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        this.tenSp = scanner.nextLine();

        System.out.print("Nhập đơn giá: ");
        this.donGia = scanner.nextDouble();

        System.out.print("Nhập hãng: ");
        this.hang = scanner.next();
       
    }
    
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + hang);
    }
}
