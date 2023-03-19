package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MetierImpl implements IMetier {

    private IDao dao;

     public MetierImpl(@Qualifier("cws") IDao dao){
          this.dao = dao;
     }
    @Override
    public double calcul() {
        double data=dao.getData();
        return data*11.4;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

