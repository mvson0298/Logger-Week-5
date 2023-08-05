
public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
	
		String asterisks = "***";
		String messageWithAsterisks = asterisks + log + asterisks;
			System.out.println(messageWithAsterisks);
		
	}

	@Override
	public void error(String error) {
		
		String errorMessage = "***Error: " + error + "***";
		int boxWidth = errorMessage.length();
		
			System.out.println("*".repeat(boxWidth));
			System.out.println(errorMessage);
			System.out.println("*".repeat(boxWidth));
	}

}
