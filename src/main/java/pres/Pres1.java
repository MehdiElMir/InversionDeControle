package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl(); //Instanciation statique
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);  // Injection des dépendances
        System.out.println("Res :"+metier.calcul());
    }
}
