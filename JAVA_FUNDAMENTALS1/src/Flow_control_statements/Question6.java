package Flow_control_statements;
import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter gender : ");
		String gender=sc.nextLine();
		System.out.print("Enter age : ");
		int age=sc.nextInt();
		if(gender.equalsIgnoreCase("Female")  && age>1 && age<58) {
			System.out.println("Percentage of interest is 8.2%");
		}
		else if(gender.equalsIgnoreCase("Female")  && age>59 && age<100) {
			System.out.println("Percentage of interest is 9.2%");
		}
		else if(gender.equalsIgnoreCase("Male")  && age>1 && age<58) {
			System.out.println("Percentage of interest is 8.4%");
		}
		else if(gender.equalsIgnoreCase("Male")  && age>59 && age<100) {
			System.out.println("Percentage of interest is 10.5%");
		}
		sc.close();
	}
}