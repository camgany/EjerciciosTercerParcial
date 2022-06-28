package ejerciciosTercerParcial.ejercicio6.exercise;

public class Client {
    public static void main(String[] args){
        IVisitor app = new ConcreteVisitor();

        ConcreteElementCelular celular = new ConcreteElementCelular("IPhone X", 16, 10.5, 250);
        ConcreteElementComputadora computadora = new ConcreteElementComputadora("Asus TUF DASH F15", 500, 15.6, "Windows",64 );
        ConcreteElementTelevisor televisor = new ConcreteElementTelevisor("LG TV",100, 4, true);

        app.appCelular(celular);
        app.appComputadora(computadora);
        app.appTv(televisor);
    }
}
