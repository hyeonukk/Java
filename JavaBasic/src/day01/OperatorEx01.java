package day01;

public class OperatorEx01 {
	public static void main(String[] args) {
		
		// 단항 연산자
		
		int i = -3;
		int j = -i;
		System.out.println(j);
		
		// ++, --
		
		int k = 1;
	
		k++;
		System.out.println(k); //2
		k--;
		k--;
		k--;
		
		System.out.println(k); //-1
		
		// 증감연산자는 a++, ++a 의미가 조금 다름.
		k = 1;
		int h = k++; // 대입 이후에 증가 
		System.out.println("k값:"+k);
		System.out.println("h값:"+h);
		
		k = 1;
		int g = ++k; // 먼저증가, 이후에 대입
		 
		
		System.out.println("k값:"+k);
		System.out.println("g값:"+g);
		
		k =1;
		System.out.println(k++);
		System.out.println(++k);
		
		System.out.println("-------------------------------");
		byte b = 10; // 0000 1010
		System.out.println(~b); // 1111 0101 
		System.out.println(~b+1); // 1111 0101 
		System.out.println("-------------------------------");
		
		System.out.println(!true); // false
		boolean bool = !false;
		System.out.println(bool); // true
	}
}
