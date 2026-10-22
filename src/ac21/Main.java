package ac21;

import nd21.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente.Motor motor1 = new Cliente.Motor();
        motor1.setNombre("Motor Banda A");
        motor1.setPotencia(5.5);
        motor1.setVelocidad(60);

        System.out.println("--- Motor 1 inicial ---");
        System.out.println("Nombre: " + motor1.getNombre());
        System.out.println("Potencia: " + motor1.getPotencia());
        System.out.println("Velocidad: " + motor1.getVelocidad());
        System.out.println("Encendido: " + motor1.isEncendido());

        motor1.encender();
        System.out.println("Después de encender: " + motor1.isEncendido());

        // Pruebas con datos incorrectos
        motor1.setVelocidad(150);
        motor1.setPotencia(-3);
        System.out.println("--- Después de datos incorrectos ---");
        System.out.println("Velocidad: " + motor1.getVelocidad());
        System.out.println("Potencia: " + motor1.getPotencia());

        motor1.apagar();
        System.out.println("--- Después de apagar ---");
        System.out.println("Encendido: " + motor1.isEncendido());
        System.out.println("Velocidad: " + motor1.getVelocidad());

        // Segundo motor, independiente del primero
        Cliente.Motor motor2 = new Cliente.Motor();
        motor2.setNombre("Motor Bomba B");
        motor2.setPotencia(3.0);
        motor2.setVelocidad(40);
        System.out.println("--- Motor 2 ---");
        System.out.println(motor2.getNombre() + " - velocidad " + motor2.getVelocidad());
        System.out.println("Encendido: " + motor2.isEncendido());
    }
}
