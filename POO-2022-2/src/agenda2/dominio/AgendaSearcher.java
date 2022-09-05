package agenda2.dominio;

import agenda2.dominio.Persona2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class AgendaSearcher {
    public List<Persona2> personas;

    public AgendaSearcher() {
        this.personas = new ArrayList<>();
    }

    public void agregar(String nombre, String apellido, String sexo, long edad) {
        Persona2 personaAAgregar = new Persona2(nombre, apellido, sexo, edad);
        this.personas.add(personaAAgregar);
    }

    public void eliminar(Persona2 personaAEliminar) {
        boolean eliminoCorrectamente = this.personas.remove(personaAEliminar);

        if (eliminoCorrectamente) {
            System.out.println("Se eliminó a " + personaAEliminar.nombre);
        } else {
            System.out.println("No se eliminó nada. Porque " + personaAEliminar.nombre + " no existe.");
        }
    }

    public void editar(Persona2 personaAEditar) {
        Persona2 c = buscarPersona(personaAEditar.nombre);

        if(c != null) {
            int posicionAReemplazar = this.personas.indexOf(c);
            this.personas.set(posicionAReemplazar, personaAEditar);
        } else {
            System.out.println("La persona a editar no existe.");
        }
    }

    public Persona2 buscarPersona(String nombre) {
        return this.personas.stream()
                .filter(persona -> persona.nombre.equals(nombre))
                .findFirst().orElse(null);
    }

    public List<Persona2> buscarMayorDeEdad() {
        List<Persona2> personasBuscadas = new ArrayList<>();
        for(Persona2 persona: this.personas){
            if (persona.edad>=18){
                personasBuscadas.add(persona);
            }
        }
        return personasBuscadas;
    }

    public List<Persona2> buscarConSexo(String sexo) {
        List<Persona2> personasBuscadas = new ArrayList<>();
        for(Persona2 persona: this.personas){
            if (persona.sexo.equals(sexo)){
                personasBuscadas.add(persona);
            }
        }
        return personasBuscadas;
    }

    public void imprimirAgenda() {
        this.personas.forEach(c -> System.out.println(c.nombre + " - " + c.edad));
    }
}