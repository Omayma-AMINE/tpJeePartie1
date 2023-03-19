package presentation;

import dao.DaoImpl;
import extension.DaoImpl2;
import metier.MetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier= new MetierImpl(dao);
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
