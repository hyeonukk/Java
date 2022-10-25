package day02;

import java.util.Scanner;

public class MultiForEx03 {
	public static void main(String[] args) {

		// 입력받은 수 까지 소수를 출력.
		//ex) 5입력 2,3,5
		// 입력받은 수가지 반복하고, 각 수를 자기자신까지 나누면서 약수의 개수가 2개 수 

		Scanner scan = new Scanner(System.in);

		System.out.println("정수>");
		int num = scan.nextInt();
		for(int i=1; i<=num; i++) {
			int count = 0;  // count 초기값 0을 반복문 안에 삽입
	
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}

				//System.out.println(i+"-"+j);	
			}
			if(count==2) {
				System.out.println(i);
			}
		}


	}
}
