package model.vo;

public class Student extends Member{

	private static final long serialVersionUID = -523702386329448983L;
	private String stuid;
	public Student(String name, String tel, String address, String stuid) {
		super(name, tel, address);
		this.stuid = stuid;
	}
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	@Override
	public String toString() {
		return "Student : " + super.toString() + " stuid = " + stuid;
	}
}
