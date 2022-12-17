import java.util.Date;

public class Project {

	public String name;
	public Date start;
	public Date end;

	public Project(String name, Date start, Date end) {
		this.name = name;
		this.start = start;
		this.end = end;

		System.out.println("Project was created");
	}

	public Project() {
		System.out.println("Project was created");
	}

	public void beginProject(){

	}
	public void finishProject(){

	}
}