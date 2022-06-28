package ejerciciosTercerParcial.ejercicio2.exercise;

public class PagoTransferencia implements IPagos{
    public PagoTransferencia() {
    }

    @Override
    public void pagar(int cant) {
        System.out.println("PAGO REALIZADO POR TRANSFERENCIA");
        System.out.println("Descuento: 5%");
        double cantFinal = cant - (cant * 0.05);
        System.out.println("Precio con el descuento: "+cantFinal);
    }
}
