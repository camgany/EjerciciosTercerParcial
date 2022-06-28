package ejerciciosTercerParcial.ejercicio1.exercise;

public class ConcreteDecoratorCuracion extends Habilidad {

    public ConcreteDecoratorCuracion(IJuego game) {
        super(game);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("-------------------------SUBIENDO NIVELES DE CURACION--------------------------");
        double porcentajeCuracion = personaje.getPuntosRegeneracion() * 0.80;
        personaje.setPuntosRegeneracion(personaje.getPuntosRegeneracion()+porcentajeCuracion);
        personaje.showInfo();
    }
}
