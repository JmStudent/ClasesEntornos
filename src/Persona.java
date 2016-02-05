/*
Crea una clase Persona con dos atributos String: nombre y teléfono, así como los métodos constructores, getters y setters.

Crea una clase Agenda.

 Atributos
    - contactos: array de Personas.
    - siguiente: entero que indica la siguiente posición disponible en la agenda de contactos.

 Métodos
    - constructor: recibe el número de elementos que podrá albergar la matriz contactos.
    - añadir: recibe una persona y la almacena en la siguiente posición disponible de la agenda.
                  Si cabe devuelve true, si no, devuelve false (y por supuesto no intenta guardarlo).
    - getTelefono: recibe el nombre de una persona y devuelve su número de teléfono.
                           Si no lo encuentra devuelve null.

 */
public class Persona {
    
    String nombre, telefono;

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
