package ejerciciosTercerParcial.ejercicio6.exercise;

public class ConcreteElementTelevisor implements IElement {
    private String modelo;
    private int resolucion;
    private int puertos;
    private boolean smart;

    public ConcreteElementTelevisor(String modelo, int resolucion, int puertos, boolean smart) {
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.puertos = puertos;
        this.smart = smart;
    }

    @Override
    public void showInfo() {
        System.out.println("--------------------------INFORMACION TELEVISOR---------------------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Resolución: " + resolucion + " Mpx");
        System.out.println("Puertos: "+puertos);
        System.out.println("SmartTV: "+smart);
    }
}