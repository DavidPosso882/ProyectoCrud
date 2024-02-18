package com.example.trabajocrud;

import javafx.beans.property.StringProperty;

public class Persona {


    private final StringProperty nombre;
    private final StringProperty apellidos;
    private final StringProperty identificacion;
    private final StringProperty direccion;
    private final StringProperty telefono;

    public Persona(StringProperty nombre, StringProperty apellidos, StringProperty identificacion, StringProperty direccion, StringProperty telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Persona() {
        this(null,null,null,null,null);
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getApellidos() {
        return apellidos.get();
    }

    public StringProperty apellidosProperty() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos.set(apellidos);
    }

    public String getIdentificacion() {
        return identificacion.get();
    }

    public StringProperty identificacionProperty() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion.set(identificacion);
    }

    public String getDireccion() {
        return direccion.get();
    }

    public StringProperty direccionProperty() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion.set(direccion);
    }

    public String getTelefono() {
        return telefono.get();
    }

    public StringProperty telefonoProperty() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono.set(telefono);
    }
}
