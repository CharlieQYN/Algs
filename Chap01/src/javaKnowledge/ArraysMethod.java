package javaKnowledge;


public class ArraysMethod {
	
	public static double maxNumber(double[] a) {
		double max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) max = a[i];
		}
		return max;
		
	}
	
	public static double average(double[] a) {
		int N = a.length;
		double sum = 0.0;
		for(int i = 0; i < N; i++) {
			sum += a[i];
		}
		return sum / N;
	}
	
	
	public static void main(String[] args) {
		double[] arr = {2, 3, 17, 65, 113, 45, 32, 12, 46, 78, 99, 11, 4};
		double maxInArray = maxNumber(arr);
		System.out.println(maxInArray);
		System.out.println("----------------------");
		
		double averageOfArray = average(arr);
		System.out.println(averageOfArray);
		System.out.println("----------------------");
		
		
	}
	
}
