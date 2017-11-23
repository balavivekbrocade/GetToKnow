package networks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidator {

	private static Pattern pattern;
	private static Matcher matcher;

	private static final String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	public IPAddressValidator() {
		System.out.println("Call cons");
		pattern = Pattern.compile(IPADDRESS_PATTERN);
	}

	/**
	 * Validate ip address with regular expression
	 * 
	 * @param ip
	 *            ip address for validation
	 * @return true valid ip address, false invalid ip address
	 */
	public static boolean validate(final String ip) {
		matcher = pattern.matcher(ip);
		return matcher.matches();
	}

	public static void main(String[] args) {
		String myIPaddress = "192.168.1.194";

		System.out.println("Validate IP : " + validate(myIPaddress));

	}

}
