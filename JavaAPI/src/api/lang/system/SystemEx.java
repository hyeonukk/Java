package api.lang.system;

public class SystemEx {

	public static void main(String[] args) {
		
		//System클래스는 객체생성이 안됨.
		//System.currentTimeMillis(); 
		//1970/1/1이후 현재까지의 지나온 시간을 밀리초로 보여준다.
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		long sum = 0;
		for(long i =1; i<=1000000000L; i++) {
			sum +=i;
		}
		
		long end = System.currentTimeMillis();
		//System.out.println(end);
		System.out.println((end - start)* 0.001+"초 소요됨");
	}
	

}
