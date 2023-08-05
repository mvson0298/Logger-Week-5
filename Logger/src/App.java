
public class App {

	public static void main(String[] args) {
		
		Logger spacedLogger = new SpacedLogger();
		Logger asteriskLogger = new AsteriskLogger();
		
		
			asteriskLogger.log("Hello");
			asteriskLogger.error("Hello");
			spacedLogger.log("Hello");
			spacedLogger.error("Hello");
		
	}

}
