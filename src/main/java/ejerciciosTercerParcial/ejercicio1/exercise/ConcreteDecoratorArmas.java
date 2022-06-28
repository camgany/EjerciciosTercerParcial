package ejerciciosTercerParcial.ejercicio1.exercise;

import java.util.Random;

public class ConcreteDecoratorArmas extends Habilidad {

    private String[] armas = {"Espada", "Hacha", "Escopeta"};

    public ConcreteDecoratorArmas(IJuego game) {
        super(game);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("--------------------UNIENDO ARMA--------------------");
        int typeAnimal = new Random().nextInt(armas.length);
        personaje.setArmas(armas[typeAnimal]);
        double porcentajeSubida = personaje.getPuntosAtaque() * 0.30;
        personaje.setPuntosAtaque(personaje.getPuntosAtaque()+porcentajeSubida);
        int subidaNivel = personaje.getNivel() * 2;
        personaje.setNivel(subidaNivel);
        personaje.showInfo();
    }
}