package sec01_exam;

/*추상클래스란?
 * 추상메서드를 1개이상 가지고 있는 클래스
 * 추상메서드는 선언부만 있고 구현부가 없는 클래스
 * 완성된 설계도가 아니기 때문에 인스턴스를 생성할 수 없다
 * 인스턴스를 생성하기 위해서는 추상메서드를 구현해야 한다
 * 
 * 추상메서드
 * 선언부만 있고 구현부가 없는 클래스
 * 꼭 필요하지만 자손마다 다르게 구현 될 것으로 예상되는 경우 사용
 * 추상 클래스의 일부 메서드만 구현할 때 그 클래스 앞에 abstract 를 붙여야 한다
 */
public abstract class ContentSender { // 추상클래스 , abstract 붙었고 추상메서드 sendMsg가 포함
	String title;
	String nm;
	// 인터페이스는 생성자를 못만들지만 추상클래스는 생성자를 만들수있다
	public ContentSender() {
	}
	public ContentSender(String title,String nm) {
		super();
		this.title = title;
		this.nm = nm;
	}
	// 추상메서드 --> 상속을 통해서 반드시 재정의 되어야지만 비로소 인스턴스를 생성할 수 있다.
	public abstract void sendMsg(String content);
	
}
