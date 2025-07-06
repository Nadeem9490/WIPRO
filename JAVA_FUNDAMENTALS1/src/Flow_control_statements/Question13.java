package Flow_control_statements;
public class Question13 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 10 and 99:");
        for (int n = 10; n <= 99; n++) {
            boolean isPrime = true;
            if (n <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(n);
            }
        }
    }
}