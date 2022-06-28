package ejerciciosTercerParcial.ejercicio2.exercise;

public class PagoAplicacion implements IPagos{

    public PagoAplicacion() {
    }

    @Override
    public void pagar(int cant) {
        System.out.println("PAGO REALIZADO EN APLICACION");
        System.out.println("Descuento: 10%");
        double cantFinal = cant - (cant * 0.10);
        System.out.println("Precio con el descuento: "+cantFinal);
    }
}
