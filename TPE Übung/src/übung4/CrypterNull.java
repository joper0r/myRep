package übung4;

public class CrypterNull implements Crypter {

	@Override
	public String encrypt(String key, String message) throws IllegalKeyException, IllegalMessageException {
		
		return null;
	}

	@Override
	public String decrypt(String key, String cypherText) throws IllegalKeyException, IllegalMessageException {
		
		return null;
	}

}
