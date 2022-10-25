package api.lang.sb;

public class StrBufferEx {

	public static void main(String[] args) {
	
		String str = new String("JAVA"); 
		
		StringBuffer sb = new StringBuffer("JAVA");
		
		System.out.println(str);
		System.out.println(sb);

		str = str +"program"; //문자열
		sb.append("program"); // 버퍼클래스
		
		System.out.println(str);
		System.out.println(sb);
		//기존 문자열 마지막에 추가
		sb.append("기존 문자열 마지막에 추가");
		System.out.println(sb);
		
		//중간에 추가
		sb.insert(11, "-");
		System.out.println(sb);
		
		//문자열 변경
		sb.replace(0, 4, "자바");
		System.out.println(sb);
		//문자열 삭제
		sb.delete(0, 2);
		System.out.println(sb);
	
		//문자열로 형변환
		String result = sb.toString();
		
		//문자열 뒤집기
		sb.reverse();
		System.out.println(sb);
		
		
		
	}
}
