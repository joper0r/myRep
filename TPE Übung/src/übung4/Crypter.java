package �bung4;

/**
 * Grundlegendes Interface, um Verschl�sselung durchzuf�hren. Mit
 * Hilfe dieses Interfaces kann man Nachrichten verschl�sseln (�ber die
 * {@link #encrypt(String, String)} Methode) und wieder entschl�sseln
 * (�ber die {@link #decrypt(String, String)} Methode).
 *
 * Der Eingabetext ({@literal message}) darf nur aus den Gro�-Buchstaben A-Z
 * bestehen. Alle anderen Zeichen (einschlie�lich der Leerzeichen) f�hren zu
 * einer entsprechenden Ausnahme.
 *
 * Bei der Entschl�sselung eines Textes, h�ngt es vom Verschl�sselungsverfahren
 * ab, welche Zeichen auftreten d�rfen. Werden Zeichen angegeben, die nicht
 * zum Verfahren passen, werfen die Methoden eine entsprechende Ausnahme.
 *
 * Zwischen den beiden Methoden muss bei gleichem Schl�ssel {@code key}
 * folgendes gelten:
 *
 * {@code text.equals(decrypt(key, encrypt(key, text)) == true}.
 *
 * @author James Blond
 */
public interface Crypter {

    /**
     * Verschl�sselt den gegebenen Text mit dem angegebenen Schl�ssel.
     *
     * @param key Schl�ssel, der verwendet werden soll.
     * @param message Nachricht, die verschl�sselt werden soll.
     *
     * @return verschl�sselter Text.
     * @throws IllegalKeyException Wird geworfen, wenn der Schl�ssel nicht zum
     *           Verschl�sselungsverfahren passt
     * @throws IllegalMessageException Wird geworfen, wenn die Nachricht
     *           unerlaubte Zeichen enth�lt.
     */
    public String encrypt(String key, String message)
            throws IllegalKeyException, IllegalMessageException;

    /**
     * Entschl�sselt den gegebenen Text mit dem angegebenen Schl�ssel.
     *
     * @param key Schl�ssel, der verwendet werden soll.
     * @param cypherText Nachricht, die entschl�sselt werden soll.
     *
     * @return entschl�sselter Text.
     * @throws IllegalKeyException Wird geworfen, wenn der Schl�ssel nicht zum
     *           Verschl�sselungsverfahren passt
     * @throws IllegalMessageException Wird geworfen, wenn der verschl�sselte
     *           Text unerlaubte Zeichen enth�lt.
     */
    public String decrypt(String key, String cypherText)
            throws IllegalKeyException, IllegalMessageException;
}