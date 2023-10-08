package metier;

import dao.DaoImpl;
import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; //Couplage Faible

    @Override
    public double calcul() {
        double data = dao.getData();
        double res = data*11.4;
        return res;
    }

    /**
     * Pour permettre d' injecter dans la la variable dao
     * un objet d' une classe qui implemente l' interface IDao
     * @param dao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
