package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		// next( 띄어쓰기 앞까지 적용hello 까지 nextLine()한 문장 hello world 까지 적용)
		//배열의 한계점 : 크기가 고정임, 
		//입력받은 문자열을 배열에 순서대로 저장.
		
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[100];
		
		int count = 0; //인덱스를 나타내는 변수
		//"그만" 문자가 들어오기 전까지 입력.
		while(true) {
			 System.out.println(">");
			 String menu=scan.nextLine();
			 if(menu.equals("그만")) {  //문자 ==는 ex.equals("그만") equals를 써줘야함 
				 break;
			 }
			 
			 arr[count] = menu; //count에 menu값 저장
			 count++; // 인덱스 증가 
		}
		//출력도 반복문을 사용해야함 
		String str = "[";
		
		for(int i=0; i<count; i++) {
			str += arr[i];
			if(i == count-1) {
				str += "]";
				break;
			}
			str += ", ";
		}
		System.out.println(str);
	}
}