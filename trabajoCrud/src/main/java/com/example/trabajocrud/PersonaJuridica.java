package com.example.trabajocrud;

import javafx.beans.property.StringProperty;

public class PersonaJuridica extends Person{
    private final StringProperty nit;

    public PersonaJuridica(StringProperty nombre, StringProperty apellidos, StringProperty identificacion, StringProperty direccion, StringProperty telefono, StringProperty nit) {
        super();
        this.nit = nit;
    }


    public PersonaJuridica(){
        this(null,null,null,null,null,null);
    }
}
