package day04;

public class MethodEx01 {

	public static void main(String[] args) {
		
		// 메서드는 메서드 내부에 생성 할 수 없습니다.
		// main밖, 클래스 안 어디서든 선언 할 수있습니다.
		// 메서드의호출 - 이름 () 
		
		
		//System.out.println(calSum()); 호출하면 아래 메서드값 실행결과를 다시 반환해서 들어온다.
		int result = calSum();  // 정수값 result로 출력 가능 
		System.out.println(result);
		
		int result2 = calSum();
		System.out.println(result2); // 호출한 결과값 재사용 가능함. 
		
		String result3 = ranStr();
		System.out.println(result3);
		
		String result4 = ranStr2();
		System.out.println(result4);
	} // 메인 끝
	// 반환은 있고 매개값은 없는 유형 
	static int calSum() { 
		// 1~10까지 합
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum +=i;
		}
		
		return sum;
	}

	//반환은 있고 매개값은 없는 문자열의 결과 반환
	static String ranStr() {
		
		String str = ""; // A+B+C....Z
		for(char c ='A'; c <='Z'; c++) {
			str += c; //str값에 c 누적
			
		}
		
		return str; //string의 기본값 null ( 입력 할 수를 정하지 못하였을떄 )
		
	}

	//반환은 있고 매개값은 없는 return키워드의 활용
	static String ranStr2() {
		double d = Math.random();
		if(d> 0.66 ) {
			return "가위";
		}else if(d > 0.33) {
			return "바위";
		} else {
			return "보";  				//아래 위 둘다 같지만 다른 방식으로 풀이 한것. 
		}
	/*	
	String str;	
	if(d> 0.66 ) {
		str = "가위" ;
	}else if(d > 0.33) {
		str = "바위" ;
	} else {
		str = "보" ;
	}
	return str;
	*/
	}
}

