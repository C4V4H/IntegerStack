import java.util.Scanner;
import java.util.Random;

/**
 * @author Cavallero Lorenzo - Oliveri Ermanno
 *
 * @desciption Class Tools, applica le classi esterne per semplifocare il
 *             programma.
 */
public class Tools {

    /**
     * Utilizza la classe Scanner per fare inserire i dati all'utente
     * 
     * @param richiesta Stringa stampata
     * @return Stringa risciesta
     */
    public static String askString(String richiesta) {
        Scanner in = new Scanner(System.in);
        System.out.println(richiesta);
        return in.nextLine();
    }

    /**
     * Utilizza la classe Scanner per fare inserire i dati all'utente
     *
     * @param richiesta Stringa stampata
     * @return Integer risciesta
     */
    // public static Integer askInt(String richiesta) {
    // Scanner in = new Scanner(System.in);
    // System.out.println(richiesta);
    // try {
    // return Integer.parseInt(in.nextLine());
    // } catch (Exception e) {
    // System.out.println("Valore errato.");
    // return null;
    // }
    // }

    /**
     * Richiede all'utente un numero intero e se l'utente non inserisce un numero
     * intero, lo chiede di nuovo
     *
     * @param richiesta la domanda che vuoi porre all'utente
     * @return Il metodo askInt() restituisce un intero.
     */
    public static int askInt(String richiesta) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(richiesta);
            try {
                return Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.println("Valore errato. Riprovare");
            }
        }

    }

    /**
     * Utilizza la classe Random per generare un numero randomico tra i due apici
     * forniti.
     * 
     * @param min numero minimo
     * @param max numero massimo
     * @return numero randomico generato tra gli apici forniti
     */
    public static int rand(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }

}