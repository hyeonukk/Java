package day02;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {

		// 정수를 입력받는다.
		// 입력받은 정수까지의 합

		Scanner scan = new Scanner(System.in);

		System.out.println("정수>");
		int num = scan.nextInt();

		int sum = 0;
		int i = 1;
		while(i <= num) {

			sum +=i;
			i++;
		}
		System.out.println(num+"까지합 : "+ sum);
	}
}
