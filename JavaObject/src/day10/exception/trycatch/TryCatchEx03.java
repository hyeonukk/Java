package day10.exception.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {

	public static void main(String[] args) {

		//입력과 예외처리
		//0을 입력하기 전까지 숫자를 입력.

		Scanner scan = new Scanner(System.in);
		while(true) {

			try {
				System.out.println(">");
				int num  = Integer.parseInt(scan.nextLine()); //엔터값 포함해서 숫자,문자 둘다 정상적으로 받아짐
				//int num = scan.nextInt();
				if(num ==0) break;
				
			} catch (Exception e) {
			System.out.println("숫자로 입력하세요");
			scan.nextLine(); //엔터개행을 제거
			}
			

		}

	}
}
