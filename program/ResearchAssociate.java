public class ResearchAssociate extends Employee {

	public String fieldOfStudy;

	public ResearchAssociate(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;

		System.out.println("Research Associate was created");
	}

	public ResearchAssociate() {
		System.out.println("Research Associate was created");
	}
}