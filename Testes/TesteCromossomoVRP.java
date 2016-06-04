package Testes;

import VRP.CromossomoVRP;

public class TesteCromossomoVRP {

    public static void main(String[] args) {
        CromossomoVRP vrp = new CromossomoVRP(9, 4);
//        for (int i = 0; i < 10; i++) {
//            vrp.criaCromossomoAleatorionew();
//            System.out.println(vrp);
//        }
        for (int i = 0; i < 10; i++) {
            vrp.criaCromossomoAleatorionewprob();
            System.out.println(vrp);
        }
    }

}
