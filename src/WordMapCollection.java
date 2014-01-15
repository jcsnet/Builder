import java.util.HashMap;
import java.util.Map;

public class WordMapCollection extends Builder{

	
	public Map<String, Long> getWordlsMap(){
	
		Map<String, Long> wordsMap = new HashMap<>();
	
		for(String word : wordCollection.getWorlds()){
			if(!wordsMap.containsKey(word)){
				wordsMap.put(word, 0L);
			}
			else{
				wordsMap.put(word, wordsMap.get(word) + 1);
			}
		}
		return wordsMap;
	}
	
	@Override
	public void print() {
		for (Map.Entry<String, Long> entry : getWordlsMap().entrySet()) {
			System.out.println("Word : " + entry.getKey() + " : "+entry.getValue());
		}
	}
}
