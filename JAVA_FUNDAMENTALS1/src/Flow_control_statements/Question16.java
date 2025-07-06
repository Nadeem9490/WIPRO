package Flow_control_statements;
import java.util.*;
public class Question16 {
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
		System.out.println("Reversed number is : "+s);
		sc.close();
	}

}