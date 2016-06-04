package VRP;

import Abstratos.Cromossomo;
import java.util.ArrayList;
import java.util.Random;

public class CromossomoVRP extends Cromossomo {

    private final int clientes;
    private final int veiculos;

    public CromossomoVRP(int clientes, int veiculos) {
        super(clientes + veiculos - 1);
        this.clientes = clientes;
        this.veiculos = veiculos;
    }

    @Override
    public void criaCromossomoAleatorio() {
        Random R = new Random();
        ArrayList<Integer> listaClientes, listaVeiculos;
        listaClientes = new ArrayList<>();
        listaVeiculos = new ArrayList<>();
        for (int i = 0; i < clientes; i++) {
            listaClientes.add(i + 1);
        }
        for (int i = 0; i < veiculos - 1; i++) {
            listaVeiculos.add(i + clientes + 1);
        }
        for (int i = 0; i < getCromoSize() - 1; i++) {
            int k = R.nextInt() % 2;
            if (k == 0 && listaVeiculos.size() > 0) {
                setGene(listaVeiculos.remove(Math.abs(R.nextInt()) % listaVeiculos.size()), i);
            } else {
                setGene(listaClientes.remove(Math.abs(R.nextInt()) % listaClientes.size()), i);
            }
        }
    }
    
    public void criaCromossomoAleatorionew() {
        Random R = new Random();
        ArrayList<Integer> listaClientes, listaVeiculos;
        listaClientes = new ArrayList<>();
        listaVeiculos = new ArrayList<>();
        for (int i = 0; i < clientes; i++) {
            listaClientes.add(i+1);
        }
        for (int i = 0; i < veiculos - 1; i++) {
            listaVeiculos.add(i + clientes +1);
        }
        for (int i = 0; i < getCromoSize() ; i++) {
            int k = R.nextInt() % 2;
            if (k == 0 && listaVeiculos.size() > 0) {
                setGene(listaVeiculos.remove(Math.abs(R.nextInt()) % listaVeiculos.size()), i);
                System.out.print(i+ ", ");
            } else {
                setGene(listaClientes.remove(Math.abs(R.nextInt()) % listaClientes.size()), i);
            }
        }
    }
    
    public void criaCromossomoAleatorionewprob() {
        Random R = new Random();
        ArrayList<Integer> listaClientes, listaVeiculos;
        listaClientes = new ArrayList<>();
        listaVeiculos = new ArrayList<>();
        for (int i = 0; i < clientes; i++) {
            listaClientes.add(i+1);
        }
        for (int i = 0; i < veiculos - 1; i++) {
            listaVeiculos.add(i + clientes +1);
        }
        for (int i = 0; i < getCromoSize() ; i++) {
            int k = R.nextInt() % (listaVeiculos.size()+listaClientes.size()-1);
            System.out.println(R.nextInt()% (listaVeiculos.size()+listaClientes.size()-1) );
            if (k <listaVeiculos.size()-1&& listaVeiculos.size() > 0) {// 
                setGene(listaVeiculos.remove(Math.abs(R.nextInt()) % listaVeiculos.size()), i);
                System.out.print(i+ ", ");
            } else {
                setGene(listaClientes.remove(Math.abs(R.nextInt()) % listaClientes.size()), i);
            }
        }
    }
    
//    public void criaCromossomoAleatorionewnew() {
//        Random R = new Random();
//        ArrayList<Integer> listaClientes, listaVeiculos;
//        listaClientes = new ArrayList<>();
//        listaVeiculos = new ArrayList<>();
//        for (int i = 0; i < clientes; i++) {
//            listaClientes.add(i+1);
//        }
//        for (int i = 0; i < veiculos - 1; i++) {
//            listaVeiculos.add(i + clientes +1);
//        }
//        
//        setGene(listaClientes.remove(Math.abs(R.nextInt()) % listaClientes.size()), getCromoSize()-1);
//        
//        for (int i = 0; i < getCromoSize() -1; i++) {
//            int k = R.nextInt() % 2;
//            if (k == 0 && listaVeiculos.size() > 0) {
//                setGene(listaClientes.remove(Math.abs(R.nextInt()) % listaClientes.size()), i++);
//                setGene(listaVeiculos.remove(Math.abs(R.nextInt()) % listaVeiculos.size()), i);
//            } else {
//                setGene(listaClientes.remove(Math.abs(R.nextInt()) % listaClientes.size()), i);
//            }
//        }
//    }

    public int getClientes() {
        return clientes;
    }

    public int getVeiculos() {
        return veiculos;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < getCromoSize(); i++) {
            s += getGene(i);
            if (i != getCromoSize() - 1) {
                s += '-';
            }
        }
        return s;
    }

    @Override
    public Cromossomo criaCopia() {
        Cromossomo X = new CromossomoVRP(getClientes(), getVeiculos());
        X.setCromossomo(getCromossomo());
        return X;
    }


}
