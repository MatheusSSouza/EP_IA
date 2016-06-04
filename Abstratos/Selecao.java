package Abstratos;

import java.util.List;

public interface Selecao {
    
    /**
     *
     * @param Populacao: Lista de indivíduos que sofrerão o processo de seleção
     */
    public void setPopulacao(List<Individuo> Populacao);
    
    /**
     *
     * @do Seleciona os indivíduos mais adaptados da população segundo uma metodologia
     */
    public void Seleciona();
    
    /**
     *
     * @return Retorna indivíduos da população que foram selecionados
     */
    public List<Individuo> getSelecionados();
    
}
