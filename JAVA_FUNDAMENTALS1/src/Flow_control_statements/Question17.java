package Flow_control_statements;
import java.util.*;
public class Question17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		String s="";
		int num=n;
		while(num>0) {
			int temp=num%10;
			num=num/10;
			s+=temp;
		}
		if(s.equals(String.valueOf(n))) {
			System.out.println(n+" is a palindrome");
		}
		else {
			System.out.println(n+" is not a palindrome");
		}
		sc.close();
	}

}