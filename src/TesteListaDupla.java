/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author regis
 */
public class TesteListaDupla {

    public static void main(String[] args) {
        ListaDupla li = new ListaDupla();
        ListaDupla list = new ListaDupla();
        li.inseri(1);
        li.inseri(2);
        li.inseri(9);
        li.inseri(9);
        li.inseri(9);
        li.inseri(9);
        list.inseri(12);
        list.inseri(129);
        System.out.println(li.merge(list));

        // li.insereFim(8);
        //li.inverte();
        System.out.println(li.toString());

    }

   
}
