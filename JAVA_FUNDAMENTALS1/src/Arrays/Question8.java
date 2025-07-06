package Arrays;

import java.util.*;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.print("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		boolean skip = false;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 6) {
				skip = true;
				continue;
			}
			if (skip) {
				if (arr[i] == 7) {
					skip = false;
				}
				continue;
			}
			sum += arr[i];
		}

		System.out.println("Output: " + sum);
		sc.close();
	}
}