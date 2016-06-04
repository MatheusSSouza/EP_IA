package Abstratos;

public abstract class Cromossomo {

    private final int cromoSize;
    private int[] cromossomo;

    public Cromossomo(int cromoSize) {
        cromossomo = new int[this.cromoSize = cromoSize];
    }

    public abstract void criaCromossomoAleatorio();

    public abstract Cromossomo criaCopia();

    @Override
    public String toString() {
        String s = "";
        for (int gene : cromossomo) {
            s += gene;
        }
        return s;
    }

    public int getCromoSize() {
        return cromoSize;
    }

    public int getGene(int indice) {
        return cromossomo[indice];
    }

    public int[] getCromossomo() {
        return cromossomo;
    }

    public void setCromossomo(int[] cromossomo) {
        if (this.cromossomo.length == cromossomo.length) {
            this.cromossomo = cromossomo;
        }
    }

    public void setGene(int novoValor, int indice) {
        cromossomo[indice] = novoValor;
    }

}
