package übung4;

public class CrypterCaesar implements Crypter {

	/**
	 * key = 1 ; möglich verschiebung um key mit mod 26
	 */
	@Override
	public String encrypt(String key, String message)
			throws IllegalKeyException, IllegalMessageException {

		// schlüsselänge 1
		if (key.length() != 1) {
			throw new IllegalKeyException();
		}
		if (message.length() < 1) {
			throw new IllegalMessageException();
		}

		char k = (char) (key.charAt(0) - 64);
		String msg = "";

		// gehe nachricht durch
		for (int i = 0; i < message.length(); i++) {
			char erg = (char) (message.charAt(i) + k);

			if (erg > 'Z') {
				erg -= 26;
			}
			msg += erg;
		}

		return msg;
	}

	@Override
	public String decrypt(String key, String cypherText)
			throws IllegalKeyException, IllegalMessageException {
		//invertierung des schlüssels
		char k = (char) (26 - (key.charAt(0) - 64) + 64);
		String s = Character.toString(k);

		return this.encrypt(s, cypherText);
	}

	public static void main(String[] args) throws IllegalKeyException,
			IllegalMessageException {
		CrypterCaesar c = new CrypterCaesar();
		System.out.println(c.encrypt("C", "DIESISTEINCYPHERTEXT"));
//		System.out.println(c.encrypt("D", "W"));
//		System.out.println(c.decrypt("C", "D"));
		System.out.println(c.decrypt("C", c.encrypt("C", "DIESISTEINCYPHERTEXT")));

	}

}
