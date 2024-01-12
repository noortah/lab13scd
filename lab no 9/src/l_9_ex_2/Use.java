package l_9_ex_2;

   public final class Use {
	final String courseName;
	final int rollNumber;
   public Use  (String courseName, int rollNumber) {
	this.courseName = courseName;
	this.rollNumber = rollNumber;
	}
   public String getCourseName() {
    return courseName;
   }
   public int getRollNumber() {
    return rollNumber;
	}
   public static void main(String[] args) {
	 Use obj = new Use  ("Software Construction and Development" , 100);
	// Since no setters are available contents cannot be modified.
	// Also as variables are declared final they cannot be modified
	 System.out.println("Course is " + obj.getCourseName());
	 System.out.println("Roll Number is " + obj.getRollNumber());
	}
}

