package l_9_t_1;

public class PromotedStudents {
	private int roll_no;
	private int subjectcode;
	private String subjectname;
	
	public PromotedStudents(int roll_no, int subjectcode, String subjectname) {
		this.roll_no = roll_no;
		this.subjectcode = subjectcode;
		this.subjectname = subjectname;
	}
	
	public int getRollno() {
		return roll_no;
	}
	
	public void setRollno(int roll_no) {
		this.roll_no= roll_no;
	}
	
	public int getCode() {
		return subjectcode;
	}
	
	public void setCode(int subjectcode) {
		this.subjectcode= subjectcode;
	}
	
	public String getName() {
		return subjectname;
	}
	
	public void setName(String subjectname) {
		this.subjectname = subjectname;
	}
	
	public static void main(String[] args) {
		//getting name
		System.out.println("Previous Semester!");
		PromotedStudents PS = new PromotedStudents(44, 156,"Software Design And Architecture!");
		System.out.println("Roll No Is : " +PS.getRollno());
		System.out.println("Subject Code Is : " +PS.getCode());
		System.out.println("Course Name Is : " +PS.getName());
		// setting name
	    System.out.println("\nCurrent Semester!");
		PS.setCode(200);
		System.out.println("Subject Code Is : " +PS.getCode());
		System.out.println("Course Name Is : " +PS.getName());	    	
  }
}

