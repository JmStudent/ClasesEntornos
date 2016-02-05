/*
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
public class Agenda {

    Persona[] agenda;
    int posLibre = 0;

    public Agenda(int tam) {
        agenda = new Persona[tam];
    }

    public boolean añadir(Persona contacto) {
        if (posLibre < agenda.length) {
            agenda[posLibre] = contacto;
            posLibre++;
            return true;
        } else {
            return false;
        }
    }

    public String getTelefono(String nom) {
        for (Persona agenda1 : agenda) {
            if (agenda1.getNombre().equals(nom)) {
                return agenda1.getTelefono();
            }
        }
        return null;
    }

    public int buscar(String nom) {
        int c = 0;
        for (Persona i : agenda) {
            if (i.getNombre().equals(nom)) {
                return c;
            } else {
                c++;
            }
        }
        return -1;
        /*
        for (int i = 0; i < agenda.length;) {
            if (agenda[i].getNombre().equals(nom)) {                
                return i;
            } else {
                i++;
            }
        }
        return -1;
         */
    }

    public String getPersona(int pos) {
        return agenda[pos].getNombre();
    }

    public Persona getPersona(String nom) {
        Persona copia;
        if (buscar(nom) == -1) {
            System.out.println("No se puede copiar un contacto que no existe");
            return null;
        } else {
            copia = agenda[buscar(nom)];
            return copia;
        }
    }

    public void modificarTelefono(String nom, String num) {
        /*
        for (Persona contacto : agenda)
            if (contacto.getNombre().equals(nom))
                contacto.setTelefono(num);
         */
        if (buscar(nom) == -1) {
            System.out.println("No se puede modificar el teléfono de un contacto que no existe");
        } else {
            agenda[buscar(nom)].setTelefono(num);
        }
    }
}
