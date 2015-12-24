package übung4;

public class CrypterSubstitution implements Crypter {

	private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	@Override
	public String encrypt(String key, String message)
			throws IllegalKeyException, IllegalMessageException {
		// überprüfungen
		if (key.length() != 26) {
			throw new IllegalKeyException();
		}
		if (message.length() < 1) {
			throw new IllegalMessageException();
		}
		// substitutionsalgorhythmus
		String msg = "";
		for (int i = 0; i < message.length(); i++) {
			msg += key.charAt(message.charAt(i) - 65);
		}
		return msg;
	}

	@Override
	public String decrypt(String key, String cypherText)
			throws IllegalKeyException, IllegalMessageException {

		// überprüfungen
		if (key.length() != 26) {
			throw new IllegalKeyException();
		}
		if (cypherText.length() < 1) {
			throw new IllegalMessageException();
		}

		String cypher = "";
		for (int i = 0; i < cypherText.length(); i++) {
			for (int j = 0; j < key.length(); j++) {
				if (cypherText.charAt(i) == key.charAt(j)) {
					cypher += ALPHABET.charAt(j);
				}
			}
		}

		return cypher;
	}



	public static void main(String[] args) throws IllegalKeyException,
			IllegalMessageException {
		CrypterSubstitution a = new CrypterSubstitution();

		System.out.println(a.encrypt("UFLPWDRASJMCONQYBVTEXHZKGI", "ABCDEFG"));
		System.out.println(a.decrypt("UFLPWDRASJMCONQYBVTEXHZKGI", "UFLPWDR"));

		char b = 'A';
		char x = 'T';
		char xor = (char) (b ^ x - 64);
		System.out.println(xor);

	}
}
