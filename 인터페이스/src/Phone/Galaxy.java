package Phone;

public class Galaxy implements Phone {
	//  implements 키워드를 통해 일반 클래스에서 인터페이스를 구현
	@Override
	public String getMenufacturer() {
		return "Samsung";
	}
	@Override
	public String getOS() {
		return "Android";
	}
	public void printRing() {
		System.out.println("Sound : Ring ~~~~~~");
	}
}
