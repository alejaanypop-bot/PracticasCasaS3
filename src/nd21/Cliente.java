package nd21;

public class Cliente {
    private String nombre;
    private String correo;
    private int edad;
    private double saldo;

    // ----- SETTERS (con validaciones) -----
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setCorreo(String correo) {
        if (correo != null && !correo.isEmpty()) {
            this.correo = correo;
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    // ----- GETTERS -----
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public static class Motor {
        private String nombre;
        private double potencia;
        private int velocidad;
        private boolean encendido;

        // ----- SETTERS (con validaciones) -----
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setPotencia(double potencia) {
            if (potencia >= 0) {
                this.potencia = potencia;
            }
        }

        public void setVelocidad(int velocidad) {
            if (velocidad >= 0 && velocidad <= 100) {
                this.velocidad = velocidad;
            }
        }

        // ----- GETTERS -----
        public String getNombre() {
            return nombre;
        }

        public double getPotencia() {
            return potencia;
        }

        public int getVelocidad() {
            return velocidad;
        }

        public boolean isEncendido() {
            return encendido;
        }

        // ----- MÉTODOS DE ACCIÓN -----
        public void encender() {
            encendido = true;
        }

        public void apagar() {
            encendido = false;
            velocidad = 0;
        }
    }
}
