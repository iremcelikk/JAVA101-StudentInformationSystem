
public class Student {
	Course math;
	Course physics;
	Course chemistry;
	String name;
	String stuNumber;
	int grade;
	double average;

	Student(String name, String stuNumber, int grade, Course math, Course physics, Course chemistry) {
		this.name = name;
		this.stuNumber = stuNumber;
		this.grade = grade;
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
	}

	void addBulkExamNote(int math, int physics, int chemistry) {
		if (math >= 0 && math <= 100) {
			this.math.note = math;
		}
		if (physics >= 0 && physics <= 100) {
			this.physics.note = physics;
		}
		if (chemistry >= 0 && chemistry <= 100) {
			this.chemistry.note = chemistry;
		}
	}

	void isPass() {
		printNote();
		if (calcAverage() > 60)
			System.out.println("Passed the class :)");
		else
			System.out.println("Did not pass the class :(");
		System.out.println(average);
	}

	double calcAverage() {
		this.average = (this.math.note + this.physics.note + this.chemistry.note) / 3.0;
		return average;
	}

	void printNote() {
		System.out.println("=========================");
		System.out.println("Student : " + this.name);
		System.out.println("Math Note : " + this.math.note);
		System.out.println("Physics Note : " + this.physics.note);
		System.out.println("Chemistry Note : " + this.chemistry.note);
	}

}
