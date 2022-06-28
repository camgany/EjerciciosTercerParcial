package ejerciciosTercerParcial.ejercicio5.exercise;


public class Client {
    public static void main (String [] args){

        IAppMovil appAndroid= new AppAndroid();
        appAndroid.login("Laura123","1343sfs");
        appAndroid.logout();
        appAndroid.reportes(new String[]{"Hola","Como","Esta"});


        IAppMovil appEscritorio = new Dispositivo(new AppEscritorio());
        appEscritorio.login("Juan3","34svgrg3");
        appEscritorio.logout();
        appEscritorio.reportes(new String[]{"Maria","Juan"});


    }
}
