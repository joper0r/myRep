package übung4;

public class Validierung {

	public static boolean nurGroßbuchstaben(String msg) {
		boolean erg = false;
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) >= 65 && msg.charAt(i) <= 90) {
				erg = true;
			} else {
				return false;
			}
		}
		return erg;

	}

}
