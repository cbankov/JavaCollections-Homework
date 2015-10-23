import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert n = ");
        int n = scanner.nextInt();
        System.out.printf("Insert %d number of integers separataed by space = ", n);
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Arrays.sort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}