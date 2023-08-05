
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		
		StringBuilder spacedString = new StringBuilder();
			for (int i = 0; i < log.length(); i++) {
			spacedString.append(log.charAt(i)).append(" ");
		}
			System.out.println(spacedString.toString().trim());
		
	}

	@Override
	public void error(String error) {
		
		StringBuilder spacedString = new StringBuilder();
		
		int length = error.length();
		for (int i = 0; i < length; i++) {
			
			spacedString.append(error.charAt(i));
			if (i < length - 1) {
				spacedString.append(" ");
			}
		
		}
		System.out.println("ERROR: " + spacedString);
			}

	}

