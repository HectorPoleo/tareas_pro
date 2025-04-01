package es.ies.puerto.modelo;

import java.util.Objects;

public class UsuarioEntity {
    
    String email;
    String nombre;
    String contrasenia;
    

    public UsuarioEntity() {
    }

    public UsuarioEntity(String email, String nombre, String contrasenia) {
        this.email = email;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UsuarioEntity)) {
            return false;
        }
        UsuarioEntity UsuarioEntity = (UsuarioEntity) o;
        return Objects.equals(email, UsuarioEntity.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "{" +
            " email='" + email + "'" +
            ", nombre='" + nombre + "'" +
            ", contrasenia='" + contrasenia + "'" +
            "}";
    }


}
