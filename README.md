# Descripción
Este proyecto simula la gestión de usuarios en un gimnasio. Inicialmente, mi intención era que se añadiesen nuevas actividades al array de actividades como"Spinning", "Crossfit", etc, y que, en el registro de usuario, se añadiese una clave asociada a cada uno de ellos. Posteriormente, quería crear una función que mostrase la información de todos los usuarios registrados. Pero, finalmente, decidí que las mejoras realizadas se centren en permitir a los usuarios acceder a su información personal mediante una clave de acceso, introducida por teclado, aumentando así, la complejidad y la utilidad del programa.

# Mejoras realizadas
1. Clase Usuario
-Se creó una nueva clase Usuario para gestionar la información de cada usuario para almacenarla posteriormente.
-La clase almacena el nombre del usuario, su clave de acceso y las actividades a las que se haya registrado.

2. Almacenamiento Dinámico de Usuarios
-Se implementó un ArrayList<Usuario> para almacenar múltiples usuarios.

3. Acceso a Información del usuario mediante una función que utiliza la clave de acceso asignada
-Se añadió un método buscarClave(int claveAcceso) para permitir a los usuarios consultar su información ingresando su clave de acceso.

4. Ampliación de las actividades disponibles en el gimnasio
-Se amplió la lista de actividades del gimnasio.

# Justificación de los Cambios
-La mejora en la organización de datos: La creación de la clase Usuario mejora la estructura del código y facilita como se gestiona la información de los usuarios
-La adaptabilidad y eficacia para registrar nuevos usuarios: Se usa un ArrayList que permite agregar y gestionar múltiples usuarios
-Funcionalidad ampliada e interacción con el usuario-cliente del programa mediante el ingreso por teclado de su clave de acceso: Se permite el acceso a la información personal mediante una clave para hacer que el programa sea más interactivo y dinámico

# Instrucciones de Uso
1. Compilar y ejecutar el programa en java
2. Las actividades disponibles, ya están predefinidas en un array de tipo String. De la misma manera, existen ya creados, 4 usuarios con su nombre, clave de acceso, nombre del gimnasio y actividades en las que participa
3. El programa mostará primeramente, las actividades disponibles
4. Seguidamente, mediante la interacción en consola, se solicitará al usuario que introduzca su clave de acceso
5. Si la clave de acceso es correcta, se le mostrará al usuario, su información correspondiente
6. Si la clave no es válida, se le mostrará un mensaje de error

