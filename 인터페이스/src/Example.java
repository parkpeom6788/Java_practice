
public class Example {
	public static void main(String[] args) {
		A a = new Person(); // 인터페이스 a = new 구현한클래스()
		Person person = new Person();
		Person person2 = (Person)a; // 다운캐스팅 
		person2.method();
		person2.method1();
		System.out.println();
		
		a.method();
		person.method();
		person.method1();
		
		A a1 = new Member();  // 인터페이스 필드의 다형성  
		a1.method();
		// a의 근본은 A라는 인터페이스이다. A인터페이스 에는 method1()에는 존재하지 않음
		// 다형성에서 배웠듯이 근본은 절대 벗어나지 못한다
		// a1.method1(); 접근 못함 
	}
}
