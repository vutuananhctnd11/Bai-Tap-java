package Buoi2;

import java.util.*;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập Ngày sinh: ");
		int a= nhap.nextInt();
		while (a<0 || a>31) {
			System.out.println("ngày sinh không hợp lệ! Nhập lại tháng sinh: ");
			a= nhap.nextInt();
		}
		System.out.println("Nhập Tháng sinh: ");
		int b= nhap.nextInt();
		while (b<0 || b>12) {
			System.out.println("tháng sinh không hợp lệ! Nhập lại tháng sinh: ");
			b= nhap.nextInt();
		}
		// Kiểm Tra điều kiện ngày tháng xem hợp lệ hay không
		switch (b) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
				if (a>31) {
					System.out.println("ngày sinh không hợp lệ! Nhập lại ngày sinh: ");
					a= nhap.nextInt();
				}
				break;
			}
			case 4: case 6: case 9: case 11:{
				if (a>30) {
					System.out.println("ngày sinh không hợp lệ! Nhập lại ngày sinh: ");
					a= nhap.nextInt();
				}
				break;
			}
			default:{
				if(a>29) {
					System.out.println("ngày sinh không hợp lệ! Nhập lại ngày sinh: ");
					a= nhap.nextInt();
				}
			}
		}
		System.out.println("Nhập năm sinh: ");
		int c= nhap.nextInt();
		// xét cung hoàng đạo theo tháng sinh
		if(b==1) {
			if (a<20) {
				System.out.println("Bạn là cung Ma Kết");
			} else System.out.println("Bạn là cung Bảo Bình");
		}
		if(b==2) {
			if (a<=18) {
				System.out.println("Bạn là cung Bảo Bình");
			} else System.out.println("Bạn là cung Song Ngư");
		}
		if(b==3) {
			if (a<=20) {
				System.out.println("Bạn là cung Song Ngư");
			} else System.out.println("Bạn là cung Bạch Dương");
		}
		if(b==4) {
			if (a<=20) {
				System.out.println("Bạn là cung Bạch Dương");
			} else System.out.println("Bạn là cung Kim Ngưu");
		}
		if(b==5) {
			if (a<=20) {
				System.out.println("Bạn là cung Kim Ngưu");
			} else System.out.println("Bạn là cung Song Tử");
		}
		if(b==6) {
			if (a<=21) {
				System.out.println("Bạn là cung Song Tử");
			} else System.out.println("Bạn là cung Cự Giải");
		}
		if(b==7) {
			if (a<=22) {
				System.out.println("Bạn là cung Cự Giải");
			} else System.out.println("Bạn là cung Sư Tử");
		}
		if(b==8) {
			if (a<=22) {
				System.out.println("Bạn là cung Sư Tử");
			} else System.out.println("Bạn là cung Xử Nữ");
		}
		if(b==9) {
			if (a<=22) {
				System.out.println("Bạn là cung Xử Nữ");
			} else System.out.println("Bạn là cung Thiên Bình");
		}
		if(b==10) {
			if (a<=23) {
				System.out.println("Bạn là cung Thiên Bình");
			} else System.out.println("Bạn là cung Bọ Cạp");
		}
		if(b==11) {
			if (a<=22) {
				System.out.println("Bạn là cung Bọ Cạp");
			} else System.out.println("Bạn là cung Nhân Mã");
		}
		if(b==12) {
			if (a<=21) {
				System.out.println("Bạn là cung Nhâm Mã");
			} else System.out.println("Bạn là cung Bảo Bình");
		}
	}

}
