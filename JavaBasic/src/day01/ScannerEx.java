package day01;
import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
	
		//1. 스캐너 생성 
		Scanner scan = new Scanner(System.in);
		
		scan.next(); // console에 입력하면 -<<여기에 값이 들어옴
		
		System.out.print("이름>");
		String name = scan.next(); // 문자열을 입력받고 name변수에 저장. 
		
		System.out.println("나이>");
		int age = scan.nextInt(); // 정수를 입력받고 출력
		
		System.out.println("입력된이름:"+ name);
		System.out.println("입력된나이:"+ age);
		
		scan.close(); // 스케너 종료 ( 닫으면 새로 생성해야함)
	}
}
