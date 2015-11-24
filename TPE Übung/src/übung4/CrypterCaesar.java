package übung4;

public class CrypterCaesar implements Crypter {

	@Override
	public String encrypt(String key, String message) throws IllegalKeyException, IllegalMessageException {
		if(key.length() != 1){
			throw new IllegalKeyException();
		}else if(message.length() < 1){
			throw new IllegalMessageException();
		}else {
			for(int i = 0; i < message.length(); i++){
//				char erg = message.charAt(i) + key.toCh - 64;
			}
		}
		return null;
	}

	@Override
	public String decrypt(String key, String cypherText) throws IllegalKeyException, IllegalMessageException {
		// TODO Auto-generated method stub
		return null;
	}

}
