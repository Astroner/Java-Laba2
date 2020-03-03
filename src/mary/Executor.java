package mary;

import common.Encoder;

public class Executor implements Executable{
	private Encoder encoder;
	private String message;
	private String key;
	public Executor(Encoder encoder, String message, String key){
		this.encoder = encoder;
		this.message = message;
		this.key = key;
	}
	public void run() {
		String crypt = this.encoder.encode(message, key);
		System.out.println("Encoded: " + crypt);
		System.out.println("Decoded: " + this.encoder.decode(crypt, key));
	}
}
