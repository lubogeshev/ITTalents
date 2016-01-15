
public class SecuredNotepad extends SimpleNotepad {

	String password;

	public SecuredNotepad(int numberOfPages, String password) {
		super(numberOfPages);
		this.password = password;
	}

	public void addText(Page page, String newText, String password) {
		if (this.password.equals(password)) {
			super.addText(page, newText);
		} else {
			System.out.println("Invalid password. Page not added!");
		}
	}

	public void replaceText(Page page, String newText, String password) {
		if (this.password.equals(password)) {
			super.replaceText(page, newText);
		} else {
			System.out.println("Invalid password. Text not added!");
		}
	}

	public void delText(Page page, String password) {
		if (this.password.equals(password)) {
			super.delText(page);
		} else {
			System.out.println("Invalid password. Text not deleted!");
		}
	}
	
	public void viewPage(String password) {
		if (this.password.equals(password)) {
			super.viewPage();
		} else {
			System.out.println("Invalid password. Can not show text!");
		}
	}
}
