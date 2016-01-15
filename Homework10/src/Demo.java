
public class Demo {

	public static void main(String[] args) {
		SimpleNotepad npad = new SimpleNotepad(12);
		Page page = new Page("title1", "empty text");
		npad.pages[0] = page;
		npad.addText(npad.pages[0], "adw");
		
		System.out.println(npad.pages[0].text);
		
		
	}

	
	
}
