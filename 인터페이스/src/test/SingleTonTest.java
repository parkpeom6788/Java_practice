package test;

public class SingleTonTest {
	
	private SingleTonTest single = new SingleTonTest(); 
	
	private SingleTonTest() {
		
	}
	public SingleTonTest getInstance() {
		return single;
	}
}
