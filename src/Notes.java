
public class Notes {

	public static void main(String[] args) {
		
		// Our data
		int[] StudentMark = {10, 12, 15, 20};

		int min = getMinValue(StudentMark);
		int max = getMaxValue(StudentMark);
		double average = getAverage(StudentMark);
		System.out.println(min);
		System.out.println(max);
		System.out.println(average);
		
;
	}
	// A method to find the minimum value in an array
	public static int getMinValue(int[] numbers) {
		int minValue = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < minValue) {
				minValue = numbers[i];
			}
		}
		return minValue;
	}
	
	// A method to find the maximum value in an array
	public static int getMaxValue(int[] numbers) {
		int maxValue = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
			}
		}
		return maxValue;
	}
	
	// A method to find the average value in an array
	public static double getAverage(int[] numbers) {
		int TotalSum = 0;
		int lenArray = numbers.length;
		for (int i =0; i < lenArray; i++) {
			TotalSum += numbers[i];
		}
		double average = (TotalSum / lenArray);
		return average;
	}
	

}
