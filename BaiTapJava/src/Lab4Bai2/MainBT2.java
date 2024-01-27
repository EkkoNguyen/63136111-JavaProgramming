package Lab4Bai2;

public class MainBT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();

        System.out.println("Nhập thông tin cho sản phẩm:");
        sp1.nhap();

        System.out.println("Nhập thông tin cho sản phẩm:");
        sp2.nhap();

        System.out.println("\nThông tin sản phẩm:");
        sp1.xuat();

        System.out.println("\nThông tin sản phẩm:");
        sp2.xuat();
	}

}
