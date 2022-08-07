package test;
public class ImpleInterface implements InterExample {
	@Override
	public void makeThis() { // 구현하지 않을 시 에러 발생
		System.out.println("makeThis Call");
	}
	@Override
	public void makeThisWithParam(String name, int age) { // 받은 파라미터명은 변경해 사용 가능
		System.out.println("makeThisWithParam Call with " + name + " " + age);
	}
	public static void main(String[] args) {
		ImpleInterface inter = new ImpleInterface();
		inter.makeThis();
		inter.makeThisWithParam("name", 20);
	}
}
