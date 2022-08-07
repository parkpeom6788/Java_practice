package sec02_exam;

public class UnitEx {
	public static void main(String[] args) {
		//Unit unit = new Unit(); // 예외 발생 이유?
		// Unit은 추상클래스이기 때문에
		// 인스턴스를 생성할 수 없어서 예외가 발생합니다.
		System.out.println("----------------------------------------");
		Tank tank = new Tank();
		tank.move(100, 300);
		tank.sizeMode();
		tank.stop("탱크", 300, 400);
		System.out.println("----------------------------------------");
		Marine marine = new Marine();
		marine.move(200, 500);
		marine.stimPack();
		marine.stop("마린", 300, 400);
		
		System.out.println("----------------------------------------");
		DropShip dp = new DropShip();
		dp.move(500, 600);
		dp.load();
		dp.unload();
		dp.stop("드랍쉽", 200, 100);
		
		// Unit의 move 메서드를 각각 오버라이딩 했더니 객체마다 오버라이딩한
		// move메서드가 나타남을 확인 할 수 있다.
	}
}
