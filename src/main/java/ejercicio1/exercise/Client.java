package ejerciciosTercerParcial.ejercicio1.exercise;

public class Client {

    public static void main (String []args){
        Personaje player = new Personaje("Laura Bozzo");

        IJuego warcraft = new WarCraft();
        warcraft.crearPersonaje(player);

        warcraft = new ConcreteDecoratorArmas(warcraft);
        warcraft.agregarHabilidad(player);

        warcraft = new ConcreteDecoratorCuracion(warcraft);
        warcraft.agregarHabilidad(player);

        warcraft = new ConcreteDecoratorEscudo(warcraft);
        warcraft.agregarHabilidad(player);

        warcraft = new ConcreteDecoratorArmas(warcraft);
        warcraft.agregarHabilidad(player);

        warcraft = new ConcreteDecoratorCuracion(warcraft);
        warcraft.agregarHabilidad(player);
    }
}
