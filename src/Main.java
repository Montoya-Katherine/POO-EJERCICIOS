import Entidades.Animal;
import Entidades.Persona;
import Entidades.Vehicle;

public class Main {
    public static void main (String [] args){

       /* Vehicle vehicle = new Vehicle("BMW", 120, "GRIS");
        System.out.println(vehicle);
        vehicle.brand = "VW";
        vehicle.maxSpeed= 120;
        vehicle.color = "rojo";

        System.out.println(vehicle);
        vehicle.brake();
        vehicle.moveOn();


        Animal perro = new Animal();

        perro.raza = "caniche";
        perro.color= " color";
        perro.nombre= " chicho";

        perro.mover();
        perro.comiendo();
        perro.dormir();

        System.out.println(perro);
        System.out.println(" raza " + perro.raza);*/

        Persona persona1 = new Persona();
        persona1.nombre = "Yanet";
        persona1.apellido = "Montoya";
        persona1.edad = 29;

        System.out.println("Soy " + persona1.nombre +" " + persona1.apellido);
        persona1.caminando();
        persona1.hablar();
        persona1.cantar();
        persona1.jugar();

        System.out.println(persona1);



    }
}
