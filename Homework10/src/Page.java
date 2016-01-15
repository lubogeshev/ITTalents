
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
		this.text = this.text.concat (newText);
	}

	void delText() {
		this.text = "";
	}

	String viewPage() {
		return (this.title + "\n" + this.text);
	}
}
