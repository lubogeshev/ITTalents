
public class SimpleNotepad implements INotepad {

	Page[] pages;

	public SimpleNotepad(int numberOfPages) {
		if (numberOfPages < 0) {
			System.out.println("Number of pages can't be < 0. Notepad will be created with 1 page.");
			numberOfPages = 1;
		}
		this.pages = new Page[numberOfPages];

	}

	@Override
	public void addText(Page page, String newText) {
		page.addText(newText);
	}

	@Override
	public void replaceText(Page page, String newText) {
		page.delText();
		page.addText(newText);
	}

	@Override
	public void delText(Page page) {
		page.delText();
	}

	@Override
	public void viewPage() {
		for (int i = 0; i < this.pages.length; i++) {
			this.pages[i].viewPage();
		}
	}

}
