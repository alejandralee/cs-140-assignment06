package assignment06;

public class Offering implements Comparable<Offering> {
	private Course course;
	private int CRN;
	private int semester;
	public Offering(Course course, int CRN, int semester){
		this.course = course;
		this.CRN = CRN;
		this.semester = semester;
	}
	public Course getCourse(){
		return course;
	}
	public int getCRN(){
		return CRN;
	}
	public int getSemester(){
		return semester;
	}
	public int getNumCredits(){
		return course.getNumCredits();
	}
	public String getRubric(){
		return course.getRubric();
	}
	public String getNumber(){
		return course.getNumber();
	}
	public int compareTo(Offering other) {
		if(other == null) return - 1;
		return semester - other.semester;
   }
}
