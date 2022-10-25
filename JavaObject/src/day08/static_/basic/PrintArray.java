package day08.static_.basic;

import java.util.Arrays;

public class PrintArray {
	
	private PrintArray() {} //  private 라서 객체생성불가

	public static String toArray(int[] arr) {

		String str ="["; 

		for(int i = 0; i<arr.length; i++) {
			str += arr[i] ;
			if(i== arr.length-1) {  // -1 은 배열의 마지막값을 의미
				str += "]";
				break;
			}
			str += "," ;
		}

		return str;
	}

	public static String toArray(char[] arr) {
		String str ="["; 

		for(int i = 0; i<arr.length; i++) {
			str += arr[i] ;
			if(i== arr.length-1) { 
				str += "]";
				break;
			}
			str += "," ;
		}
		return str;
	}

	public static String toArray(String[] arr) {
		String str ="["; 

		for(int i = 0; i<arr.length; i++) {
			str += arr[i] ;
			if(i== arr.length-1) { 
				str += "]";
				break;
			}
			str += "," ;
		}
		return str;
	}
}
