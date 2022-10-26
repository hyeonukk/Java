package gmail.bccsky2.stack;

import java.util.Date;

//여러 개의 값을 묶어서 표현하기 위한 클래스 - Value Object(VO)
//getter 와 constructor 는 만들지만 setter는 만들지 않는 경우가 많음
public class PersonVO {

	//번호, 이름, 생일, 전화번호를 저장
	private long num;
	private String name;
	private Date birthday;
	private String phone;
	//매개변수가 없는 생성자 - (default constructor) 이라고함
	//NoArgsConstructor 이라고도 함
	public PersonVO() {
		super();
	}
	//AllArgsConstructor이라고함
	public PersonVO(long num, String name, Date birthday, String phone) {
		super();
		this.num = num;
		this.name = name;
		this.birthday = birthday;
		this.phone = phone;
	}
	//Getter VO클래스는 서버를 읽을 목적으로만 사용되기때문에 Getter만 사용한다.
	
	public long getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public String getPhone() {
		return phone;
	}
	//값을 빠르게 확인하기 위한 메서드
	//디버깅을 위한 메서드 - 개발 과정 중 값을 확인하기 위한 목적
	@Override
	public String toString() {
		return "PersonVO [num=" + num + ", name=" + name + ", birthday=" + birthday + ", phone=" + phone + "]";
	}
	
	
}
