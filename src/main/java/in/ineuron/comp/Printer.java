package in.ineuron.comp;

public class Printer {
	
	private static Printer INSTANCE = null;
	static {
		System.out.println("Printer.class file is loading");
	}
	
	private Printer() {
		
	}
	public Printer getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}
}
