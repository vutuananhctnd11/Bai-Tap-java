package Buoi2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
			Scanner nhap = new Scanner(System.in);
			
			System.out.println("Nhập lần lượt 3 cạnh a, b, c: ");
			int a = nhap.nextInt();
			int b = nhap.nextInt();
			int c = nhap.nextInt();
			if (a+b>c && a+c>b && b+c>a) {
				System.out.print("3 cạnh vừa nhập tạo thành 1 tam giác");
				if (a*a+b*b==c*c || a*a+c*c==b*b ||b*b +c*c==a*a) {
					System.out.print(" vuông");
					if (a==b || a==c || b==c) {
						System.out.print(" cân");
					}
				}
				if (a==b && a==c && b==c) {
					System.out.print(" đều");
				}
				if (a==b || a==c || b==c) {
					if (a!=b || a!=c || b!=c) {
						System.out.print(" cân");
					}
				}
			} else System.out.println("3 cạnh vừa nhập KHÔNG tạo thành tam giác");
		}
}
