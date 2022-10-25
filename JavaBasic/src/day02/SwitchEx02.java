package day02;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		// IFEX02와 동일하게 실행되도록
		//switch구문으로 변경
		// point/10으로 하기
		// 없는값(변수를 밖에서 선언 후 안에서 이용)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수");
		int point = scan.nextInt();
		point =point /10;
		
		String grade = null;
		switch(point/10) {
		
		case 9 : //90~99
			if(point >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
			break;
		case 8 ://80~89
			grade = "B";
			break;
		case 7 : //70~79
			grade = "C";
			break;
		case 6 : // 60~69
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		
	}
		System.out.println(grade);
}
}