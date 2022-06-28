package ejerciciosTercerParcial.ejercicio4.exercise;

import java.util.ArrayList;
import java.util.List;

public class RealSubject2 implements ISubject {
    private List<User> listaRight;

    public RealSubject2() {
        listaRight = new ArrayList<>();
    }

    @Override
    public void login(User user) {
        listaRight.add(user);
    }

    @Override
    public void userServe() {
        System.out.println("------------------------LISTA DERECHA-----------------------------");
        for (User user: listaRight) {
            System.out.println("El servidor tiene a: "+user.getNombre()+" con el numero " + user.getNumero());
        }
    }
}
