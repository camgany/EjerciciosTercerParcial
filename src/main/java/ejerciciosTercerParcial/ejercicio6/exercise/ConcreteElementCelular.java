package ejerciciosTercerParcial.ejercicio6.exercise;

public class ConcreteElementCelular implements IElement {
    private String modelo;
    private int memoria;
    private Double pantalla;
    private int camara;

    public ConcreteElementCelular(String modelo, int memoria, Double pantalla, int camara) {
        this.modelo = modelo;
        this.memoria = memoria;
        this.pantalla = pantalla;
        this.camara = camara;
    }

    @Override
    public void showInfo() {
        System.out.println("------------------------INFORMACION-------------------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria: " + memoria + " GB");
        System.out.println("Pantalla: " + pantalla + " plg");
        System.out.println("Camara: " + camara + " Mpx");
    }
}
