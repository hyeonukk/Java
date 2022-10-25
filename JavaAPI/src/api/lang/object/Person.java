package api.lang.object;

public class Person /*extends Object*/ implements Cloneable {

	private String name;
	
	public Person(String name) {
		this.name = name;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//generate tostring : 오버라이딩 )사용법
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	//멤버변수명이 같으면 true반환
	@Override 
	public boolean equals(Object obj) {
	
		if(obj instanceof Person) {
		Person p = (Person)obj;
		String n = p.getName(); 
		if(n.equals(this.name)) {
			System.out.println("이름이 같음");
			return true;
		}
		}
		return false;
		
		//return super.equals(obj); // 부모님 메서드 호출
	
	}
	// clone메서드를 사용하고 싶다면 override 해야함

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
	
	


}

	