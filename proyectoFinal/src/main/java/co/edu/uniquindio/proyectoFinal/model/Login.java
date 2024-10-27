package co.edu.uniquindio.proyectoFinal.model;

public class Login {

    // Almacena usuarios registrados (en un entorno real, esto estaría en una base de datos)
    private Usuario[] registeredUsers;
    private int userCount; // Para llevar el conteo de usuarios registrados
    private static final int MAX_USERS = 10; // Máximo número de usuarios que se pueden registrar

    // Constructor que inicializa el arreglo de usuarios
    public Login() {
        registeredUsers = new Usuario[MAX_USERS];
        userCount = 0;

        // Usuarios de ejemplo (en un sistema real, esto estaría en una base de datos)
        registerUser("usuario1", "contraseña1");
        registerUser("usuario2", "contraseña2");
    }

    /**
     * Método para autenticar un usuario con su nombre de usuario y contraseña.
     *
     * @param username El nombre de usuario ingresado.
     * @param password La contraseña ingresada.
     * @return true si las credenciales son correctas, false en caso contrario.
     */
    public boolean authenticate(String username, String password) {
        for (int i = 0; i < userCount; i++) {
            if (registeredUsers[i].getUsername().equals(username) &&
                    registeredUsers[i].getPassword().equals(password)) {
                return true; // Credenciales correctas
            }
        }
        return false; // Credenciales incorrectas
    }

    /**
     * Método para registrar un nuevo usuario en el sistema.
     *
     * @param username El nombre de usuario a registrar.
     * @param password La contraseña del nuevo usuario.
     * @return true si el registro es exitoso, false si el usuario ya existe o se alcanzó el límite.
     */
    public boolean registerUser(String username, String password) {
        if (userCount >= MAX_USERS) {
            return false; // Se alcanzó el máximo de usuarios
        }

        // Verifica si el usuario ya existe
        for (int i = 0; i < userCount; i++) {
            if (registeredUsers[i].getUsername().equals(username)) {
                return false; // El usuario ya existe
            }
        }

        // Agrega el nuevo usuario
        registeredUsers[userCount] = new Usuario(username, password);
        userCount++;
        return true;
    }

    /**
     * Método para eliminar un usuario del sistema.
     *
     * @param username El nombre de usuario a eliminar.
     * @return true si el usuario fue eliminado, false si el usuario no existe.
     */
    public boolean deleteUser(String username) {
        for (int i = 0; i < userCount; i++) {
            if (registeredUsers[i].getUsername().equals(username)) {
                // Desplaza los usuarios restantes hacia la izquierda
                for (int j = i; j < userCount - 1; j++) {
                    registeredUsers[j] = registeredUsers[j + 1];
                }
                registeredUsers[userCount - 1] = null; // Libera el espacio del último usuario
                userCount--; // Reduce el contador de usuarios
                return true; // Usuario eliminado
            }
        }
        return false; //
    }

}
