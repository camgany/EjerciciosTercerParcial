package ejerciciosTercerParcial.ejercicio5.exercise;

public class AppEscritorio implements IAppEscritorio{

    @Override
    public void iniciarSesion(String nombre, String password) {
        System.out.println("Iniciando Sesion..........................");
        System.out.println("Nombre: "+nombre);
        System.out.println("Password: "+password);
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando Sesion...........................");
    }

    @Override
    public void generacionDatos(String[] reporte) {
        for (String rep: reporte
        ) {
            System.out.println("Reporte: "+rep);
        }
    }

}
