package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class Message {

	private byte[] payload;

	public Message(byte[] payload) {
		this.payload = payload; // TODO: check for length within boundary
	}

	public Message() {
		super();
	}

	public byte[] getData() {
		return this.payload; 
	}

	public byte[] encapsulate() {
		
		byte[] encoded = null;
		
		// TODO
		// encapulate/encode the payload of this message in the
		// encoded byte array according to message format
		
		for(byte b : payload) {
			encoded[b] = payload[b];
			}
		if (encoded[0] >= 127 && encoded[0] <= 0) {
			return encoded;
		} else {
			throw new UnsupportedOperationException(TODO.method());
		}
	}

	public void decapsulate(byte[] received) {

		// TODO
		// decapsulate the data contained in the received byte array and store it 
		// in the payload of this message
		
		throw new UnsupportedOperationException(TODO.method());
		
	}
}
