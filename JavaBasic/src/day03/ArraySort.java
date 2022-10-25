package day03;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		//정렬 -> 선택정렬, 퀵정렬 

		int[] arr = {5, 23, 1, 43, 100, 200, 40};

		/*	for (int i =0; i<arr.length-1; i++) {

			for(int j = i +1; j<arr.length; j++) {
				if(arr[i] >arr[j] ) { //오름 차순, 내림차순 부등호 바꿔주는곳 
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));


		int x = 10;
		int y = 20; 
		int temp = x;
		x=y;
		y=temp;
		 */
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
