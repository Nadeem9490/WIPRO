package Arrays;

import java.util.*;

public class Question3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the number neeed to be searched : ");
		int a = sc.nextInt();
		int index=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==a) {
				index=i;
				System.out.println(index);
			}
		}
		if(index==-1) {
			System.out.println("-1");
			}
		sc.close();
	}

}