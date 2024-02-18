package com.example.trabajocrud;

import javafx.beans.property.StringProperty;

public class PersonaJuridica extends Persona{
    private final StringProperty nit;

    public PersonaJuridica(StringProperty nombre, StringProperty apellidos, StringProperty identificacion, StringProperty direccion, StringProperty telefono, StringProperty nit) {
        super(nombre, apellidos, identificacion, direccion, telefono);
        this.nit = nit;
    }


    public PersonaJuridica(){
        this(null,null,null,null,null,null);
    }
}
