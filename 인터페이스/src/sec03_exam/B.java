package sec03_exam;

public class B implements I {
	// 인터페이스만 바라보고, 선언되어있는 메서드를 오버라이딩 하고 있다
	public void methodB() {
		System.out.println("인터페이스를 통한 MethodB() 호출");
	}
}
