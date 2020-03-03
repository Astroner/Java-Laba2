package eugine;

import common.Encoder;

public class XOREncoder implements Encoder{

	public String encode(String str, String secret) {
		return XOR(str, secret);
	}
	
	public String decode(String str, String secret) {
		return XOR(str, secret);
	}
	
	private String XOR(String str, String secret) {
		char[] key = secret.toCharArray();
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			output.append((char) (str.charAt(i) ^ key[i % key.length]));
		}
		return output.toString();
	}
}
