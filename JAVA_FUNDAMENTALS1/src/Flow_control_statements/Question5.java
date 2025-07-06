package Flow_control_statements;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch=sc.next().charAt(0);
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println("Alphabhet");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
		sc.close();
	}

}