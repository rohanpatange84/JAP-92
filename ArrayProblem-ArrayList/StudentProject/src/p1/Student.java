package p1;

import java.util.Arrays;
import java.util.Objects;

public class Student {
	private int studentId;
	private String studentName;
	private double marks[] = new double[5];
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, double[] marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + Objects.hash(studentId, studentName);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Arrays.equals(marks, other.marks) && studentId == other.studentId
				&& Objects.equals(studentName, other.studentName);
	}

	@Override
	public String toString() {
		String s1="";
		for(int i=0;i<marks.length;i++) {
			
			s1+=marks[i]+" | ";
			
		}
		return String.format("%-5d %-20s %-100s",studentId,studentName,s1);
	}
	
	
	
	

}
