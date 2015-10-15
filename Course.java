package assignment06;

public class Course{

	private String name;
	private String rubric;
	private String number;
	private int numCredits;

	public Course(String name, String rubric, String number, int numCredits){

		this.name = name;
		this.rubric = rubric;
		this.number = number;
		this.numCredits = numCredits;
	}
	
	public String getName(){
		return name;
	}
	public String getRubric(){
		return rubric;
	}
	public String getNumber(){
		return number;
	}
	public int getNumCredits(){
			return numCredits;
	}
}
