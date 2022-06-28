package ejerciciosTercerParcial.ejercicio4.exercise;

public class Client {
    public static void main(String[] args){
        ISubject proxy = new Proxy();

        proxy.login(new User("CameronDallas", "3254sdfe34",1));
        proxy.login(new User("MarioBautista", "3h45h3vg4",2));
        proxy.login(new User("JuanpaZurita","4hb5jh5v6", 3));
        proxy.login(new User("ErickRubin","4hbh5v32g", 4));
        proxy.login(new User("ArianaGrande","jj4b5jb", 5));
        proxy.login(new User("JustinBieber","4b5j4b5b", 6));


        proxy.userServe();

    }
}
