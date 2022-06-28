package ejerciciosTercerParcial.ejercicio1.structure;

public class ConcreteComponent  implements IComponent {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent> operation -> realizando operacion del objeto base");
    }
}
