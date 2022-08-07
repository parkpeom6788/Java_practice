package sec03_exam;

public class A {
	
	// 클래스 B가 완성되지 않아도 선언부 즉 인터페이스에 있는 추상메서드인
	// 선언부만 알고 있으면 언제든지 호출이 가능하다 
	// 이것이 간적접관계인 것이다.
	public void methodA(I i) {
		i.methodB(); // 추상메서드만 알면 구현된 클래스의 메서드 호출 
	}
}
