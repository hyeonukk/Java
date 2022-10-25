package day02;

import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {
		//입력받은 점수에 따라서 A, B, C, D, F로 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수>");
		int point = scan.nextInt();
		
		String grade = null; // 없는값(변수를 밖에서 선언 후 안에서 이용)
		
		if(point >=90) {
			if(point >=95) {
				grade = "A+";
			}
			 else { //90~94
				grade = "A";
			//조건검사를 또 하고싶을떄 if() {
			//} 넣을 수 있음
			 }
		}else if(point >=80) {
			grade ="B";
		}else if(point >=70) { 
			grade ="C";
		}else if(point >=60) {
			grade ="D";
		}else if(point >=50) {
			grade ="E";
		}else {
			grade ="F";
		}
		System.out.println(grade);
	}
}
