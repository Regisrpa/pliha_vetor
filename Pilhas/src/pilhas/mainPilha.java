/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas;

/**
 *
 * @author regivaldo
 */
public class mainPilha {

    public static void main(String[] args) throws Exception {
        boolean n;
        PilhaVetor p = new PilhaVetor(5);
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        System.out.println(p.vazia());
        System.out.println(p.toString());
        System.out.println(p.top());
    }

}
