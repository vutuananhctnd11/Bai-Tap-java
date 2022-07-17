package Buoi2;

import java.util.Scanner;

public class Bai3 {
		public static void main(String[] args) {
			
			Scanner nhap = new Scanner(System.in);
			
			System.out.println("Nhập n: ");
			int n = nhap.nextInt();
			int demUoc=0;
			for (int i=1; i<=n; i++) {
				if(n%i==0) {
					demUoc+=i;
				}
			}
			System.out.println("Tổng các ước của "+n+" là: "+demUoc);
		}
}
