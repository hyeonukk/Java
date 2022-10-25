package api.lang.object;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("홍길동");
		
		System.out.println(p.toString());
		
		//String result = p.toString(); //위에 System.out.println(p.toString());랑 같음
		//System.out.println(result);
	
		//equals()
		Person p2 = new Person("홍길동");
		System.out.println(p.equals(p2)); //p랑 p2랑 달라서 false
	
		//clone() - clone은 개체를 복사해주는거
		try {
			Object obj = p.clone();
			Person p3 = (Person)obj;
			
			System.out.println("복사된객체의name:"+ p3.getName());
			System.out.println(p3==p);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
