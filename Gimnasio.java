//Importamos la clase Scanner para utilizar la lectura de introducción de datos por parte del usuario en consola
//Importamos la clase de ArrayList para alamacenar información del usuario
import java.util.Scanner;
import java.util.ArrayList;


// Añadimos clase Usuario para almacenar la información del usuario
class Usuario {
    String nombre;
    int claveAcceso;
    String [] actividades;

    public Usuario(String nombre, int claveAcceso, String[] actividades){
        this.nombre = nombre;
        this.claveAcceso = claveAcceso;
        this.actividades = actividades;
    }
    //Añadimos una función para mostrar información del usuario
    public void mostrarInfoUsuario(String nombreGimnasio){
        System.out.println("--Su información--");
        System.out.println("Usuario: " + nombre) ;
        System.out.println("Clave de Acceso: " + claveAcceso);
        System.out.println("Su gimnasio: " + nombreGimnasio);
        System.out.println("Actividades a las que asistes: ");{
            for (String actividad: actividades){
                System.out.print(actividad + " - ");
            }
        System.out.println();
        }
    }
}
public class Gimnasio {
    //Cambiamos "nombre" por nombreGimnasio", para evitar posibles confusiones entre el nombre de usuario y nombre del gimnasio
    private String nombreGimnasio;
    //Añadimos más actividades al gimnasio: "Spinning, Crossfit, Pilates, Acceso libre musculación "
    private String[] actividades = {"Yoga", "Boxeo", "Funcional", "Sppining", "Crossfit", "Pilates", "Acceso libre musculación"};
    // Añadimos ArrayList para almacenar a los usuarios
    private ArrayList<Usuario> usuarios;

    public Gimnasio(String nombreGimnasio) {
        this.nombreGimnasio = nombreGimnasio;
        this.usuarios = new ArrayList<>();
    }
    
    public void mostrarActividades() {
        System.out.println("Actividades disponibles en el gimnasio " + nombreGimnasio + ":");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }
    }
    
    // Añadimos int clave de acceso, para mostrar la clave de acceso del usuario en la información y utilizarla más abajo para que el usuario pueda acceder a la información con ella
    public void registrarUsuario(String usuario, int claveAcceso, String[] actividades) {
        //Creamos el objeto de nuevoUsuario
        Usuario nuevoUsiario = new Usuario(usuario, claveAcceso, actividades);
        usuarios.add(nuevoUsiario);
    }
    
    // Añadimos una función que se encargue de buscar la clave de acceso de los usuarios registrados para mostrar la información correspondiente
    public void buscarClave(int claveAcceso){
        boolean encontrado = false;
        for (Usuario usuario: usuarios){
            if (usuario.claveAcceso == claveAcceso){
                usuario.mostrarInfoUsuario(nombreGimnasio);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Clave de acceso no encontrada");
            
        }
    }
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
          
    
        Gimnasio miGimnasio = new Gimnasio("FitLife Gym");
        // Creamos a 4 usuarios de ejemplo
        miGimnasio.registrarUsuario("Juan Perez", 1090, new String[]{"Yoga", "Sppining"});
        miGimnasio.registrarUsuario("María Suárez", 1091, new String[]{"Funcional", "Acceso libre musculación"});
        miGimnasio.registrarUsuario("Carla Mendoza", 1092, new String[]{"Crossfit", "Boxeo"});
        miGimnasio.registrarUsuario("Nauzet Carbacho", 1093, new String[]{"Sppining", "Funcional", "Acceso libre musculación"});
        
        miGimnasio.mostrarActividades();

        // Añadimos que el usuario pueda acceder a su información con la introducción de DNI
        System.out.println("Introduzca su clave de acceso para mostrar información: ");
        int claveAcceso = s.nextInt();
        miGimnasio.buscarClave(claveAcceso);  
    }
}

