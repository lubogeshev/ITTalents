import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	
	private String password;
	private Scanner sc;

	public SecuredNotepad(int numberOfPages, String password) {
		super(numberOfPages);
		this.password = password;
	}
	
	boolean validatePassword (){
		sc = new Scanner(System.in);
		System.out.println("Please, enter your Notebook Password!");
		String password = sc.nextLine();
		if (this.password.equals(password)) {
			return true;
		}
		System.out.println("Invalid password!");
		return false;
	}
	
	@Override
	public void addText(int pageNumber, String newText) {
		if (this.validatePassword()){
			super.addText(pageNumber, newText);
		}
	}
	
	@Override
	public void replaceText(int pageNumber, String newText) {
		if (this.validatePassword()){
			super.replaceText(pageNumber, newText);
		}
	}
	
	@Override
	public void delText(int pageNumber) {
		if (this.validatePassword()){
			super.delText(pageNumber);
		}
	}
	
	@Override
	public void viewPage() {
		if (this.validatePassword()){
			super.viewPage();
		}
	}
	
}
