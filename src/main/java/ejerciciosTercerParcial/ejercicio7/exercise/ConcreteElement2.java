package ejerciciosTercerParcial.ejercicio7.exercise;

public class ConcreteElement2 implements IElement {
    String sistemaOperativo;
    String ram;
    String modelo;
    String marca;
    Kit kit;

    public Kit getKit() {
        return kit;
    }

    public void setKit(Kit kit) {
        this.kit = kit;
    }

    public ConcreteElement2(String sistemaOperativo, String ram, String modelo, String marca) {
        this.sistemaOperativo = sistemaOperativo;
        this.ram = ram;
        this.modelo = modelo;
        this.marca = marca;
        kit= new Kit("Soplador");
    }

    public void showInfo(){
        System.out.println("-------------------------------INFORMACION COMPUTADORA-----------------------------------");
        System.out.println("Sistema Operativo: "+sistemaOperativo);
        System.out.println("RAM: "+ram);
        System.out.println("MODELO: "+modelo);
        System.out.println("MARCA: "+marca);
    }

    @Override
    public void accept(IVisitor visitor) {
        // logica
        visitor.visitElement2(this);
    }

    @Override
    public void arreglar() {
        System.out.println("---------------------------------ARREGLANDO LA COMPUTADORA----------------------------------");
        showInfo();
        System.out.println("PRECIO REPARACION: "+kit.getCosto());
    }

}
