package Entidades;

public class Animal {
    public String raza;
    public String color;
    public String nombre;

    public void mover(){
        System.out.println("Me estoy moviendo");
    }

    public void comiendo(){
        System.out.println("Estoy comiendo");
    }

    public void dormir(){
        System.out.println("Estoy DURMIENDO");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
