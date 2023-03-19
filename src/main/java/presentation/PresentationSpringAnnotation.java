package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","extension","metier");
        IMetier mt = context.getBean(IMetier.class);
        System.out.println("Res = "+mt.calcul());
    }
}
