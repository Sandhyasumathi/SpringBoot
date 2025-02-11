package course;

public class JavaCourse implements Course
{
	
	public JavaCourse() {
		System.out.println("Java Bean Created");
	}

	public boolean buyACourse(double rate) {
		System.out.println("Java Course Purchased " + rate);
		return true;
	}
}
