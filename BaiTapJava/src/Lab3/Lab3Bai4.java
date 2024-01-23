package Lab3;

import java.util.Scanner;

public class Lab3Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        String[] ten = new String[n];
        double[] diem = new double[n];

        for (int i = 0; i < n; i++) {
        	scanner.nextLine();
            System.out.print("Nhập họ tên sinh viên thứ " + (i + 1) + ": ");
            ten[i] = scanner.nextLine();
            System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
            diem[i] = scanner.nextDouble();
        }

        System.out.println("Danh sách sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Họ tên: %s\n", ten[i]);
            System.out.printf("Điểm: %f\n", diem[i]);
            if (diem[i] < 5) {
            	System.out.println("Học lực yếu" );
            } else if (diem[i] < 6.5) {
            	System.out.println("Học lực trung bình" );
            } else if (diem[i] < 7.5) {
            	System.out.println("Học lực khá" );
            } else if (diem[i] < 9) {
            	System.out.println("Học lực giỏi" );
            } else {
            	System.out.println("Học lực xuất sắc" );
            }
            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    double ganDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = ganDiem;

                    String ganTen = ten[i];
                    ten[i] = ten[j];
                    ten[j] = ganTen;
                }
            }
        }

        System.out.println("Danh sách sinh viên sau khi sắp xếp tăng dần theo điểm:");
        for (int i = 0; i < n; i++) {
        	System.out.printf("Họ tên: %s\n", ten[i]);
            System.out.printf("Điểm: %f\n", diem[i]);
            if (diem[i] < 5) {
            	System.out.println("Học lực yếu" );
            } else if (diem[i] < 6.5) {
            	System.out.println("Học lực trung bình" );
            } else if (diem[i] < 7.5) {
            	System.out.println("Học lực khá" );
            } else if (diem[i] < 9) {
            	System.out.println("Học lực giỏi" );
            } else {
            	System.out.println("Học lực xuất sắc" );
            }
            System.out.println();
        }
    }
}
