package Student;

import java.util.Scanner;

public class StudentMarks {
	public float mark1 ;
	public float mark2 ;
	public float mark3 ;
	public float mark4 ;
	public float sum ;
	public float Average ;
	
	public  int AGrade;
	public  int BGrade;
	public  int CGrade;
	public  int DGrade;
	public  int EGrade;
	public  int FGrade;
	
	public StudentMarks (float M1,float M2,float M3,float M4){
		this.mark1= M1;
		this.mark2=M2;
		this.mark3=M3;
		this.mark4=M4;
	}
	public void calculatesum()	{
		this.sum= this.mark1 + this.mark2+this.mark3+this.mark4;
	}
	public void claculateAverage() {
		this.Average = this.sum/4;
	}
		public char calculateGrade() {
			char grade;
			System.out.println(this.Average);
			if(this.Average>=80.0f) {
				grade = 'A';
				AGrade=AGrade+1;
			}
	else if(this.Average>=60.0f && this.Average<80.0f) {
		grade ='B';
		BGrade=BGrade+1;
	}
	else if(this.Average>=50.0f && this.Average<60.0f) {
		grade ='C';
		CGrade=CGrade+1;
		
	}
	else if(this.Average>=35.0f && this.Average<50.0f) {
		grade ='D';
		DGrade=DGrade+1;
	}
		else {
			grade ='F';
			FGrade=FGrade+1;
		}
			System.out.println(grade);
			return grade;
		}	
		public static void countGrades() {
			}
		public static void main(String[] args) {
			
		StudentMarks Student1 = new StudentMarks(12.4f,45.67f,78.0f,100.0f);
		
		Student1.calculatesum();
		Student1.claculateAverage();
	System.out.println("Grade of student1 is "+Student1.calculateGrade());
		
		
StudentMarks Student2 = new StudentMarks(32.4f,32.67f,88.0f,90.0f);
		
		Student2.calculatesum();
		Student2.claculateAverage();
		System.out.println("Grade of student2 is "+Student2.calculateGrade());
	
		
		
			StudentMarks Student3 = new StudentMarks(90.4f,90.57f,78.0f,90.0f);
			
			Student3.calculatesum();
			Student3.claculateAverage();
			System.out.println("Grade of student3 is "+Student3.calculateGrade());
		
	
		
		Scanner sc= new Scanner (System.in);
		System.out.println("please enter number of students");
		int noStudents = sc.nextInt();
		for(int i= 1; i <=noStudents ; i++) {
			System.out.println("please enter Mark1 for student "+ i);
			
			Float mark1 = sc.nextFloat();
			System.out.println("please enter Mark2 for student "+ i);
		
			Float mark2 = sc.nextFloat();
			System.out.println("please enter Mark3 for student "+ i);	
		
			Float mark3 = sc.nextFloat();
			System.out.println("please enter Mark4 for student "+ i);
		
			Float mark4 = sc.nextFloat();
			System.out.println("user inputs are " + mark1 +","+ mark2 +" , "+ mark3 +","+ mark4);
	
			StudentMarks st = new StudentMarks(mark1, mark2, mark3, mark4);
			st.calculatesum();
			st.claculateAverage();System.out.println("grade of student "+i+" is "+ st.calculateGrade());
			
			System.out.println("No of students with A grade  "+ st.AGrade);
			System.out.println("No of students with B grade  "+ st.BGrade);
			System.out.println("No of students with C grade  "+ st.CGrade);
			System.out.println("No of students with D grade  "+ st.DGrade);
			System.out.println("No of students with F grade  "+ st.FGrade);
			
			
		}
		}}
		
		
	

	


