package übung4;

public class CrypterFactory {
	
	Crypter createCrypter(CrypterVerfahren cf){
		switch(cf){
		case NULL: return new CrypterNull();
		case CAESAR: return new CrypterCaesar();
		
		default: return null;
		}
	}

}
