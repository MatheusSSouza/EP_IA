package Abstratos;

public abstract class Individuo implements Comparable<Individuo> {

    private Cromossomo c;
    private FuncaoAvaliacao f;

    /**
     *
     * @return Cromossomo do individuo
     */
    public Cromossomo getCromossomo() {
        return c;
    }

    /**
     *
     * @param m Operador de mutação
     */
    public void aplicaMutacao(Mutacao m) {
        m.aplicaMutacao(this);
    }

    @Override
    public int compareTo(Individuo t) {
        return getFitness() - t.getFitness();
    }

    private int getFitness() {
        return f.getFitness();
    }
}
