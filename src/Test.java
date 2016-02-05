public class Test {

    public static void main(String[] args) {
        //pruebas de entornos
        Agenda agenda = new Agenda(2);
        Persona persona1 = new Persona("Juan", "956125634");
        Persona persona2 = new Persona("Jose", "976453627");
        
        agenda.añadir(persona1);
        agenda.añadir(persona2);
        
        String buscado = "Jose";
        agenda.modificarTelefono(buscado, "8745987345");
        System.out.printf("El telefono de %s es %s \n", buscado, agenda.getTelefono(buscado));
        
    }
    
}
