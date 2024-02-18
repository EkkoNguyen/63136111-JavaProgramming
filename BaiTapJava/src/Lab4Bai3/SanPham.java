package Lab4Bai3;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }
    
    public SanPham() {
    	this.tenSp = "";
        this.donGia = 0;
        this.giamGia = 0;
	}

	public double tinhThueNhapKhau() {
        return 0.1 * donGia;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        this.tenSp = scanner.nextLine();

        System.out.print("Nhập đơn giá: ");
        this.donGia = scanner.nextDouble();

        System.out.print("Nhập giảm giá: ");
        this.giamGia = scanner.nextDouble();
    }
    
    public void xuat() {
        double thueNhapKhau = tinhThueNhapKhau();
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + thueNhapKhau);
    }

}


