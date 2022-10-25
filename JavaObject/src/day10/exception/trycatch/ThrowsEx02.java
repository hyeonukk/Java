package day10.exception.trycatch;

public class ThrowsEx02 {

	//생성자
	public ThrowsEx02() throws Exception {
		System.out.println("생성자호출");
		aaa();
		System.out.println("생성자종료");
	}
	
	public void aaa() throws Exception {
		System.out.println("aaa시작");
		bbb(1); 
		System.out.println("aaa종료");
	}
	
	public void bbb(int i) throws Exception {
	System.out.println("bbb시작");
//	try {
	//	
	//} catch (Exception e) {	}
	System.out.println(i / 0); //에외
		System.out.println("bbb종료");
	}
}
