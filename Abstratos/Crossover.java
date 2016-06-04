package Abstratos;

public interface Crossover {
    
    /**
     *
     * @param ancestralA primeiro ancestral que passará seu genoma aos descendentes
     * @param ancestralB segundo ancestral que passará seu genoma aos descendentes
     */
    public void doCrossover(Individuo ancestralA, Individuo ancestralB);
    
}
