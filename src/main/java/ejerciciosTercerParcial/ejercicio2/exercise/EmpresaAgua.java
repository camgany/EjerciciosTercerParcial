package ejerciciosTercerParcial.ejercicio2.exercise;

public class EmpresaAgua implements IEmpresa{
    private IPagos pagos;
    int precio;
    String nombre;
    String zona;
    public EmpresaAgua(IPagos pagos, int precio, String nombre, String zona) {
        this.pagos = pagos;
        this.precio = precio;
        this.nombre = nombre;
        this.zona = zona;
    }

    @Override
    public void realizarPagos() {
        System.out.println("--------------------------INSTALACION DE AGUA-------------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Zona: "+zona);
        System.out.println("Precio: "+precio);
        pagos.pagar(precio);
    }
}
