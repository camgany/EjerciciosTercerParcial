package ejerciciosTercerParcial.ejercicio1.exercise;

public class ConcreteDecoratorEscudo extends Habilidad {

    public ConcreteDecoratorEscudo(IJuego game) {
        super(game);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("------------------CREANDO UN ESCUDO---------------------");
        double porcentajeSubida = personaje.getPuntosDefensa() * 0.35;
        personaje.setPuntosDefensa(personaje.getPuntosDefensa()+porcentajeSubida);
        double porcentajeArmadura = personaje.getPorcentajeArmadura() * 0.10;
        personaje.setPorcentajeArmadura(personaje.getPorcentajeArmadura()+porcentajeArmadura);
        personaje.showInfo();
    }
}
