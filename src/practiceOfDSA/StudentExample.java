package practiceOfDSA;

public class StudentExample {

	public static void main(String[] args) {
		
		Stud.avgStudent(30,85,67,78,98);
	}

	public class Stud{
		public static void avgStudent(int p,int c,int m,int b,int e) {
			int a=p+c+m+b+e;
			int avg=a/5;
			System.out.println("Average score of student- "+ avg);
		}
		
	}
	
	

}