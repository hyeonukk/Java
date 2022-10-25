package day02;

import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {

		//정수를 입력받고 입력한 정수가 소수인지 판별
		//소수 -> 나누어 떨어지는 수가 1과 자기 자신인수 
		//조건 약수의 개수가 2개인수
		Scanner scan = new Scanner(System.in);
		System.out.println("정수>");
		int num = scan.nextInt();
		int count =0;
		for(int i= 1; i<=num; i++)  {

			if(num % i ==0) { //약수 {
				count++; //나누어 떨어진다면 숫자를 하나씩 증가
			}				// 반복을 다 돌고나왔을때 count ==2라면 소수


		}
		System.out.println(count ==2? num +"은소수": num+"은 소수가 아님");
	}
}
