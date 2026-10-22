package sw21;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.setUsername("admin01");
        usuario1.setCorreo("admin@sistema.com");
        usuario1.setNivel(3);

        System.out.println("--- Usuario inicial ---");
        System.out.println("Username: " + usuario1.getUsername());
        System.out.println("Correo: " + usuario1.getCorreo());
        System.out.println("Nivel: " + usuario1.getNivel());
        System.out.println("Activo: " + usuario1.isActivo());

        usuario1.activar();
        System.out.println("Después de activar: " + usuario1.isActivo());

        usuario1.desactivar();
        System.out.println("Después de desactivar: " + usuario1.isActivo());

        // Pruebas con datos incorrectos
        usuario1.setNivel(-2);
        usuario1.setUsername("");
        usuario1.setCorreo("");

        System.out.println("--- Después de datos incorrectos ---");
        System.out.println("Username: " + usuario1.getUsername());
        System.out.println("Correo: " + usuario1.getCorreo());
        System.out.println("Nivel: " + usuario1.getNivel());

        // Segundo usuario
        Usuario usuario2 = new Usuario();
        usuario2.setUsername("invitado");
        usuario2.setCorreo("invitado@sistema.com");
        usuario2.setNivel(1);
        usuario2.activar();
        System.out.println("--- Usuario 2 ---");
        System.out.println(usuario2.getUsername() + " activo: " + usuario2.isActivo());
    }
}
