package eugine;

import common.Encoder;

public class XOREncoder implements Encoder{

	public String encode(String message, String secret) {

		return "XOR encode";
	}
	public String decode(String message, String secret) {

		return "XOR decode";
	}
}
