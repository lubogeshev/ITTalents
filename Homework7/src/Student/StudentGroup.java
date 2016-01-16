package Student;

public class StudentGroup {

	String groupSubject;
	Student[] students;
	int freePlaces;

	public StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	public StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	void addStudent(Student s) {
		if (this.freePlaces > 0) {
			if (this.groupSubject.equalsIgnoreCase(s.subject)){
				this.students[this.students.length - freePlaces] = s;
				freePlaces--;
			} else {
				System.out.println(s.name + "'s subject is " + s.subject + 
									", but that group is " + this.groupSubject);
			}
		} else {
			System.out.println(this.groupSubject + " group is full.");
		}
	}

	void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	String theBestStudent() {
		Student bestStudent = this.students[0];
		for (int i = 1; i < this.students.length - this.freePlaces; i++) {
			if (students[i].grade > bestStudent.grade) {
				bestStudent = students[i];
			}
		}
		return bestStudent.name;
	}

	void printStudentsInGroup() {
		System.out.println("Information about students in group " + this.groupSubject + ":");
		if (this.students.length != this.freePlaces) {
			for (int i = 0; i < this.students.length - this.freePlaces; i++) {
					System.out.println("Student " + (i + 1) + 
							": Name - " + students[i].name + 
							"; Age - " + students [i].age +
							"; Grade - " + students[i].grade + 
							"; Year - " + students [i].yearInCollege);
			}
		} else {
			System.out.println("There are no students in " + this.groupSubject + " group!");
		}
	}
}
