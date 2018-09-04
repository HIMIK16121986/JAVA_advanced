package less01;

import java.util.Locale;
import java.util.ResourceBundle;

public class Inter {

	public static void main(String[] args) {
		String language;
		String country;
		if (args.length > 1) {
			language = args[0];
			country = args[1];
		} else {
			language = "de";
			country = "DE";
		}
		Locale currentLocale = new Locale(language, country);
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		System.out.println(messages.getString("say"));
	}

}
