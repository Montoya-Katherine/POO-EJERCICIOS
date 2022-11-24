package Entidades;

public class Persona {
    public String nombre;
    public String apellido;
    public byte edad;

    public void caminando(){
        System.out.println("Hola, estoy caminando");
    }

    public void cumple(){
        System.out.println("Mi cumpleaños es en enero ");
    }

    public void cantar(){
        System.out.println("Estoy cantando");

    }

    public void hablar(){
        System.out.println("Estoy hablando");

    }

    public void jugar(){
        System.out.println("Estoy jugando");

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
