
public class Booter {
	
	public static void main(String[] args) {
		
		// Z¥RZADCA
		Supervisor supervisor = new Supervisor();
		
		// BUDOWNICZY
		Builder baseBuilder = new WordCollection();
		Builder setBuilder = new WordSetCollection();
		Builder mapBuilder = new WordMapCollection();
		
		System.out.println(" -- BaseBuilder --");
		supervisor.setBuilder(baseBuilder);
		supervisor.build();
		
		System.out.println(" -- SetBuilder --");
		supervisor.setBuilder(setBuilder);
		supervisor.build();
		
		System.out.println(" -- MapBuilder --");
		supervisor.setBuilder(mapBuilder);
		supervisor.build();
		
	}
}
