import java.util.*;

public class Course {

	Collection<Lecturer> teaches;
	public String name;
	public int id;
	public float hours;

	public Course(Collection<Lecturer> teaches, String name, int id, float hours) {
		this.teaches = teaches;
		this.name = name;
		this.id = id;
		this.hours = hours;

		System.out.println("Course was created");
	}

	public Course() {
		System.out.println("Course was created");
	}

	public void addStudentToCourse(){

	}
	public void deleteStudentFromCourse(){

	}

}