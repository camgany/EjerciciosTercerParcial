package ejerciciosTercerParcial.ejercicio2.exercise;

public class PagoTigoMoney implements IPagos{
    public PagoTigoMoney() {
    }

    @Override
    public void pagar(int cant) {
        System.out.println("PAGO REALIZDO POR TIGO MONEY");
        System.out.println("Descuento: 2%");
        double cantFinal = cant - (cant * 0.02);
        System.out.println("Precio con el descuento: "+cantFinal);
    }
}
