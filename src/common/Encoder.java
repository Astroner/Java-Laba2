package common;

public interface Encoder {
	public String encode(String message, String key);
	public String decode(String message, String key);
}
