
//인터페이스
interface Starcraft{
	public void attack();
}

//인터페이스를 구현한 클래스를 생성
class Protoss implements Starcraft{

	@Override
	public void attack() {
		System.out.println("질럿의 공격");

	}
	
}
public class AnonymousMain {
	public static void main(String[] args) {
		//인터페이스를 implements 한 클래스를 만들고 인터페이스를 만든후 메서드 호출
		Protoss p = new Protoss(); //1. Starcraft star = new protoss();
		p.attack(); 			  // 2. star.attack();
		
		//인터페이스를 implements 한 클래스를 만들지 않고 인스턴스를 생성해서 호출
		Starcraft z = new Starcraft() {   //3.  star = new Starcraft(){
			@Override
			public void attack() {
				System.out.println("저그의 공격");
			}};
		z.attack();						//4. star.attack();
		//변수도 만들지 않고 인스턴스만 생성해서 메서드 호출
		new Starcraft() { //compartor 할떄 이방식으로 해도됨

			@Override
			public void attack() {
				System.out.println("테란의 공격");
			}
		}.attack();
	
	}
}
