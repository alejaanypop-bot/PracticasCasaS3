package ac21;

public class Motor {
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
