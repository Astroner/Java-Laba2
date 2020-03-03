package common;

import mary.CizarEncoder;

public class CizarAdapter implements Encoder{
	private CizarEncoder wrappee;
	public CizarAdapter(CizarEncoder wrappee){
		this.wrappee = wrappee;
	}
	public String encode(String message, String key) {
		return this.wrappee.encode(message, Integer.parseInt(key));
	}
	public String decode(String message, String key) {
		return this.wrappee.encode(message, Integer.parseInt(key));
	}
	
}
