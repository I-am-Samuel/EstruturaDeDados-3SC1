package simplesmente;

import dados.Item;

public class ListaSimples {
    private No prim;
    private No ult;
    private int quantNos;

    public ListaSimples() {
        this.prim = null;
        this.ult = null;
        quantNos = 0;
    }

    public No getPrim() {
        return prim;
    }

    public void setPrim(No novoNo) {
        this.prim = novoNo;
    }

    public No getUlt() {
        return ult;
    }

    public void setUlt(No novoNo) {
        this.ult = novoNo;
    }

    public int getQuantNos() {
        return quantNos;
    }

    public void setQuantNos(int novoValor) {
        this.quantNos = novoValor;
    }

    public boolean eVazia() {
        return (this.prim == null);
    }

    public void inserirUltimo(Item elem) {
        No novoNo = new No(elem);
        if (eVazia()) {
            this.prim = novoNo;
        } else {
            this.ult.setProx(novoNo);
        }
        this.ult = novoNo;
        quantNos++;
    }

    public No pesquisarNo(int chave) {
        No atual = this.prim;
        while ((atual != null) && (atual.getInfo().getChave() != chave)) {
            atual = atual.getProx();
        }
        return atual;
    }

    public boolean removerNo(int x) {
        if (this.eVazia()) {
            return false;
        } else {
            if (this.prim.getInfo().getChave() == x) {
                if (this.prim.getProx() == null) { // se for �nico n� da lista
                    this.ult = null;
                }
                // remover o primeiro n� da lista
                this.prim = this.prim.getProx();
            } else {
                No atual = this.prim;
                while ((atual.getProx() != null) &&
                        (atual.getProx().getInfo().getChave() != x)) {
                    atual = atual.getProx();
                }
                if (atual.getProx() == null) {// n�o achou o valor na lista
                    return false;
                } else {
                    if (atual.getProx() == this.ult) { // se for o �ltimo n�
                        atual.setProx(null);
                        this.ult = atual;
                    } else { // remove o n� no meio da lista
                        atual.setProx(atual.getProx().getProx());
                    }
                }
            }
            this.quantNos--;
            return true;
        }
    }

    // mostra todo o conte�do da lista
    public String toString() {
        String msg = "";
        No atual = this.prim;
        while (atual != null) {
            msg += atual.getInfo().getChave() + "\n";
            atual = atual.getProx();
        }
        return msg;
    }

}
