package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("version Base de données");
        double data=34;
        return data;
    }
}
