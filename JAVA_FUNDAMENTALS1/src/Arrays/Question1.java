package Arrays;
import java.util.*;
public class Question1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int sum=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		int avg=sum/n;
		System.out.println("sum of the elements in the array : "+sum);
		System.out.println("Average of the elements in the array : "+avg);
		sc.close();
	}

}