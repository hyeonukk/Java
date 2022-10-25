package day01;
import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		//배열은 선언, 생성, 초기화 과정을 거칩니다.
		//1. 배열의 선언
		// 데이터 타입뒤에 []작성하면 배열 선언
		int[] arr; 
		
		//2. 배열의 생성
	arr= new int[5]; //arr에 배열 5개만드는 것.
	
//	byte[] arr2 = new byte[10]; (배열의 선언과 생성을 동시에 하는법)
	System.out.println(arr); // arr은 배열안의 주소값(배열의 위치)
	
		//3. 배열의 초기화
		//arr[인덱스] = 값 // 인덱스 위치에 값을 넣는다.
		arr[0]= 10; // 0상자에 10을 넣는다.
		arr[1]= 20;
		arr[2]= 30;
		arr[3]= 40;
		arr[4]= 50;
		//arr[5] = 60;  (arr [5]까지니깐 0,1,2,3,4 까지 작성 가능함)
		
		//4. 배열의 사용
		System.out.println("arr첫번째 상자:" + arr[0]); // 배열 출력 궁금할때 사용
		System.out.println("arr세번째 상자:" + arr[2]);
		
		//5. 배열의 모습을 문자열로 확인하는 명령문
		System.out.println(Arrays.toString(arr)); // 문자열 확인 명령문 외우기★★★★★★★★★★★
		
		//6. 배열의 길이를 확인하는 명령어 .length
		System.out.println("배열의 크기는:"+ arr.length); // 길이 5 ★★★★★★★★★★★★★★★★★
		
		//7. 배열의 선언과 생성을 동시에 하는법
		byte[] arr2 = new byte[10];
		System.out.println(Arrays.toString(arr2)); // 값을 지정하지 않으면 기본값 출력됨 (0,0.0, String의 기본값은 null) ★★★★★★★★★★★
		
		//8. 배열의 선언 생성 초기화를 동시에
		int[] arr3 = {1,2,3,4,5,6,7,8}; // 크기 8의 arr3 배열
		System.out.println(Arrays.toString(arr3)); //문자열 확인 명령문 외우기★★★★★★★★★★★
		
		System.out.println("------------------------------------------------------------");
		
		/*
		 * 1. String 배열을 생성하고 월, 화, 수 ,목 을 저장
		 * 2. 크기가 3인 int 배열 생성을 하고 1~10중 랜덤값을 저장
		 */
		String[] arr4 = new String[4];
		arr4[0]= "월";
		arr4[1]= "화";
		arr4[2]= "수";
		arr4[3]= "목";
		//String[] arr4 = {"월", "화", "수", "목"};
		System.out.println(Arrays.toString(arr4));
		
		int[] arr5 = new int[3];
		arr5[0]= (int)(Math.random()*10)+1  ;
		arr5[1]= (int)(Math.random()*10)+1  ;
		arr5[2]= (int)(Math.random()*10)+1  ;
		System.out.println(Arrays.toString(arr5));
		
		
		
		
		
	}
}
