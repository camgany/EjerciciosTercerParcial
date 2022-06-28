package ejerciciosTercerParcial.ejercicio2.exercise;

public class EmpresaAlcantarillado implements IEmpresa{
    private IPagos pagos;
    int precio;
    String nombre;
    String zona;
    public EmpresaAlcantarillado(IPagos pagos, int precio, String nombre, String zona) {
        this.pagos = pagos;
        this.precio = precio;
        this.nombre = nombre;
        this.zona = zona;
    }
    @Override
    public void realizarPagos() {
        System.out.println("--------------------------INSTALACION DE ALCANTARILLADO-------------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Zona: "+zona);
        System.out.println("Precio: "+precio);
        pagos.pagar(precio);
    }
}
