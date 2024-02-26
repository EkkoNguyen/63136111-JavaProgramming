package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab6Bai3 {

	public static void main(String[] args) {
		ArrayList<SinhVien> ds = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 2;) {
			System.out.println("Nhập thông tin sinh viên thứ " + ++i);
			System.out.print("Họ và tên: ");
			String hoten = scanner.nextLine();
			
			System.out.print("Địa chỉ email: ");
			String email = scanner.nextLine();
			while (!checkEmail(email)) {
				System.out.print("Nhập lại email: ");
				email = scanner.nextLine();
			}
			
			System.out.print("Nhập số điện thoại: ");
			String sdt = scanner.nextLine();
			while (!checkSdt(sdt)) {
				System.out.print("Nhập lại số điện thoại: ");
				sdt = scanner.nextLine();
			}
			
			System.out.print("Nhập CMND: ");
			String cmnd = scanner.nextLine();
			while (!checkCmnd(cmnd)) {
				System.out.print("Nhập lại CMND: ");
				cmnd = scanner.nextLine();
			}
			
			SinhVien sv = new SinhVien(hoten, email, sdt, cmnd);
			ds.add(sv);
		}
		
		System.out.println("Danh sách sinh viên vừa nhập: ");
		for (SinhVien i : ds) {
			System.out.println(i);
		}
	}
	
	public static boolean checkCmnd(String cmnd) {
		String pattern = "[0-9]{9}";
		if (cmnd.matches(pattern)) return true;
		return false;
	}
	
	public static boolean checkSdt(String sdt) {
		String pattern = "0\\d{9,10}";
		if (sdt.matches(pattern)) return true;
		return false;
	}
	
	public static boolean checkEmail(String email) {
		String pattern = "\\w+@\\w+(\\.\\w+){1,2}";
		if (email.matches(pattern)) return true;
		return false;
	}

}

class SinhVien {
	String hoten;
	String email;
	String sdt;
	String cmnd;
	public SinhVien(String hoten, String email, String sdt, String cmnd) {
		this.hoten = hoten;
		this.email = email;
		this.sdt = sdt;
		this.cmnd = cmnd;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	
	@Override
	public String toString() {
		return hoten + " " + email + " " + sdt + " " + cmnd;
	}
}
