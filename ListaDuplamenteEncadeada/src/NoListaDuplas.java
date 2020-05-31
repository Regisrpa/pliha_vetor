/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author regis
 */
public class NoListaDuplas {

    private int num;
    private NoListaDuplas prox;
    private NoListaDuplas ant;

    public int getNum() {
        return num;
    }

    public NoListaDuplas getProx() {
        return prox;
    }

    public NoListaDuplas getAnt() {
        return ant;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setProx(NoListaDuplas prox) {
        this.prox = prox;
    }

    public void setAnt(NoListaDuplas ant) {
        this.ant = ant;
    }

    @Override
    public String toString() {
        return " " + num;
    }

}
