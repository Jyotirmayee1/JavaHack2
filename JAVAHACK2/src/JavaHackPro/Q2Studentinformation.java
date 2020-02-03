package JavaHackPro;



public class Q2Studentinformation implements Comparable<Q2Studentinformation>{


// Write a java program to store 5 student information and award the students
//	with 1st rank, 2nd rank and 3rd rank according to marks obtained where each student has student name,
//	student marks and student reg no information
  private String name;
   private int id;
   private int marks;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public Q2Studentinformation(String studentName, int studentId, int studentMarks) {
	super();

	name = studentName;
	id=studentId ;
	this.marks= studentMarks;
}
@Override
public String toString() {
	return "Student [ studentName=" + name + ", studentId =" + id + ",  studentMarks=" + marks+ "]";
}
@Override
public int compareTo(Q2Studentinformation student2) {
	if(this.getMarks()>student2.getMarks())
		return 1;
	return 0;

	
	
	
}
 

	}


