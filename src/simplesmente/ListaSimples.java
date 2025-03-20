package simplesmente;

public class ListaSimples {
    private No prim;
    private No ult;
    private int quantNos;

    public ListaSimples(){
        this.prim = null;
        this.ult = null;
        quantNos = 0;
    }

    public No getPrim() {
        return prim;
    }

    public void setPrim(No prim) {
        this.prim = prim;
    }

    public No getUlt() {
        return ult;
    }

    public void setUlt(No ult) {
        this.ult = ult;
    }

    public int getQuantNos() {
        return quantNos;
    }

    public void setQuantNos(int quantNos) {
        this.quantNos = quantNos;
    }

    public boolean eVazia(){
        return (this.prim == null);
    }

    
}
