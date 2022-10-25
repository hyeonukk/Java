package day04;

import java.util.Arrays;

public class MethodEx04 {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};

		String[] arr1 = {"월", "화", "수" } ;

		method01(arr); //매개변수 안에 변수명 or 생성구문을 적어야함. 
		method02(arr, arr1);
		int[] arr3 = method03();
	}

	//정수배열을 매개변수로 받는 매서드
	static void method01(int[] a) { //배열을 매개변수로 받을때 int[]a 선언 하면됨  

		//a를 이용해서 배열값의 사용가능. 
		System.out.println(Arrays.toString(a));
	}

	//정수배열과, 문자열 배열을 매개변수로 받는 매서드
	static int method02(int[] arr, String[] arr1) {
		for(int a: arr) {// a값에 arr배열넣기  
			System.out.println(a);
		}

		return 0;
	}
	//배열을 반환하는 매서드
	static int[] method03() {

		int[] arr = new int[5];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2; 
		arr[3]=3;
		arr[4]=4;

		return arr ;  //null값에 int[]배열 값을 넣으면됨(무엇을 넣을지 모를때 일단 null값 넣어두고 수정 )
	}
	

}