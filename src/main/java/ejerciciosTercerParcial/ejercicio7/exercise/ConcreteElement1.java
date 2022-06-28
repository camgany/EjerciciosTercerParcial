package ejerciciosTercerParcial.ejercicio7.exercise;

public class ConcreteElement1 implements IElement {
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

    public ConcreteElement1(String sistemaOperativo, String ram, String modelo, String marca) {
        this.sistemaOperativo = sistemaOperativo;
        this.ram = ram;
        this.modelo = modelo;
        this.marca = marca;
        kit= new Kit("Destornillador");
    }

    public void showInfo(){
        System.out.println("-------------------------------INFORMACION LAPTOP-----------------------------------");
        System.out.println("Sistema Operativo: "+sistemaOperativo);
        System.out.println("RAM: "+ram);
        System.out.println("MODELO: "+modelo);
        System.out.println("MARCA: "+marca);
    }

    @Override
    public void accept(IVisitor visitor) {
        // logica
        visitor.visitElement1(this);
    }

    @Override
    public void arreglar() {
        System.out.println("---------------------------------ARREGLANDO LA LAPTOP----------------------------------");
        showInfo();
        System.out.println("PRECIO REPARACION: "+kit.getCosto());
    }

}
