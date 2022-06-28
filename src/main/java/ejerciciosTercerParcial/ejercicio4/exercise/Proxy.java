package ejerciciosTercerParcial.ejercicio4.exercise;

public class Proxy implements ISubject {
    private ISubject servidor1;
    private ISubject servidor2;

    public Proxy() {
        servidor1 = new RealSubject();
        servidor2 = new RealSubject2();
    }

    public void login(User user){
        if(user.getNumero() % 2 == 0){
            servidor1.login(user);
        } else {
            servidor2.login(user);
        }
    }

    @Override
    public void userServe() {
        servidor1.userServe();
        servidor2.userServe();
    }
}
