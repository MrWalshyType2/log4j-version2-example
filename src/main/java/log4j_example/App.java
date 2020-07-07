package log4j_example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	private static final Logger log = LogManager.getLogger();

	public static void main(String[] args) {
		// Configurator.setLevel(log.getName(), Level.DEBUG); // Use to change level
		log.trace("Entered app");
		log.info("Demonstrating info");
		log.warn("WARNING WARNING WARNING");
		log.log(Level.FATAL, "Oh noo...");

		try {
			System.out.println(3 / 0);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}

		divide(10, 0);
	}

	public static int divide(int num1, int num2) {
		try {
			return num1 / num2;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return 0;
	}
}
