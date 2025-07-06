package Arrays;
import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}