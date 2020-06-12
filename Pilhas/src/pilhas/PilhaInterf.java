package pilhas;

/**
 *
 * @author regivaldo
 */
public interface PilhaInterf {

    public void push(int v)throws Exception;

    public int pop()throws Exception;

    public int top();

    public boolean vazia();

    public void libera();

}
