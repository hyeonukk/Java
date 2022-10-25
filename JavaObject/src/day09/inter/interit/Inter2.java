package day09.inter.interit;

public interface Inter2 {

	void some03();
	default void some04() {
	// default는 몸체을 가질수 있는 메서드(몸체를 가져서 오버라이딩 없어도됨)
		System.out.println("디폴드 메서드");
	}
}
