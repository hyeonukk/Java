package day02;

public class EnhanceForEx {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};

		//일반 for
		//for( int i=0; i<arr.length; i++){
		//System.out.println(arr[i]);

		// 향상된 for
		for(int a :arr) { 
			System.out.println(a);	
		}
		System.out.println("------------------------------------------");
		String[] sarr = {"월", "화", "수", "목","금" , "금", "금",};
		for(String b: sarr) {
			System.out.println(b);
		}
		System.out.println("--------------------------------------");
		//배열 요소들의 합계와 평균을 소수 2자리 까지 출력
		int sum = 0;
		int[] score = {3, 34, 47, 67, 97};
		for(int c : score) {
		sum +=c;
		}
		System.out.println("배열의합 :"+sum);
	
		System.out.printf("평균:%.2f\n",+(double)sum/score.length);
		
		int[] arr1 = {1,2,3,4,5,6};
		
		for(int d: arr1) {
			System.out.println(d);
	}
	}
}

