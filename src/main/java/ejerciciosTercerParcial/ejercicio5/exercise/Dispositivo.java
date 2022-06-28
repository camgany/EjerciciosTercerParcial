package ejerciciosTercerParcial.ejercicio5.exercise;

public class Dispositivo implements IAppMovil{
    private IAppEscritorio dispositivo;

    public Dispositivo(IAppEscritorio dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void login(String nombre, String password) {
        dispositivo.iniciarSesion(nombre,password);
    }

    @Override
    public void logout() {
        dispositivo.cerrarSesion();
    }

    @Override
    public void reportes(String[] reporte) {
        dispositivo.generacionDatos(reporte);
    }
}
