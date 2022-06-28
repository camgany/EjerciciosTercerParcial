package ejerciciosTercerParcial.ejercicio7.exercise;

public class Client {

    public static void main(String[]args){
        ConcreteVisitor visitorGeneraReports= new ConcreteVisitor();


        ConcreteElement1 element1= new ConcreteElement1("Windows","64GB","ASUS TUF DASH F15","ASUS");
        ConcreteElement2 element2= new ConcreteElement2("IOS","32 GB","IMAC 12","APPLE");
        ConcreteElement3 element3 = new ConcreteElement3("Samsung","16 GB","J 15","Samsung");

        element1.arreglar();
        element2.arreglar();
        element3.arreglar();

    }
}