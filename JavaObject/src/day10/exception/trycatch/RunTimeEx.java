package day10.exception.trycatch;

public class RunTimeEx {

	public static void main(String[] args) {
		
		//실행예외(RunTime) 
		String s= null;
		
		if(s != null) {
			
			s.charAt(0);
		}
	
		String d = "홍길동";
		Integer.parseInt(d);
		
	}
}
