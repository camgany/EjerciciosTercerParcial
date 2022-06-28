package ejerciciosTercerParcial.ejercicio7.exercise;

public interface IElement {
    void accept(IVisitor visitor);
    void arreglar();
}