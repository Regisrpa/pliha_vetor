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
        li.inseri(8);
        li.inseri(5);
        li.inseri(6);
        //list.inseri(1);
        list.inseri(2);
        System.out.println(li.merge(list));
        System.out.println(list.buscar(2));
        System.out.println(li.igual(list));
        li.insereFim(2);
        //li.inverte();
        System.out.println(li.toString());
        System.out.println(li.separa(8));
        li.inverte();
        System.out.println(li.toString());
        System.out.println(li.separa(8));
    }

}
