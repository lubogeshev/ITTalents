
public class Person {

	protected String name;
	protected int age;
	protected boolean isMale;

	public Person(final String name, int age, final boolean isMale) {
		this.setName(name);
		this.setAge(age);
		this.isMale = isMale;
	}

	protected void setName(String name) {
		if (name != null) {
			boolean allLetters = true;
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == ' ') {
					continue;
				} else if (!Character.isLetter(name.charAt(i))) {
					allLetters = false;
					break;
				}
			}
			if (allLetters) {
				this.name = name.trim();
			} else {
				System.out.println(
						"Invalid name! Name set to \"Unknown\"." + " Use setName to set valid name! (letters only)");
				this.name = "Unknown";
			}

		} else {
			System.out.println(
					"Name cannot be null! Name set to \"Unknown\"." + " Use setName to set valid name! (letters only)");
			this.name = "Unknown";
		}
	}

	protected void setAge(int age) {
		if (this.age < 0) {
			System.out.println("Invalid age. Age set to 0!");
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public void showPersonInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Sex: " + ((isMale) ? "Male" : "Female"));
	}

}
