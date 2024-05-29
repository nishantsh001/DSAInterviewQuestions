/*
 * 2. Best Time to Buy and Sell Stock
 • Problem: Given an array of prices where each element
  represents the stock price on a given day, find the maximum
  profit you can make by buying and selling the stock only once.
 • Example:
 • Input: prices = [7, 1, 5, 3, 6, 4]
 • Output: 5
 • Explanation: Buy on day 2 (price 1) and sell on day 5
 (price 6), profit = 6 - 1 = 5.
*/


public class ArrayQ2 {
	void buyAndSell(int[] arr) {
		int diff = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(diff<(arr[j]-arr[i])) {
					diff = arr[j]-arr[i];
				}
			}
		}
		System.out.println(diff);
	}

	public static void main(String[] args) {
		int[] arr = {7, 1, 5, 3, 6, 4};
		ArrayQ2 arrayQ2 = new ArrayQ2();
		arrayQ2.buyAndSell(arr);
	}
}
