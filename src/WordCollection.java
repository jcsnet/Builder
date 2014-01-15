import java.util.List;

import utils.StringTools.StringFromFile;
import utils.StringTools.StringSpliter;


public class WordCollection extends Builder {
	
	private StringSpliter stringSpliter;
	private StringFromFile stringFromFile;
	
	public WordCollection() {
		init();
	}
	
	public List<String> getWorlds(){
		return stringSpliter.splitStringToWords(stringFromFile.getStringFromFile());
	} 
	
	public void print(){
		System.out.println("LICZBA WSZYSTKICH S£ÓW W TEKŒCIE : " + getWorlds().size());
	}
	
	private void init(){
		stringSpliter = new StringSpliter();
		stringFromFile = new StringFromFile("C:\\","english_book_utf.txt");
	}
}
