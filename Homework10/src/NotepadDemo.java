
public class NotepadDemo {

	public static void main(String[] args) {
		
		SecuredNotepad taenDnevnik = new SecuredNotepad(5, "");
		SimpleNotepad notepad = new SimpleNotepad(4);
		
		notepad.addText(1, "text on page 1");
		notepad.viewPage();
		
		taenDnevnik.addText(3, "test text");
		taenDnevnik.replaceText(3, "replacement");
		taenDnevnik.delText(3);
		taenDnevnik.viewPage();
		
		Page lastPage = new Page("Last page", "I te taka...");
		System.out.println(lastPage.viewPage());
		System.out.println(lastPage.searchWord("tE"));
		lastPage.addText("adw3adawd");
		System.out.println (lastPage.containsDigits());
		
		INotepad x = new SimpleNotepad(3);
		x.viewPage();
		x = new SecuredNotepad(4, "");
		x.viewPage();
		
		System.out.println(taenDnevnik.searchWord("a"));
		notepad.printAllPagesWithDigits();
		
	}

	
	
}
