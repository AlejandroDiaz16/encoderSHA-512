public class User {
    private String nombre;
    private String Apellido;
    private String correo;

    public User(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        Apellido = apellido;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "User{" +
                "nombre:'" + nombre + '\'' +
                ", Apellido:'" + Apellido + '\'' +
                ", correo:'" + correo + '\'' +
                '}';
    }
}
