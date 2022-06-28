package ejerciciosTercerParcial.ejercicio3.exercise;

import java.util.ArrayList;

public class Composite extends Component {

    private int cant = 0;

    private ArrayList<Component> list = new ArrayList<>();

    public Composite(String type) {
        super(type);
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public int getWords() {
        for (Component comp: list ) {
                cant = cant + comp.getWords();

        }

            System.out.println("Nombre: "+ this.getType() + " Cantidad de Palabras: " + this.cant);


        return cant;
    }
}
