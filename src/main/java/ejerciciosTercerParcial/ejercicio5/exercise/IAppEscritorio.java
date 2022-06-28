package ejerciciosTercerParcial.ejercicio5.exercise;

public interface IAppEscritorio {
    void iniciarSesion(String nombre, String password);
    void cerrarSesion();
    void generacionDatos(String[] reporte);

}
