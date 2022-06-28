package ejerciciosTercerParcial.ejercicio2.exercise;

public class PagoEfectivo implements IPagos{
    public PagoEfectivo() {
    }

    @Override
    public void pagar(int cant) {
        System.out.println("PAGO REALIZADO EN EFECTIVO");
        System.out.println("No cuenta con descuento");
    }
}
