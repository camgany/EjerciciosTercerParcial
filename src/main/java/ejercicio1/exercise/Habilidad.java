package ejerciciosTercerParcial.ejercicio1.exercise;

public abstract class Habilidad implements IJuego {
    protected IJuego game;

    public Habilidad(IJuego game) {
        this.game = game;
    }

    @Override
    public void crearPersonaje(Personaje personaje) {
        personaje.showInfo();
    }

    @Override
    public void agregarHabilidad(Personaje personaje) {
    }
}