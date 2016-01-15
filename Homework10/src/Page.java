
public class Page {

	String title;
	String text;

	public Page(String title, String text) {
		if (title == null) {
			this.title = "";
			
		} else if (text == null) {
			this.text = "";
			
		} else {
			this.title = title;
			this.text = text;
		}
	}

	void addText(String newText) {
		this.text.concat (newText);
	}

	void delText() {
		this.text = "";
	}

	void viewPage() {
		System.out.println(title);
		System.out.println(text);
	}
}
