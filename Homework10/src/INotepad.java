
public interface INotepad {

	void addText (int pageNumber, String newText);
	void replaceText (int pageNumber, String newText);
	void delText (int pageNumber);
	void viewPage ();
	boolean searchWord(String word);
	void printAllPagesWithDigits();
}
