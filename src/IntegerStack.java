import java.util.ArrayList;

/**
 * @author Ermanno Oliveri
 * @author Lorenzo Cavallero
 * 
 * @version 17/10/2022
 *
 *          Classe per la realizzazione di una pila di interi
 */
public class IntegerStack {

    private ArrayList<Integer> stack;
    private final int MAX;

    /**
     * Metodo costruttore di IntegerStack
     * 
     * @param size dimensione dello stack
     */
    public IntegerStack(int MaxSize) {
        MAX = MaxSize;
        stack = new ArrayList<Integer>(MAX);
    }

    /**
     * Se lo stack all'indice specificato non è nullo, restituisce lo stack
     * all'indice specificato. In caso contrario, restituisce
     * nullo
     *
     * @param index l'indice dell'elemento che vuoi recuperare
     * @return Il valore dell'indice nell'array dello stack.
     */
    public Integer get(int index) {
        if (index < stack.size())
            return stack.get(index);
        return null;
    }

    /**
     * Se lo stack è vuoto, restituisce true. In caso contrario, restituisce false
     *
     * @return Il metodo isEmpty() restituisce un valore booleano.
     */
    public boolean isEmpty() {
        for (Integer i : stack) {
            if (i != null)
                return false;
        }
        return true;
    }

    /**
     * Controlla se lo stack è pieno.
     *
     * @return Il metodo isFull() restituisce un valore booleano.
     */
    public boolean isFull() {
        return stack.size() == MAX;
    }

    // idea bellissima non funzionale, ma comunque bellissima
    // public int size() {
    // if (isEmpty()) {
    // return 0;
    // }
    // for (int i = stack.length - 1; i >= 0; i--) {
    // if (stack[i] != null) {
    // return i + 1;
    // }
    // }
    // return 0;
    // }

    /**
     * Se lo stack è pieno, restituisce false, altrimenti aggiungi il nuovo elemento
     * in cima allo stack e
     * ritorna vero
     *
     * @param nuovo il valore da inserire nello stack
     * @return Il metodo restituisce un valore booleano.
     */
    public boolean push(int nuovo) {
        if (isFull()) {
            return false;
        }

        stack.add(nuovo);
        return true;
    }

    /**
     * Restituisce il valore in cima alla stack
     * 
     * @return top value
     */
    public Integer pop() {
        return stack.get(stack.size() - 1);
    }

    /**
     * Se lo stack non è vuoto e l'indice rientra nei limiti dello stack, rimuove
     * l'elemento
     * all'indice specificato
     *
     * @param index l'indice dell'elemento da rimuovere
     * @return Il metodo restituisce un valore booleano.
     */
    public boolean remove() {
        if (isEmpty())
            return false;
        stack.remove(stack.size() - 1);
        return true;
    }

    /**
     * Restituisce la lunghezza dello stack.
     *
     * @return La lunghezza dello stack.
     */
    public int totalLenght() {
        return stack.size();
    }

    /**
     * Restituisce una stringa contenente il contenuto dello stack
     *
     * @return L'indice dell'elemento e l'elemento stesso.
     */
    public String toString() {
        String ris = "";
        for (int i = 0; i < stack.size(); i++) {
            ris += i + ": " + stack.get(i) + "; ";
        }
        return ris;
    }
}