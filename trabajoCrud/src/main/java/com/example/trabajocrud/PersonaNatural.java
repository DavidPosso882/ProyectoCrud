package com.example.trabajocrud;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class PersonaNatural extends Persona{
    private final StringProperty email;
    private final ObjectProperty<LocalDate> fechaNacimiento;

    public PersonaNatural(StringProperty nombre, StringProperty apellidos, StringProperty identificacion, StringProperty direccion, StringProperty telefono, StringProperty email, ObjectProperty<LocalDate> fechaNacimiento) {
        super(nombre, apellidos, identificacion, direccion, telefono);
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public PersonaNatural(StringProperty email, ObjectProperty<LocalDate> fechaNacimiento) {
        super("Hans", "Muster");
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento.get();
    }

    public ObjectProperty<LocalDate> fechaNacimientoProperty() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento.set(fechaNacimiento);
    }
}
