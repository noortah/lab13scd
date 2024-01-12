package l_9_t_1;

public class FailedStudents {
	private int roll_no;
	private int subjectcode;
	private String subjectname;

	public FailedStudents(int roll_no, int subjectcode, String subjectname) {
		this.roll_no = roll_no;
		this.subjectcode = subjectcode;
		this.subjectname = subjectname;
	}

	public int getRollno() {
		return roll_no;
	}

	public int getCode() {
		return subjectcode;
	}

	public String getName() {
		return subjectname;
	}

	public static void main(String[] args) {
		System.out.println("Previous Semester!");
		FailedStudents FS = new FailedStudents(44, 156, "Software Design And Architecture!");
		System.out.println("Roll No Is : " + FS.getRollno());
		System.out.println("Subject Code Is : " + FS.getCode());
		System.out.println("Course Name Is : " + FS.getName());
	}
}

