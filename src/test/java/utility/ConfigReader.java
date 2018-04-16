package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	static Properties pr;

	public static void loadConfig()

	{
		try {

			pr = new Properties();
			FileInputStream fis = new FileInputStream(new File("./Config.property"));
			pr.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String readConfig(String key) {
		// loadConfig();
		return pr.getProperty(key);
	}

}
