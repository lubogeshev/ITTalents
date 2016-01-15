
public class SimpleNotepad implements INotepad {

	Page[] pages;

	public SimpleNotepad(int numberOfPages) {
		if (numberOfPages < 0) {
			System.out.println("Number of pages can't be < 0. Notepad will be created with 1 page.");
			numberOfPages = 1;
		}
		this.pages = new Page[numberOfPages];
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Page("", "");
		}

	}

	@Override
	public void addText(int pageNumber, String newText) {
		if (this.validatePageNumber(pageNumber)) {
			this.pages[pageNumber].addText(newText);
		}
	}

	@Override
	public void replaceText(int pageNumber, String newText) {
		if (this.validatePageNumber(pageNumber)) {
			this.pages[pageNumber].delText();
			this.pages[pageNumber].addText(newText);
		}
	}

	@Override
	public void delText(int pageNumber) {
		if (this.validatePageNumber(pageNumber)) {
			this.pages[pageNumber].delText();
		}
	}

	@Override
	public void viewPage() {
		for (int i = 0; i < pages.length; i++){
			System.out.println("Page " + i);
			System.out.println(pages[i].viewPage());
		}
	}
	
	public boolean validatePageNumber (int pageNumber){
		if ((pageNumber > this.pages.length - 1) || (pageNumber < 0)) {
			System.out.println("Invalid page number");
			return false;
		}
		return true;
	}

}
