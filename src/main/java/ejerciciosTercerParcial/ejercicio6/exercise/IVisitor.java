package ejerciciosTercerParcial.ejercicio6.exercise;

public interface IVisitor {
    void appCelular(ConcreteElementCelular celular);
    void appComputadora(ConcreteElementComputadora computadora);
    void appTv(ConcreteElementTelevisor televisor);
}
