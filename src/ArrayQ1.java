/*
 * 1. Check if Pair with the Given Sum Exists in Array
 • Problem: Given an array of integers and a target sum, find if
	there is a pair of elements that add up to the target sum.
 • Example:
 • Input: array = [1, 4, 5, 6, 8], target = 9
 • Output: True
 • Explanation: The pair (4, 5) adds up to the target sum of
 */


public class ArrayQ1 {
	boolean targetSum(int[] arr, int key) {
		
		int sum ;
		for (int i = 0; i < arr.length; i++)
		{
			sum=0;
			for (int j = i+1; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				if (sum==key) {
					return true;
				}
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
		int[] input = {1, 4, 5, 6, 8};
		int key = 9;
		ArrayQ1 arrayQ1 = new ArrayQ1();
		System.out.println(arrayQ1.targetSum(input, key));
	}
}
