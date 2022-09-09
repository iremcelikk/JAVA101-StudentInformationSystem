
public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mary", "555", "Math");
		Teacher t2 = new Teacher("James", "222", "Phys");
		Teacher t3 = new Teacher("Susan", "778", "Chem");

		Course Math = new Course("Mathematic", "Math");
		Course Physics = new Course("Physics", "Phys");
		Course Chemistry = new Course("Chemistry", "Chem");

		Math.addTeacher(t1);
		Physics.addTeacher(t2);
		Chemistry.addTeacher(t3);

		Math.printTeacher();
		Physics.printTeacher();
		Chemistry.printTeacher();

		Student s1 = new Student("Jessica", "235", 3, Math, Physics, Chemistry);
		s1.addBulkExamNote(66, 25, 45);
		s1.isPass();

		Student s2 = new Student("Mark", "995", 3, Math, Physics, Chemistry);
		s2.addBulkExamNote(87, 54, 95);
		s2.isPass();

		Student s3 = new Student("Paul", "341", 3, Math, Physics, Chemistry);
		s3.addBulkExamNote(100, 42, 66);
		s3.isPass();
	}

}
