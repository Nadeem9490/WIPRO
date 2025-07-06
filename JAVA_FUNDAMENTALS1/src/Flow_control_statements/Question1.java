package Flow_control_statements;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a=sc.nextInt();
		System.out.print("Enter the second number : ");
		int b=sc.nextInt();
		check(a);
		scan(a,b);
		sc.close();
	}
	static void check(int a) {
		if(a==0) {
			System.out.println("Zero");
		}
		else if(a>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
	}
	static void scan(int a,int b) {
		if(a%10==b%10) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}