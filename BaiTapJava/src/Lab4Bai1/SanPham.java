package Lab4Bai1;

public class SanPham {
    private String ten;
    private double gia;
    private double giamGia;

    public SanPham(String ten, double gia, double giamGia) {
        this.ten = ten;
        this.gia = gia;
        this.giamGia = giamGia;
    }
    
    public double tinhThueNhapKhau() {
        return 0.1 * gia;
    }
    
    public void xuatThongTin() {
        double thueNhapKhau = tinhThueNhapKhau();
        System.out.println("Tên sản phẩm: " + ten);
        System.out.println("Đơn giá: " + gia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + thueNhapKhau);
    }
}

