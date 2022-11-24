package Entidades;

public class Vehicle {
    public String brand;//marca
    public int maxSpeed;
    public String color;

    public Vehicle(String brand, int maxSpeed, String color) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void moveOn(){ // mover adelante
        System.out.println( brand + " se mueve a: " + maxSpeed  );

    }

    public void brake(){// frena
        System.out.println( "EL " + brand + " esta detenido");

    }

    @Override
    public String toString() {
        return "Caracteristica del Vehiculo: " +
                "marca='" + brand + '\'' +
                ", maxVelocidad=" + maxSpeed +
                ", color='" + color ;
    }
}
