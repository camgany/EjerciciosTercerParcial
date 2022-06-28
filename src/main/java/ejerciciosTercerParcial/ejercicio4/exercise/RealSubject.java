package ejerciciosTercerParcial.ejercicio4.exercise;

import java.util.ArrayList;
import java.util.List;

public class RealSubject implements ISubject {
    private List<User> listLeft;

    public RealSubject() {
        listLeft = new ArrayList<>();
    }

    @Override
    public void login(User user) {
        listLeft.add(user);
    }

    @Override
    public void userServe() {
        System.out.println("------------------------LISTA IZQUIERDA-----------------------------");
        for (User user: listLeft) {
            System.out.println("El servidor tiene a: "+user.getNombre()+" con el numero " + user.getNumero());
        }
    }
}
