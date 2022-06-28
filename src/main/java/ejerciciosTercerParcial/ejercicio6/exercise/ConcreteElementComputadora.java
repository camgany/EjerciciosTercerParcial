package ejerciciosTercerParcial.ejercicio6.exercise;

public class ConcreteElementComputadora implements IElement {
    private String modelo;
    private int memoria;
    private Double pantalla;
    private int ram;
    private String sistema;

    public ConcreteElementComputadora(String modelo, int memoria, Double pantalla, String sistema, int ram) {
        this.modelo = modelo;
        this.memoria = memoria;
        this.pantalla = pantalla;
        this.ram = ram;
        this.sistema = sistema;
    }

    @Override
    public void showInfo() {
        System.out.println("--------------------------INFORMACION COMPUTADORA-----------------------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria: " + memoria + " GB");
        System.out.println("Pantalla: " + pantalla + " pulgadas");
        System.out.println("Sistema Operativo: "+sistema);
    }
}
