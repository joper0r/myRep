package übung4;


public class CrypterNull implements Crypter {
	
	//wirft fehler wenn unerlaubter key | unerlaubte zeichen
	@Override
	public String encrypt(String key, String message) throws IllegalKeyException, IllegalMessageException {
		if(message.length() < 1 && Validierung.nurGroßbuchstaben(message)){
			throw new IllegalMessageException();
			
		}else{
			return message;
		}
		
	}

	@Override
	public String decrypt(String key, String cypherText) throws IllegalKeyException, IllegalMessageException {
		
		return encrypt(key,cypherText);
	}

}
