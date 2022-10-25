package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		
		String s = "홍길동";
		
		//s.charAt(0);
		
		//길 문자를 찾으면 위치반환, 못찾으면 -1반환
		int index = s.indexOf("길");
		System.out.println("길 시작위치:"+ index);
		
		//replace는 char형string형 도 가능함
		//s = s.replace("길","");
		String result = s.replace("길", "");
		System.out.println("replace 결과:"+result); //원본값은 안바뀜
		System.out.println("원본문자열:"+s);
		
		String s2 = "오늘은 날씨가 추워요";
		String result2 = s2.substring(2); //2번인덱스 앞에 자름
		System.out.println(result2);
		
		String result3 = s2.substring(6); //6미만 추춘
		System.out.println(result3);
		
		String result4 = s2.substring(4,7);
		System.out.println(result4); // 4이상 7미만 추출
		
		//trim 
		System.out.println("   홍길동".trim());
		
		//split 1. = 문자열 자르기
		String[] result5 =s2.split(" ");
		System.out.println(Arrays.toString(result5)); //문자열 잘라줌
		//spllit 2. 매개변수 2개주면 배열의 크기제한
		String[] result6 = "010-1234-3456".split("-",2);
		System.out.println(Arrays.toString(result6));
		
		//contains 문자열 포함여부
		if(s.contains("홍")) {
			System.out.println("홍이 포함됨");
		//복사해서 문자 합쳐줌	
		String result7 = String.copyValueOf(new char[] {'a','b','c'});
			System.out.println(result7);
			
		String result8 = String.valueOf(3);
		System.out.println("문자열바뀐결과:"+result8);
		}
	}
}
