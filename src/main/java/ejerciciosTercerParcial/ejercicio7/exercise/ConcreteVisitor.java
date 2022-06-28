package ejerciciosTercerParcial.ejercicio7.exercise;

public class ConcreteVisitor implements IVisitor {
    @Override
    public void visitElement1(ConcreteElement1 concreteElement1) {
        concreteElement1.getKit().setCosto(100);
    }

    @Override
    public void visitElement2(ConcreteElement2 concreteElement2) {
        concreteElement2.getKit().setCosto(200);
    }

    @Override
    public void visitElement3(ConcreteElement3 concreteElement3) {
        concreteElement3.getKit().setCosto(300);
    }
}
