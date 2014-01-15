
abstract class Builder {

	protected WordCollection wordCollection;

	public void buildCollection() {
		wordCollection = new WordCollection();
	}

	public WordCollection getWordCollection() {
		return wordCollection;
	}

	public abstract void print();
}
