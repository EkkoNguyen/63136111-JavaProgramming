package Lab4Bai2;

import java.util.Scanner;

public class SanPham {
    private String ten;
    private double gia;
    private double giamGia;

    public SanPham(String ten, double gia, double giamGia) {
        this.ten = ten;
        this.gia = gia;
        this.giamGia = giamGia;
    }
    
    public SanPham() {
    	this.ten = "";
        this.gia = 0;
        this.giamGia = 0;
	}

	public double tinhThueNhapKhau() {
        return 0.1 * gia;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        this.ten = scanner.nextLine();

        System.out.print("Nhập đơn giá: ");
        this.gia = scanner.nextDouble();

        System.out.print("Nhập giảm giá: ");
        this.giamGia = scanner.nextDouble();
    }
    
    public void xuat() {
        double thueNhapKhau = tinhThueNhapKhau();
        System.out.println("Tên sản phẩm: " + ten);
        System.out.println("Đơn giá: " + gia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + thueNhapKhau);
    }

}


