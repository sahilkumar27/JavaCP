package LeetCode150.Array_String;

import java.util.Scanner;

public class MergeSortedArray {

    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        while (i >= 0) {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from nums1 and nums2 sizes
        System.out.print("Enter the element in nums1 (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the element in nums2 (n): ");
        int n = scanner.nextInt();

        // Arrays
        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];


        // Input nums1 (only first m elements)
        System.out.println("Enter " + m + " sorted element of num1: ");
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }

        // Input nums2 (only second n element)
        System.out.println("Enter " + n + " sorted element of num2: ");
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }

        // Call the merge function
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.Merge(nums1, m, nums2, n);

        // Output result
        System.out.println("Merge Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
