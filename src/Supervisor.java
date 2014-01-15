
public class Supervisor {

	private Builder builder;

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}   
	
	public WordCollection getCollection(){
	        return builder.getWordCollection();
	}

	public void build() {
		builder.buildCollection();
		builder.print();
	}
}
