package assignment06;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testGPA() {
        LocalDate dob1 = LocalDate.of(1995,12,10); 
        Gender gen1 = Gender.MALE; 
        Person futureStudent = new Person("John", "Doe", "123456789", gen1, dob1); 
        Student student = new Student(futureStudent); 
        
        
        Course newCourse = new Course("Africa,Carib,Amer","AFST","180R",4); 
        Offering newOffering = new Offering(newCourse,12574,201190); 
        MyClass newClass = new MyClass(newOffering, "A"); 
        student.addToMyClass(newClass); 
        
        
        Course newCourse1 = new Course("Calculus 1","MATH","180R",4); 
        Offering newOffering1 = new Offering(newCourse1,12574,201190); 
        MyClass newClass1 = new MyClass(newOffering1, "A-"); 
        student.addToMyClass(newClass1);
        
        
        Course newCourse2 = new Course("ComingToVoice","WRIT","111",4); 
        Offering newOffering2 = new Offering(newCourse2,94123,201190); 
        MyClass newClass2 = new MyClass(newOffering2, "B+"); 
        student.addToMyClass(newClass2);
        
        
        Course newCourse3 = new Course("Buried Cities & Lost Tribes","ANTH","125",4); 
        Offering newOffering3 = new Offering(newCourse3,12573,201220); 
        MyClass newClass3 = new MyClass(newOffering3, "B"); 
        student.addToMyClass(newClass3);
        
        
        Course newCourse4 = new Course("Programming with Objects","CS","140",4); 
        Offering newOffering4 = new Offering(newCourse4,12574,201220); 
        MyClass newClass4 = new MyClass(newOffering4, "B-"); 
        student.addToMyClass(newClass4);
        
        
        Course newCourse5 = new Course("Calculus 2","MATH","222",4); 
        Offering newOffering5 = new Offering(newCourse5,11094,201220); 
        MyClass newClass5 = new MyClass(newOffering5, "C+"); 
        student.addToMyClass(newClass5);
        
        
        Course newCourse6 = new Course("Intro Topics In Computer Scien","CS","101",4); 
        Offering newOffering6 = new Offering(newCourse6,10039,201290); 
        MyClass newClass6 = new MyClass(newOffering6, "C"); 
        student.addToMyClass(newClass6);
        
        
        Course newCourse7 = new Course("Pop, Rock, And Soul Musics","MUS","115",4); 
        Offering newOffering7 = new Offering(newCourse7,10165,201290); 
        MyClass newClass7 = new MyClass(newOffering7, "C-"); 
        student.addToMyClass(newClass7);
        
        
        Course newCourse8 = new Course("Comp Sys 1:Machine Org","CS","120",4); 
        Offering newOffering8 = new Offering(newCourse8,10039,201290); 
        MyClass newClass8 = new MyClass(newOffering8, "D"); 
        student.addToMyClass(newClass8);
        
        double calculatedGPA = student.GPA();
        double expectedGPA = 23.7/9;
        
        assertEquals(expectedGPA, calculatedGPA, .00001);
	}

}
