
public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice {

	private boolean isStarted;

	public ElectronicSecuredNotepad(int pageCapacity, String password) {
		super(pageCapacity, password);
	}

	@Override
	public void start() {
		if (this.validatePassword()) {
			System.out.println("Welcome!");
			this.isStarted = true;
		} else {
			System.out.println("Can not start device!");
		}
	}

	@Override
	public void stop() {
		System.out.println("Goodbye!");
		this.isStarted = false;
	}

	@Override
	public boolean isStarted() {
		return this.isStarted;
	}

	@Override
	public void addText(int pageNumber, String newText) {
		if (this.isStarted) {
			super.addText(pageNumber, newText);
		} else {
			System.out.println("The device is off!");
		}
	}

	@Override
	public void replaceText(int pageNumber, String newText) {
		if (this.isStarted) {
			super.replaceText(pageNumber, newText);
		} else {
			System.out.println("The device is off!");
		}
	}
	
	@Override
	public void delText(int pageNumber) {
		if (this.isStarted) {
			super.delText(pageNumber);
		} else {
			System.out.println("The device is off!");
		}
	}
	
	@Override
	public void viewPage() {
		if (this.isStarted) {
			super.viewPage();
		} else {
			System.out.println("The device is off!");
		}		
	}
	
	@Override
	public boolean searchWord(String word) {
		if (this.isStarted) {
			return super.searchWord(word);
		} else {
			System.out.println("The device is off!");
			return false;
		}		
	}
	
	@Override
	public void printAllPagesWithDigits() {
		if (this.isStarted) {
			super.printAllPagesWithDigits();
		} else {
			System.out.println("The device is off!");
		}	
	}

}
