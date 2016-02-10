import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {

	private String password;
	private Scanner sc;

	public SecuredNotepad(int numberOfPages, String password) {
		super(numberOfPages);
		if (password == null) {
			password = "";
		}
		
		this.password = password;
		
		// try1 - exception
		
//		if (!strongPassword(password)) {
//			throw new IllegalArgumentException();
//		}
	}
	
		// try2 - factory method
	
//	public SecuredNotepad SecuredNotepadWithStrongPass(int numberOfPages, String password) {
//		if (strongPassword(password)) {
//			return new SecuredNotepad(numberOfPages, password);
//		}
//		return null;
//	}
		
//	private boolean strongPassword(String password) {
//		if (password.length() > 5) {
//			if (password.matches(".*\\d+.*")) {
//				if (password.matches("[A-Z]*")) {		// not sure that this works properly
//					if (password.matches("[a-z]*")) {
//						return true;
//					}
//				}
//			}
//		}
//		return false;
//	}

	protected boolean validatePassword() {
		sc = new Scanner(System.in);
		System.out.println("Please, enter your Notebook Password!");
		String password = sc.nextLine();
		if (this.password.equals(password)) {
			return true;
		}
		System.out.println("Invalid password!");
		return false;
	}

	public void setPassword(String password) {
		if (this.validatePassword()) {
			this.password = password;
		} else {
			System.out.println("Password remains unchanged!");
		}
	}

	@Override
	public void addText(int pageNumber, String newText) {
		if (this.validatePassword()) {
			super.addText(pageNumber, newText);
		} else {
			System.out.println(newText + " was not added to page " + pageNumber);
		}
	}

	@Override
	public void replaceText(int pageNumber, String newText) {
		if (this.validatePassword()) {
			super.replaceText(pageNumber, newText);
		} else {
			System.out.println(newText + " did not replace the text on page " + pageNumber);
		}
	}

	@Override
	public void delText(int pageNumber) {
		if (this.validatePassword()) {
			super.delText(pageNumber);
		} else {
			System.out.println("Text on page " + pageNumber + " was not deleted!");
		}
	}

	@Override
	public void viewPage() {
		if (this.validatePassword()) {
			super.viewPage();
		} else {
			System.out.println("Can not view pages!");
		}
	}

	@Override
	public boolean searchWord(String word) {
		if (this.validatePassword()) {
			return super.searchWord(word);
		}
		System.out.println("Search terminated, will return false!");
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (this.validatePassword()) {
			super.printAllPagesWithDigits();
		} else {
			System.out.println("Can not view pages!");
		}
	}

}
