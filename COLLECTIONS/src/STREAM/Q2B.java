package STREAM;

public class Q2B {
	int empNo;
	String name;
	int age;
	String location;

	public Q2B(int empNo, String name, int age, String location) {
		this.empNo = empNo;
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public String toString() {
		return empNo + " - " + name + " - " + age + " - " + location;
	}

}