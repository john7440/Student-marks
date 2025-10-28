package fr.ex.array;

import java.util.List;

public class Notes {

	public static void main(String[] args) {
		
		
	}
	// A method to find the minimum value in an array
	public static int getMinValue(List<Integer> numbers) {
		int minValue = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) < minValue) {
				minValue = numbers.get(i);
			}
		}
		return minValue;
	}
	
	// A method to find the maximum value in an array
	public static int getMaxValue(List<Integer> numbers) {
		int maxValue = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) > maxValue) {
				maxValue = numbers.get(i);
			}
		}
		return maxValue;
	}
	
	// A method to find the average value in an array
	public static double getAverage(List<Integer> numbers) {
		int totalSum = 0;
		for (int num : numbers) {
			totalSum += num;
		}
		return numbers.isEmpty() ? 0 : (double) totalSum / numbers.size();
	}
	

}
