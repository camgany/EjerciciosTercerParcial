package ejerciciosTercerParcial.ejercicio2.exercise;

public class Client {
    public static void main (String[]args){
        IPagos pagoAplicacion = new PagoAplicacion();
        IPagos pagoEfectivo = new PagoEfectivo();
        IPagos pagoTigoMoney = new PagoTigoMoney();
        IPagos pagoTransferencia = new PagoTransferencia();
        IEmpresa empresaAgua = new EmpresaAgua(pagoTigoMoney,150,"Mario Bautista","Obrajes");
        IEmpresa empresaAlcantarillado = new EmpresaAlcantarillado(pagoEfectivo, 100,"Laura Bozzo","Sopocachi");
        IEmpresa empresaElectrica = new EmpresaAlcantarillado(pagoAplicacion,200,"Juanpa Zurita","Calacoto");
        IEmpresa empresaAgua2 = new EmpresaAgua(pagoTransferencia,250,"Juan Soliz","El Pedrehal");

        empresaAgua.realizarPagos();
        empresaAgua2.realizarPagos();
        empresaAlcantarillado.realizarPagos();
        empresaElectrica.realizarPagos();

    }
}
