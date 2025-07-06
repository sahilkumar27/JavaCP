package LeetCode150.Array_String;

import java.util.Scanner;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of nums: ");
        int n = scanner.nextInt();

        // Arrays
        int [] nums = new int[n];

        // Input array elements
        System.out.println("Enter the element inside the array: " + n);
        for(int i=0; i<n; i++){
            nums[i] = scanner.nextInt();
        }

        // Value to Remove
        System.out.println("Enter the value to Remove: ");
        int val = scanner.nextInt();

        // Remove value
        RemoveElement remover = new RemoveElement();
        int ans = remover.removeElement(nums, val);

        System.out.print("Remove Element: ");
        for (int i=0; i< ans; i++){
            System.out.print(nums[i] + " ");
        }

        scanner.close();
    }
}
