package br.com.andrehenriques.estruturadedados.arvoresbinarias;

/**
 *
 * @author Andre Henriques
 */
public class No {

    private int valor;
    private No noEsquerdo;
    private No noDireita;

    public No() {}
    
    public No (int valor){
        super();
        this.valor = valor;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the noEsquerdo
     */
    public No getNoEsquerdo() {
        return noEsquerdo;
    }

    /**
     * @param noEsquerdo the noEsquerdo to set
     */
    public void setNoEsquerdo(No noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    /**
     * @return the noDireita
     */
    public No getNoDireita() {
        return noDireita;
    }

    /**
     * @param noDireita the noDireita to set
     */
    public void setNoDireita(No noDireita) {
        this.noDireita = noDireita;
    }
    
    public String toString(){
        return "No de valor: " + this.valor;
    }

}
