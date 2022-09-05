package agenda2.app;

import agenda2.dominio.AgendaSearcher;
import agenda2.dominio.Persona2;
import agenda2.dominio.Persona2;

import java.util.List;

public class AppAgenda {
    public static void main(String[] args) {
        AgendaSearcher agenda2 = new AgendaSearcher();

        agenda2.agregar("Felipe", "Rico", "Masculino", 23L);
        agenda2.agregar("Simon", "Gomez", "Masculino", 23L);
        agenda2.agregar("Mattius", "Cardona", "Masculino", 24L);
        agenda2.agregar("Jose", "Jaramillo", "Masculino", 22L);
        agenda2.agregar("Juan", "Fabioz", "Masculino", 13L);
        agenda2.agregar("Fabiola", "Fabioz", "Femenino", 19L);

        agenda2.imprimirAgenda();
        Persona2 c = agenda2.buscarPersona("Felipe");
        List<Persona2> mujeres = agenda2.buscarConSexo("Femenino");
        List<Persona2> hombres = agenda2.buscarConSexo("Masculino");
        List<Persona2> mayoresEdad = agenda2.buscarMayorDeEdad();


        if (c != null) {
            System.out.println("Persona buscada: " + c.nombre);
        } else {
            System.out.println("Persona no encontrada");
        }
        if (mujeres.size()>0){
            System.out.println("Las mujeres registradas en la agenda son: " );
            for(Persona2 persona: mujeres){
                System.out.println("- " + persona.nombre + " " + persona.apellido);
            }
        }else {
            System.out.println("No hay mujeres registradas en la agenda");
        }
        if (hombres.size()>0){
            System.out.println("Los hombres registradas en la agenda son: " );
            for(Persona2 persona: hombres){
                System.out.println("- " + persona.nombre + " " + persona.apellido);
            }
        }else {
            System.out.println("No hay hombres registrados en la Agenda");
        }
        if (mayoresEdad.size()>0){
            System.out.println("Los mayores de edad registrados en la agenda son: " );
            for(Persona2 persona: mayoresEdad){
                System.out.println("- " + persona.nombre + " " + persona.apellido);
            }
        }else {
            System.out.println("No hay mayores de edad registrados en la agenda");
        }
    }
}
