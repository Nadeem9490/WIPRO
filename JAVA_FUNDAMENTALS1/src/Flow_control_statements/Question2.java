package Flow_control_statements;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.print("odd");
		}
		sc.close();
	}

}