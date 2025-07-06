package Flow_control_statements;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter character : ");
		char ch=sc.next().charAt(0);
		if(Character.isUpperCase(ch)) {
			System.out.println(ch+" -> "+Character.toLowerCase(ch));
		}
		else {
			System.out.println(ch+" -> "+Character.toUpperCase(ch));
		}
		sc.close();
	}
}