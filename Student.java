package assignment06;

import java.util.ArrayList;
import java.util.Collections;

public class Student{
	private Person student;
	private ArrayList<MyClass> myClasses;
	
	public Student(Person student){
		this.student = student;
	}
	
	public void addToMyClass(MyClass newClass){
		myClasses.add(newClass);
	}
	
	public double GPA(){
		ArrayList<MyClass> copy = new ArrayList<MyClass>(myClasses);
		copy.removeAll(Collections.singleton(null));
		Collections.sort(copy);

		for(int i = 0; i < copy.size(); i++){
			for(int j = i+1; j < copy.size(); j++){
				copy.get(j).modifyRepeat(copy.get(i));
				}
			}

		double totalQualityPoints = 0;
		double totalGPACredits = 0;

		for(int i = 0; i < copy.size(); i++){
			if (myClasses.get(i) != null){
				totalGPACredits = totalGPACredits + copy.get(i).getGPACredits();
				totalQualityPoints = totalQualityPoints + copy.get(i).getQualityPoints();
				}
			}

		if (totalGPACredits == 0){
			return 0;
			}
	else{
		return totalQualityPoints/totalGPACredits;
		}
	}
}
