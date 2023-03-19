package extension;

import dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("cws")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version Web Service");
        double data = 55;
        return data;
    }
}
