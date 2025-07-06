package Arrays;
import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter ASCII values : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print((char)arr[i]+" ");
		}
		sc.close();
	}

}