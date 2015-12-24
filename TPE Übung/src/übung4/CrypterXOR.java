package übung4;

public class CrypterXOR implements Crypter {

	@Override
	public String encrypt(String key, String message)
			throws IllegalKeyException, IllegalMessageException {

		String k = anpasser(key, message);
		String code = "";
		for (int i = 0; i < message.length(); i++) {
			code += (char) (k.charAt(i) ^ message.charAt(i) - 64);
		}

		return code;
	}

	@Override
	public String decrypt(String key, String cypherText)
			throws IllegalKeyException, IllegalMessageException {
		// TODO Auto-generated method stub
		return null;
	}

	public static String anpasser(String key, String message) {
		String msg = "";

		for (int i = 0; i < message.length(); i++) {
			msg += key.charAt(i % key.length());
		}

		return msg;
	}

	public static void main(String[] args) throws IllegalKeyException,
			IllegalMessageException {
		CrypterXOR a = new CrypterXOR();

		System.out.println(a.encrypt("TPERULES", "ABCDEFGHIJK"));
		System.out.println((char) ('A' ^ 'T' - 64));

	}

}
