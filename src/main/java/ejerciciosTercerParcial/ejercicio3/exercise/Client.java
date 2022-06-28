package ejerciciosTercerParcial.ejercicio3.exercise;

public class Client {
    public static void main(String []args){
        Composite folder = new Composite("folder");
        folder.add(new Archivo("archivo","Fue suficiente para convencerme de que si te vas"));
        folder.add(new Archivo("archivo","Lashes and diamonds, ATM machines"));
        folder.add(new Archivo("archivo", "Que cambie el destino y quédate conmigo"));

        Composite folder2 = new Composite("folder2");
        folder2.add(new Archivo("archivo","Llegó la despedida, en contra de nuestra voluntad, hay que decir"));
        folder2.add(new Archivo("archivo","Hasta la muerte aquí estaré esperando"));
        folder2.add(new Archivo("archivo", "Así es la razón pero mi corazón va ganando en esta pelea"));
        Composite unidad = new Composite("Unidad");
        unidad.add(folder);
        unidad.add(folder2);
        unidad.getWords();
    }
}