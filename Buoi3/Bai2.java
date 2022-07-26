package Buoi3;

import java.util.Locale;
import java.util.Scanner;

public class Bai2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập vào họ tên của bạn: ");
		String s = nhap.nextLine();
		//xóa dấu cách 2 đầu chuỗi
		s=s.trim();
		// xóa dấu cách thừa
		for (int i=0; i<s.length(); i++) {
			while (s.charAt(i)==' ' && s.charAt(i+1)==' ') {
				s=s.replace("  "," ");
			}
		}
		// xóa số
		for (int i=0; i<s.length(); i++) {
			while (s.charAt(i)>='0' && s.charAt(i)<='9') {
				s=s.substring(0, i)+s.substring(i+1, s.length());
			}
		}
//		//chuyển chuỗi về chữ thường
//		s=s.toLowerCase();
		// viết hoa đầu từ
			String [] s1=s.split(" ");
			s="";
			for (int i=0; i<s1.length; i++) {
				s += String.valueOf(s1[i].charAt(0)).toUpperCase() + s1[i].substring(1).toLowerCase() + " ";
			}
		System.out.println(s);

	}

}
