package ejerciciosTercerParcial.ejercicio4.exercise;

public class User {
    private String nombre;
    private String password;
    private int numero;

    public User(String username,String password, int numero) {
        this.nombre = username;
        this.password = password;
        this.numero = numero;
        showInfo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showInfo(){
        System.out.println("---------------------PERSONAL INFORMATION------------------------");
        System.out.println("Username: " + nombre);
        System.out.println("Password: "+password);
        System.out.println("User number: " + numero);
        System.out.println();
    }
}