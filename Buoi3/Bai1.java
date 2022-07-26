package Buoi3;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.println("NHập số phần tử của mảng: ");
		int n = nhap.nextInt();
		int a[] = new int[n];
		for ( int i=0; i<n; i++) {
			System.out.print("a["+i+"]= ");
			a[i] = nhap.nextInt();
		}
		//tính trung bình cộng 
		float tbc=0;
		int dem=0;
		for (int i=1; i<n; i+=2) {
			if (a[i]%2!=0) {
				tbc+=a[i];
				dem++;
			}
		}
		if (dem==0) {
			System.out.println("Trong mảng không có số lẻ nào ở vị trí chẵn");
		} else {
			System.out.println("Trung bình cộng là: "+tbc/dem);
		}
		//tìm số nhỏ nhất
		int min=a[0];
		System.out.print("Vị trí các số nhỏ nhất là: ");
		for (int i=0; i<n; i++) {
			if(min>a[i]) {
				min=a[i];
				System.out.print(i+1+" ");
			}
			if (a[i]==min) {
				System.out.print(i+1+" ");
			}
		}
		//kiểm tra số chính phương
		System.out.print("\nCác số chính phương trong mảng là: ");
		dem=0;
		for (int i=0; i<n; i++) {
			for (int j=1; j<a[i]/2; j++) {
				if (j*j==a[i]) {
					System.out.print(a[i]+" ");
					dem++;
				}
			}
		}
		if (dem==0) System.out.println("Trong mảng không có số chính phương");
		//tìm số nguyên tố
		int check=0;
		System.out.print("\nCác số nguyên tố trong mảng là: ");
		for (int i=0; i<n; i++) {
			for (int j=2;j<=a[i]/2;j++) {
				if (a[i]%j==0) {
					check=1;
				}
			}
			if (check==0 && a[i]>1) System.out.print(a[i]+" ");
			else check=0;
		}
		// sắp xếp mảng
		for (int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("\nMảng sau khi sắp xếp là: ");
		for(int i: a) {
			System.out.print(i+" ");
		}
		
		
		
		
	}

}
