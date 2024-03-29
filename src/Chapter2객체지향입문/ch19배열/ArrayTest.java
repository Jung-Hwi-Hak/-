package Chapter2객체지향입문.ch19배열;

public class ArrayTest {

	public static void main(String[] args) {
		
//		Type 1
		int[] arr = new int[10];
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++,num++) {
			arr[i] = num++;
		}
		
		for(int num : arr) {
			total += num;
		}
		
		System.out.println(total);
	
//		Type 2
		double[] dArr = new double[5];
		int count = 0;
		
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		
		double mtotal = 1;
		for(int i = 0; i < count; i++) {
			mtotal *= dArr[i];
			System.out.println(dArr[i]);
		}
		
		System.out.println(mtotal);
	}
}
