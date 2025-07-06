package Arrays;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Largest 2 numbers are : "+arr[n-2]+" and "+arr[n-1]);
		System.out.println("Smallest 2 numbers are : "+arr[0]+" and "+arr[1]);
		sc.close();
	}

}