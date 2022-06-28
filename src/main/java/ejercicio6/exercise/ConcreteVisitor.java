package ejerciciosTercerParcial.ejercicio6.exercise;

import java.util.Random;

public class ConcreteVisitor implements IVisitor {

    @Override
    public void appCelular(ConcreteElementCelular celular) {
        System.out.println("<=== Sugerencia: Realizar un mantenmiento preventivo al celular ===>");
        celular.showInfo();
    }

    @Override
    public void appComputadora(ConcreteElementComputadora computadora) {
        if(new Random().nextInt(20) % 2 == 0){
            System.out.println("<=== Sugerencia: Realizar un mantenimiento preventivo a la computadora ===>");
        } else {
            System.out.println("<=== Sugerencia: Realizar un mantenimiento correctivo la computadora ===>");
        }
        computadora.showInfo();
    }

    @Override
    public void appTv(ConcreteElementTelevisor televisor) {
        System.out.println("<=== Sugerencia: Ver las caracteristicas del Televisor ===>");
        televisor.showInfo();
    }
}
