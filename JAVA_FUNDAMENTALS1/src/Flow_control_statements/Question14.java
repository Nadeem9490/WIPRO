package Flow_control_statements;
import java.util.*;
public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int num = n; num > 0; num = num / 10) {
            int digit = num % 10;
            sum += digit;
        }
        System.out.println("Sum of the digits is : " + sum);
        sc.close();
    }
}