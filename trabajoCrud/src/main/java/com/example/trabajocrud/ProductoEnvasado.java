package com.example.trabajocrud;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class ProductoEnvasado extends Producto{
    private final ObjectProperty<LocalDate> fechaEnvasado;
    private final IntegerProperty pesoEnvase;
    private final ObjectProperty<PaisOrigen> paisOrigen;

    public ProductoEnvasado(StringProperty codigo, StringProperty nombre, StringProperty descripcion, IntegerProperty valorUnitario, IntegerProperty cantidadExistencias, ObjectProperty<LocalDate> fechaEnvasado, IntegerProperty pesoEnvase, ObjectProperty<PaisOrigen> paisOrigen) {
        super(codigo, nombre, descripcion, valorUnitario, cantidadExistencias);
        this.fechaEnvasado = fechaEnvasado;
        this.pesoEnvase = pesoEnvase;
        this.paisOrigen = paisOrigen;
    }

    public ProductoEnvasado(){
        this(null,null,null,null,null,null,null,null);
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado.get();
    }

    public ObjectProperty<LocalDate> fechaEnvasadoProperty() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado.set(fechaEnvasado);
    }

    public int getPesoEnvase() {
        return pesoEnvase.get();
    }

    public IntegerProperty pesoEnvaseProperty() {
        return pesoEnvase;
    }

    public void setPesoEnvase(int pesoEnvase) {
        this.pesoEnvase.set(pesoEnvase);
    }

    public PaisOrigen getPaisOrigen() {
        return paisOrigen.get();
    }

    public ObjectProperty<PaisOrigen> paisOrigenProperty() {
        return paisOrigen;
    }

    public void setPaisOrigen(PaisOrigen paisOrigen) {
        this.paisOrigen.set(paisOrigen);
    }
}
