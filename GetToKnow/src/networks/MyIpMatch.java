package networks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyIpMatch {

	public static boolean isValidIP(String ipAddr) {

		Pattern ptn = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
		Matcher mtch = ptn.matcher(ipAddr);
		return mtch.find();
	}

	public static void main(String args[]) {

		
		
		System.out.println("10.23.45.12 is valid? " + MyIpMatch.isValidIP("10.23.45.12"));
		System.out.println("10.2a.56.32 is valid? " + MyIpMatch.isValidIP("192.168.51.194"));
		System.out.println("10.23.45 is valid? " + MyIpMatch.isValidIP("10.23.45"));
	}
}