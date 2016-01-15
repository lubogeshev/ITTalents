
public class Demo {

	public static void main(String[] args) {
		
		SecuredNotepad taenDnevnik = new SecuredNotepad(20, "");
		taenDnevnik.pages[2].title = "TITLE 2";
		taenDnevnik.pages[19].text = "SAMO ";
		taenDnevnik.addText(19, "LEVSKI");
		taenDnevnik.viewPage();
		
	}

	
	
}
