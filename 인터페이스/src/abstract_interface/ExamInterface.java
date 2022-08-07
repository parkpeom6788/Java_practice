package abstract_interface;
public class ExamInterface {
	/*
	 * 인터페이스는 추상클래스의 일종이지만 보다 더 극단적인 경우이다
	 * 추상메서드로만 구성되며 abstract 와 다르게 메서드만 정의가 가능
	 * 공동 작업을 할때 메서드의 표준화를 시키기 위해 많이 사용
	 * 서로 다른 클래스를 연결할 때도 사용된다.
	 */
	public static void main(String[] args) {
		Door door = new Door();
		door.open();
		door.Blue();
		door.Red();
		door.close();
		
		Bottle bottle = new Bottle();
		bottle.open();
		bottle.close();
	}
	// 인터페이스는 메서드와 멤버변수만을 정의한다 
	// 다른클래스에서 그것을 사용하도록 강제하는 역할에만 충실하다는 것
	// 인터페이스는 implements 라는 키워드로 상속을 받기 때문에
	// 여러개의 인터페이스를 하나의 클래스에서 같이 사용하는 다중상속이 가능
	// abstract 는 클래스의 성격이 강하기 때문에 extends로 상속하여 
	// 클래스에서 하나의 abstract 만을 상속 할 수 있다
	/*
	 * Interface는 implements 로 상속받으며
	 * extends 상속과는 다르게 다중 상속이 가능
	 */
}
interface OpenCloseIf {
	public void open();
	public void close();
}
interface PaintIf {
	public void Red();
	public void Blue();
}
class Door implements OpenCloseIf , PaintIf {
	public Door() {}
	@Override
	public void Blue() {
		System.out.println("Paint the door blue");
	}
	@Override
	public void open() {
		System.out.println("Door Open");
	}
	@Override
	public void close() {
		System.out.println("Door Close");
	}
	@Override
	public void Red() {
		System.out.println("Paint the door red");
	}
}
class Bottle implements OpenCloseIf {
	@Override
	public void open() {
		System.out.println("Bottle Open");
	}
	@Override
	public void close() {
		System.out.println("Bottle Close");
	}
}
