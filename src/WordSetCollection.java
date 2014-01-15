import java.util.Set;
import java.util.TreeSet;


public class WordSetCollection extends Builder{
	
	public Set<String> getWorlds() {
		return new TreeSet<>(wordCollection.getWorlds());
	}

	@Override
	public void print() {
		System.out.println("LICZBA UNIKALNYCH S£OW W TEKŒCIE : "+getWorlds().size()+"\n");
		for(String word : getWorlds()){
		System.out.println(word);
	}	
	}
}
