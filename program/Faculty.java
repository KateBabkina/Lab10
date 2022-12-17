public class Faculty {

	public Employee dean;
	public String name;

	public Faculty(Employee dean, String name) {
		this.dean = dean;
		this.name = name;

		System.out.println("Faculty was created");
	}

	public Faculty() {
		System.out.println("Faculty was created");
	}

	public void addTeacher(){

	}
	public void deleteTeacher(){

	}

}