package day02;

public class WhileEx06 {

	public static void main(String[] args) {

		//배열과 반복문 
		//시작은 0~ 길이미만

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum= 0;
		int i = 0;
		while(i < arr.length) { //i<arr.length = 배열의 길이 미만을 의미함 
			//이하 일때는 arr.length-1 입력 { 
 // i< arr.length == i <= arr.length-1
			//System.out.println(i); 0....9
			//System.out.println(arr[i]); // 1~10 arr 배열값 그대로 나옴
			
			sum += arr[i];
			i++;
		}
	System.out.println("배열 요소의 합 :"+ sum);

	}
}
