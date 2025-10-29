package fr.ex.array;

import java.util.List;

public class Notes {
	// This class is used to store methods that will helps us
	// to find find any minimum , maximum or average in a List (here for marks of students)

	public static void main(String[] args) {
		
	}
	// A method to find the minimum value in a List
	public static int getMinValue(List<Integer> numbers) {
		int minValue = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) < minValue) {
				minValue = numbers.get(i);
			}
		}
		return minValue;
	}
	
	// A method to find the maximum value in a List
	public static int getMaxValue(List<Integer> numbers) {
		int maxValue = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) > maxValue) {
				maxValue = numbers.get(i);
			}
		}
		return maxValue;
	}
	
	// A method to find the average value in a List
	public static double getAverage(List<Integer> numbers) {
		int totalSum = 0;
		for (int num : numbers) {
			totalSum += num;
		}
		return numbers.isEmpty() ? 0 : (double) totalSum / numbers.size();
	}
	
}
