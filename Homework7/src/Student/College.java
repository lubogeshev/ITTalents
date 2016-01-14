package Student;

public class College {
	
	public static void main(String[] args) {
		Student petyr = new Student("Petyr Petrov", "SSS", 21);
		petyr.yearInCollege = 3;
		petyr.grade = 5.60;
		Student ivan = new Student("Ivan Ivanov", "SSS", 20);
		ivan.yearInCollege = 2;
		Student gosho = new Student("Georgi Georgiev", "ARH", 20);
		gosho.yearInCollege = 2;
		Student mitko = new Student("Dimityr Dimitrov", "GEO",19);
		
		StudentGroup sss = new StudentGroup("SSS");
		StudentGroup arh = new StudentGroup("ARH");
		StudentGroup geo = new StudentGroup("GEO");
		
		mitko.upYear();
		petyr.upYear();
		petyr.upYear();
		
		System.out.println("Before candidating for scholarship " + mitko.name + " has " + mitko.money + " BGN");

		mitko.receiveScholarship(3.5, 100);
		
		System.out.println("After candidating for scholarship " + mitko.name + " has " + mitko.money + " BGN");

		sss.addStudent(petyr);
		sss.addStudent(gosho);
		sss.addStudent(ivan);
		sss.addStudent(mitko);
		
		arh.addStudent(petyr);
		arh.addStudent(gosho);
		arh.addStudent(ivan);
		arh.addStudent(mitko);
		
		geo.addStudent(petyr);
		geo.addStudent(gosho);
		geo.addStudent(ivan);
		geo.addStudent(mitko);
		
		System.out.println("The best student in " + sss.groupSubject +" group is "+ sss.theBestStudent());

		sss.printStudentsInGroup();
		arh.printStudentsInGroup();
		geo.printStudentsInGroup();
	}
}
