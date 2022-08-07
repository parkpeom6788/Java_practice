package sec02_exam;

public abstract class Unit {
	//필드
	int x;
	int y;
	String str;
	// 추상메서드 선언(구현부 없다)
	// 모든 유닛은 움직여야 하기 때문에 move()를 추상메서드로 썼다
	public abstract void move(int x,int y); // 추상메서드
	
	// 구현받은 클래스가 쓸수있음
	public void stop(String str,int x ,int y) {
		this.x =x;
		this.y = y;
		this.str = str;
		System.out.println("현재 위치 : " + this.x + "," + this.y +"에" +this.str +"가/이 멈춥니다.");
	}
}
