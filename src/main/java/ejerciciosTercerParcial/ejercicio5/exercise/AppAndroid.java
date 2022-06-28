package ejerciciosTercerParcial.ejercicio5.exercise;

public class AppAndroid implements  IAppMovil{
    @Override
    public void login(String nombre, String password) {
        System.out.println("Bienvenido: "+nombre);
        System.out.println("Contrasena: "+password);
    }

    @Override
    public void logout() {
        System.out.println("Logout.................");
    }

    @Override
    public void reportes(String[] reporte) {
        for (String rep: reporte
             ) {
            System.out.println("Reporte: "+rep);
        }
    }
}
