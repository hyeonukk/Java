package day03;

import java.util.Arrays;

public class StringMainpulation {

	public static void main(String[] args) {

		//문자열 다루기 , string은 문자열(배열)형식임

		//String str = new String(new char[] {'A', 'B', 'C'});

		//System.out.println(str);

		String str = "안녕하세요~" ; 
		//문자열의 길이 확인 str.(. 찍기)
		System.out.println(str.length() );

		int len = str.length();          // length() : int   :int에 저장할 수있다
		System.out.println(len);

		// 문자열을 한글자 자르기
		char c =str.charAt(5);   // charAt뒤에 인덱스 넣는다.
		System.out.println(c);   // c에 저장할 수있다.
		
		

		//문자열의 위치 확인 indexof, lastIndexof //찾는 문자의 위치를 확인시켜준다.

		int a = str.indexOf("녕");// 앞에서부터 찾음
		System.out.println("찾은위치 :"+ a); 

		int b = str.lastIndexOf("녕"); //뒤에서 부터찾음
		System.out.println("찾은위치 :"+ b);

		int d = str.indexOf("sdf");
		System.out.println("찾는문자가 없다면:"+d); //-1

		// 문자열 변경 - replace
		//str.replace("찾을문자", "변경할 문자")
		String e = 	str.replace("안", "헐");  // 안 -> 헐로 전부다 바꿈 ,원본문자는 바뀌지 않고 replace 붙는 문자만 바뀐다. 
		System.out.println(e);
		
		//대소문자 변경 toUpperCase, toLowerCase
		str = "abcDeFg";
		String f = str.toUpperCase();  // 대문자로 변경 but 원본은 유지
		System.out.println(f);
		
		str = "ABDCdcvd";
		String g = str.toLowerCase();	// 소문자로 변경 but 원본은 유지
		System.out.println(g);
		
		
		// 공백제거  trim or replace
		str = " 010-1234-5678  " ; // 공백을 제거한다 but 원본은 유지
		String h = str.trim();
		System.out.println(h);
		
		str = " 안 녕 하 세 요 개 천 절 날 은 쉽니다";
		String i = str.replace(" ","");    	//replace를 이용해서 공백을 바꿔준
		System.out.println(i);
		
		// String.value() - > 기본타입을 문자로 변경
		System.out.println(String.valueOf(10)+20);
		
		//문자열 자르기 ★★★★★
		// substring : 인덱스기준으로 자름  
		str = "010-1234-5678" ;
		String j = str.substring(3); // 3미만 자름
		System.out.println(j);
		
		String k = str.substring(3,5); // 인덱스 이상 ~ 인덱스 미만 추출
		System.out.println(k);
		
		// split //특정문자 기준으로 잘라서 배열로 담아줌
		String[] arr =str.split(" "); // <- 공백을 기준으로 잘라서 담아준다
		System.out.println(Arrays.toString(arr));
		
		// toCharArray
		char[] arr1 = str.toCharArray(); // 한글자씩 잘라서 char에 담아줌
		System.out.println(Arrays.toString(arr1));
				
				
	}
}
