package nd21;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        // Datos válidos
        cliente1.setNombre("Carlos Pérez");
        cliente1.setCorreo("carlos@correo.com");
        cliente1.setEdad(25);
        cliente1.setSaldo(150.75);

        System.out.println("--- Datos válidos ---");
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Correo: " + cliente1.getCorreo());
        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Saldo: " + cliente1.getSaldo());

        // Pruebas con datos incorrectos
        cliente1.setEdad(-5);
        cliente1.setSaldo(-100);
        cliente1.setNombre("");
        cliente1.setCorreo("");

        System.out.println("--- Después de datos incorrectos ---");
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Correo: " + cliente1.getCorreo());
        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Saldo: " + cliente1.getSaldo());

        // Segundo cliente
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Lucía Gómez");
        cliente2.setCorreo("lucia@correo.com");
        cliente2.setEdad(31);
        cliente2.setSaldo(500);
        System.out.println("--- Cliente 2 ---");
        System.out.println(cliente2.getNombre() + " - " + cliente2.getSaldo());
    }
}