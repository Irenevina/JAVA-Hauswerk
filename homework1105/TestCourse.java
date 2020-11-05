public class TestCourse implements Cloneable { 

		private String courseName;
		private String[] students = new String[100];
		private int numberOfStudents;
		
		public TestCourse(String courseName){
			this.courseName = courseName;
		}
		
		public void addStudent(String student) {
			students[numberOfStudents] = student;
			numberOfStudents++;	
		}
		
		public String[] getStudents() {
			return students;
		}
		
		public int getNumberOfStudents() {
			return numberOfStudents;
		}
		
		public String getCourseName() {
			return courseName;
		}

	    @Override
	    public Object clone() throws CloneNotSupportedException {

	        TestCourse TestCourseClone = (TestCourse)super.clone();
	        TestCourseClone.students = students.clone();
	        return TestCourseClone;
	    }
	    
	    public static void main(String [] args) throws CloneNotSupportedException
	    {
	        TestCourse course1 = new TestCourse("Data Strcuture");
	        course1.addStudent("Irene");
	        course1.addStudent("Joy");
	        course1.addStudent("Yevvete");
	        System.out.println(course1.getNumberOfStudents());

	        TestCourse course2 = (TestCourse)(course1.clone()); 
	        course2.addStudent("Muin");
	        course2.addStudent("Marren");

	        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
	        String[] students1 = course1.getStudents();
	        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
	            System.out.print(students1[i] + ",");
	        }

	        System.out.println();
	        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
	        String[] students2 = course2.getStudents();
	        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
	            System.out.print(students2[i] + ",");
	        }
	    }
}
