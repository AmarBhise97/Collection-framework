package uss.com;

import java.util.Arrays;
import java.util.Scanner;

class Subclass{
	public static Scanner sc =new Scanner(System.in);
	public static void main(String[]args) {
		int arr[][]=new int[4][5] ;//{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.println("Enter value");
				arr[i][j]=sc.nextInt();
				
				}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				if(i==0||j==0||i==arr.length-1||j==arr[i].length-1) {
					System.out.print(arr[i][j]+" ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
			
		
				
		
	
	}
	public static void main6(String[]args) {
		int arr[]=new int[4] ;
		
		for(int i =0;i<arr.length;i++) {
			System.out.println("Enter value");
			 arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main5(String[]args) {
		int arr[]=new int[] {2,8,8,9,7,4,8,8};
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}	
	public static void main4(String[]args) {
		int arr[]=new int[] {2,8,8,9,7,4,8,8};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==8) {
				count++;
				
			}
			
		}
		System.out.println(count);
	}
	public static void main3(String[]args) {
		int arr[]=new int[] {2,5,8,9,7,4,6,8};
		int min=arr[0];
		int max=arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println(min);
		System.out.println(max);
	}
	public static void main2(String[]args) {
		int arr[]=new int[] {2,5,8,9,7,4,6,8};
		int first=arr[0];
		int last=arr[arr.length-1];
		System.out.println(first);
		System.out.println(last);
	}
	public static void main1(String[]args) {
		int arr[]=new int[] {2,5,8,9,7,4,6,8};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		double average=(double)sum/arr.length;
		
		System.out.println(average);
		System.out.println(sum);
	}
	public static void main0(String[]args) {
	int arr[]=new int[] {2,5,8,9,4,6,8};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
 }
	


}