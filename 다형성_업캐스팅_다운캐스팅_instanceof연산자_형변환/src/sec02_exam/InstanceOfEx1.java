package sec02_exam;

class Car {}
class FireEngine extends Car{}
class Ambulance extends Car{}

public class InstanceOfEx1 {
	
	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		Object obj = fe; // 업캐스팅
		Car car = fe; // 업캐스팅
		
		//instanceof 연산자의 결과가 참이면 형변환이 가능하다
		if(fe instanceof FireEngine) {
			// fe가 FireEngine의 객체냐? 라고 묻는 것입니다.
			System.out.println("This is a FireEngine instance");
		}
		if(fe instanceof Car) {
			System.out.println("This is a Car instance");
		}
		if(fe instanceof Object) {
			System.out.println("this is a Object instance");
		}
		// 예외 발생 -> FireEngine 과 Ambulance 는 아무런 관계가 없다
		//		if(fe instanceof Ambulance) {
		//			System.out.println("This is a Ambulance instance");
		//		}
	}
}
