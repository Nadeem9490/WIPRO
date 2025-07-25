package STREAM;

public class Q3B {
	int roll;
	String name;
	int marks;

	public Q3B(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public String toString()
	{
		return roll + "-" + name + "-" + marks;
	}

}