
public class Page {
	
	StringBuilder title;
	StringBuilder text;
	
	void addText (String newText){
		text.append(newText);
	}
	
	void delText(){
		text.delete(0, text.length()-1);
	}
	
	void viewPage (){
		System.out.println(title);
		System.out.println(text);
	}
}
