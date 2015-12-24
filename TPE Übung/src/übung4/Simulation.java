package übung4;

public class Simulation {
	public static void main(String[] args) throws IllegalKeyException, IllegalMessageException {
		
		CrypterCaesar c = new CrypterCaesar();
		String s = "HALLO";
		String p = "C";
		System.out.println(c.encrypt(p, s));
		
		
		
	}

}
