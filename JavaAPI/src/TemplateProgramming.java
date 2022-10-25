//로직은 같은데 매개변수의 자료형이 달라서 overloading을 이용해서 구현한 클래스
/*class Algorithm{
	//정수 2개를 더해서 결과를 리턴하는 메서드

	public static int add(int n1, int n2) {
		return n1+n2;
	}

	public static double add(double n1, double n2) {
		return n1+n2;
} */

//자료형의 이름을 임시로 만들어두고 내부에서 임시로 만든 자료형을 사용한 후 
//인스턴스를 생성할때 자료형을 결정하는 방식을 이용
//단 인스턴스를 만들 때 또는 메서드를 호출할때 실제 자료형을 기재해야 합니다
// 이때 사용되는 자료형은 object로 부터 상속받은 클래스의 자료형만 가능합니다
// int와 primitive type의 경우는 integer와 같은 wrapper 클래스를 이용해야 합니다.
//미지정 자료형의 개수는 제한이 없습니다
// 인스턴스를 만들때 자료형을 설정하지 않으면 경고가 발생합니다.
class Algorithm<T>{
	//2개의 데이터를 받아서 내용을 변경하는 메서드 
	public void swap(T n1, T n2) {
		T imsi = n1;
		n1 = n2;
		n2 = imsi;
	}
}
public class TemplateProgramming {

	public static void main(String[] args) {
		//제너릭이 적용된 클래스의 인스턴스를 만들 때는 자료형을 기재해야합니다.
		//자료형을 기재하지 않으면 경고가 발생하고 object 타입으로 간주합니다.
		Algorithm<Integer> algorithm = new Algorithm<>();
		Integer n1 = 20;
		Integer n2 = 30;
		algorithm.swap(n1, n2);
		System.out.println(n1);
		System.out.println(n2);
	}
}
