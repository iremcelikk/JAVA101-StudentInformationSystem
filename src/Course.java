
public class Course {
	Teacher teacher;
	String name;
	String code;
	int note;

	Course(String name, String code) {
		this.name = name;
		this.code = code;
		this.note = 0;
	}

	void addTeacher(Teacher teacher) {
		if (this.code.equals(teacher.branch)) {
			this.teacher = teacher;
			System.out.println("Teacher added.");
		} else {
			System.out.println("Teacher does not belong to this class!!");
		}
	}

	void printTeacher() {
		System.out.println("////////////////////////////");
		System.out.println("Teacher name " + teacher.name);
		System.out.println("Teacher phone number " + teacher.phoneNumber);
		System.out.println("Teacher branch " + teacher.branch);
	}
}
