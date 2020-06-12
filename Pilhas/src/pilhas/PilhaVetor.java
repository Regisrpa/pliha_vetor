package pilhas;

/**
 *
 * @author regivaldo
 */
public class PilhaVetor implements PilhaInterf {

    private int[] vet;
    private int tam;
    private int n;

    public PilhaVetor(int tam) {
        this.vet = new int[tam];
        this.tam = tam;
        this.n = 0;
    }

    @Override
    public void push(int v) throws Exception {
        if (n == tam) {
            throw new Exception("erro");
        } else {
            this.vet[n] = v;
            this.n++;
        }
    }

    @Override
    public int pop() throws Exception {
        int v;
        if (this.vazia()) {
            throw new Exception("errou vazia!");
        }
        v = this.vet[n - 1];
        this.n--;

        return v;
    }

    @Override
    public int top() {
        return this.vet[n - 1];
    }

    @Override
    public boolean vazia() {
        return n == 0;
    }

    @Override
    public void libera() {
        this.n = 0;
    }

    public String toString() {
        String s = "";
        if (vazia()) {
            return "pilha vazia";
        } else {
            s = s + "Pilha: ";
            for (int i = 0; i < this.n; i++) {
                s = s + this.vet[i] + " ";
            }
        }

        return s;
    }

}
