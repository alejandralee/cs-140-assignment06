package assignment06;

public class MyClass implements Comparable<MyClass>{
	private Offering course;
	private double qualityPoints;
	private int gpaCredits;
	private boolean failed;
	public MyClass(Offering cls, String letterGrd){
		this.course = cls;
		this.gpaCredits = cls.getNumCredits();
		this.qualityPoints = QPointsCalculator.points(letterGrd.toUpperCase(), gpaCredits);
		if (letterGrd.equalsIgnoreCase("P")){
			this.gpaCredits = 0;
		}
		else if (letterGrd.equalsIgnoreCase("F")){
			this.failed = true;
		}
	}
	public Offering getCourse(){
		return this.course;
		}
	public int getGPACredits(){
		return gpaCredits;
	}
	public void modifyRepeat(MyClass other) {
		if(course.getRubric().equals(other.course.getRubric()) && course.getNumber().equals(other.course.getNumber())){
			if(course.getSemester()>other.course.getSemester() && !other.failed){
				this.qualityPoints = 0;
				this.gpaCredits = 0;
			}
		}
		
	}
	public double getQualityPoints() {
		return qualityPoints;
	}
	@Override
	public int compareTo(MyClass otherClass) {
		if (otherClass == null){
			return -1;
		}
		else{
			return course.compareTo(otherClass.course);
		}

	}

	
}
