package day02;

public class BreakEx01 {
	public static void main(String[] args) {
		
		int i=1; 
		while(i <=10) {
			
			System.out.println(i);
			if(i == 5) {
				break;   // if(i==5) break; 한문장만 사용할때는 {}중괄호 생략가능. break 위치는 실행 한후에 넣는게 좋음. 
			}
			i++;
			
		}
		
		for(int a=1; a<=10; a++) {
			System.out.println(a);
			if(a ==5 ) 
				break;
			
		}
	}
}
