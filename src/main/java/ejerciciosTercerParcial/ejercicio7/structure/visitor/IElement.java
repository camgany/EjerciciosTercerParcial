package ejerciciosTercerParcial.ejercicio7.structure.visitor;

public interface IElement {
    void accept(IVisitor visitor);
    String method1();
    String method2();
}