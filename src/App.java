/**
 * @author Ermanno Oliveri
 * @author Lorenzo Cavallero
 * 
 * @version 17/10/2022
 *
 *          Classe per la gestione di una pila di interi
 */
public class App {

    /**
     * Metodo statico main
     * 
     * @param args args
     */
    public static void main(String[] args) {
        start();
    }

    /**
     * Chiede all'utente di scegliere un'azione da eseguire sullo stack, quindi la
     * esegue
     */
    private static void start() {
        boolean go_on = true;
        int scelta;
        IntegerStack stack;

        stack = new IntegerStack(inizializzaStack());

        while (go_on) {

            scelta = Tools.askInt("Inserire: \n" +
                    "- 1 per visualizzare l'elemento in cima alla stack\n" +
                    "- 2 per aggiungere un elemento alla stack\n" +
                    "- 3 per togliere l' elemento in cima alla stack\n" +
                    "- un qualsiasi altro valore numerico per uscire");

            switch (scelta) {
                case 1:
                    stampaStack(stack);
                    break;
                case 2:
                    if (stack.push(Tools.askInt("Inserire il nuovo elemento: ")))
                        System.out.println("Elemento aggiunto con successo!");
                    else
                        System.out.println("Il vettore è pieno :(, rimuovere un altro elemento e riprovare!");

                    break;
                case 3:
                    if (stack.remove())
                        System.out.println("Elemento rimosso con successo!");
                    else
                        System.out.println("Il vettore è vuoto :(, aggiungere un elemento e riprovare!");

                    break;
                default:
                    go_on = false;
                    break;
            }
        }
    }

    /**
     * Chiede all'utente di inserire un numero, e se il numero è minore o uguale a
     * zero, chiede il
     * utente per inserire un altro numero
     *
     * @return La dimensione dello stack.
     */
    private static int inizializzaStack() {
        int scelta;
        do {
            scelta = Tools.askInt("Inserire la grandezza della stack: ");
            if (scelta <= 0)
                System.out.println("Valore inserito non valido! Riprovare.\n\n");
        } while (scelta <= 0);

        return scelta;
    }

    /**
     * Stampa il contenuto della pila, se non è vuota
     *
     * @param is la pila da stampare
     */
    private static void stampaStack(IntegerStack is) {
        if (is.isEmpty())
            System.out.println("La Stack è vuota!");
        else
            System.out.println("L'elemento in cima è: " + is.pop());
    }

}
