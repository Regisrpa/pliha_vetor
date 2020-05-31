
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author regis
 */
public class ListaDupla {

    private NoListaDuplas prim;
    private NoListaDuplas ult;

    public ListaDupla() {
        this.prim = null;
    }

    public void inseri(int num) {
        NoListaDuplas novo = new NoListaDuplas();
        novo.setNum(num);
        novo.setProx(prim);
        novo.setAnt(null);
        if (prim != null) {
            prim.setAnt(novo);
        }
        prim = novo;
    }

    public String toString() {
        String s = "lista ";
        NoListaDuplas lista = prim;
        if (prim == null) {
            System.out.println("Lista vazia!");
        }
        while (lista != null) {
            s = s + lista.toString();
            lista = lista.getProx();
        }
        return s;
    }

    public NoListaDuplas buscar(int num) {
        NoListaDuplas lista = prim;
        if(this.vazia()){
        }
            
        while (lista != null) {
            if (lista.getNum() == num) {
                System.out.print("Encontrou: ");
                return lista;
            }
            lista = lista.getProx();
        }
        return null;
    }

    public void retirar(int num) {
        NoListaDuplas lista = buscar(num);
        NoListaDuplas ant;
        NoListaDuplas prox;
        if (lista == null) {
            return;
        }
        if (prim == lista) {
            prim = lista.getProx();
        } else {
            ant = lista.getAnt();
            prox = lista.getProx();
            ant.setProx(prox);
        }
        if (lista.getProx() != null) {
            ant = lista.getAnt();
            prox = lista.getProx();
            prox.setAnt(ant);
        }
    }

    public boolean vazia() {
        NoListaDuplas lista = prim;
        if (lista == null) {
            return true;
        } else {
            return false;
        }
    }

    public void libera() {
        prim = null;
    }

    public boolean igual(ListaDupla li) {
        NoListaDuplas p = prim;
        if (p == null && li.prim == null) {
            return true;
        }
        if(p==null ||li.prim==null){
            return false;
        }
        if ((p == null && li.prim!= null)
                || p != null && li.prim == null) {
            return false;
        }
        while (p != null) {
            if (p.getNum() != li.prim.getNum()) {
                return false;
            }
            li.prim = li.prim.getProx();
            p = p.getProx();
        }
        return true;
    }

    public void insereFim(int valor) {
        NoListaDuplas novo = new NoListaDuplas();
        NoListaDuplas p = prim;

        novo.setNum(valor);
        novo.setProx(null);
        if (prim == null) {
            novo.setAnt(null);
            prim = novo;
        } else {
            while (p.getProx() != null) {
                p = p.getProx();
            }
            p.setProx(novo);
            novo.setAnt(p);
        }
    }

    public ListaDupla merge(ListaDupla li) {
        NoListaDuplas lista1 = prim;
        NoListaDuplas lista2 = li.prim;
        ListaDupla lp = new ListaDupla();
        while (lista1 != null && lista2 != null) {
            lp.insereFim(lista1.getNum());

            lp.insereFim(lista2.getNum());
            lista1 = lista1.getProx();
            lista2 = lista2.getProx();
        }
        while (lista1 != null) {
            lp.insereFim(lista1.getNum());
            lista1 = lista1.getProx();
        }
        while (lista2 != null) {
            lp.insereFim(lista2.getNum());
            lista2 = lista2.getProx();
        }
        return lp;
    }

    public ListaDupla separa(int v) {
        NoListaDuplas p = prim;
        ListaDupla li = new ListaDupla();
        if (this.vazia()) {
            return null;
        }
        while (p != null) {
            if (p.getNum() == v) {
                while (p.getProx() != null) {
                    p = p.getProx();
                    li.insereFim(p.getNum());
                }
                return li;
            }
            p = p.getProx();
        }
        return null;
    }

    public void inverte() {
        NoListaDuplas p = prim;
        NoListaDuplas aux = prim;
        
        ListaDupla li = new ListaDupla();
        while (p != null) {
            li.inseri(p.getNum());
            p = p.getProx();
            prim = li.prim;
        }

    }
}
