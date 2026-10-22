package sw21;

public class Usuario {
    private String username;
    private String correo;
    private int nivel;
    private boolean activo;

    // ----- SETTERS (con validaciones) -----
    public void setUsername(String username) {
        if (username != null && !username.isEmpty()) {
            this.username = username;
        }
    }

    public void setCorreo(String correo) {
        if (correo != null && !correo.isEmpty()) {
            this.correo = correo;
        }
    }

    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        }
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // ----- GETTERS -----
    public String getUsername() {
        return username;
    }

    public String getCorreo() {
        return correo;
    }

    public int getNivel() {
        return nivel;
    }

    public boolean isActivo() {
        return activo;
    }

    // ----- MÉTODOS DE ACCIÓN -----
    public void activar() {
        activo = true;
    }

    public void desactivar() {
        activo = false;
    }
}
