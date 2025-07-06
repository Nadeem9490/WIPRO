package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = removeTens(nums);

        System.out.println("Modified array: " + Arrays.toString(result));

        sc.close();
    }

    public static int[] removeTens(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 10) {
                result[index++] = num;
            }
        }

        return result;
    }
}
