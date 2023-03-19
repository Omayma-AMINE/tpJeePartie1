package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner =new Scanner(new File("config.txt")) ;
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        cDao.getConstructor().newInstance();
        IDao dao = (IDao)cDao.getConstructor().newInstance();

         String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier)cMetier.getConstructor(IDao.class).newInstance(dao);
        Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao);

        System.out.println(metier.calcul());

    }
}
