package model.vo;

public class Employee extends Member {
	private static final long serialVersionUID = -509758488140816644L;
	private String department;
	public Employee(String name, String tel, String address, String department) {
		super(name, tel, address);
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee "  +  super.toString() + " department = " + department;
	}
}
