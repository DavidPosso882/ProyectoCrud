package com.example.trabajocrud;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class ProductoRefrigerado extends Producto{
    private final StringProperty codigoAprobacion;
    private final IntegerProperty temperatura;

    public ProductoRefrigerado(StringProperty codigo, StringProperty nombre, StringProperty descripcion, IntegerProperty valorUnitario, IntegerProperty cantidadExistencias, StringProperty codigoAprobacion, IntegerProperty temperatura) {
        super(codigo, nombre, descripcion, valorUnitario, cantidadExistencias);
        this.codigoAprobacion = codigoAprobacion;
        this.temperatura = temperatura;
    }

    public ProductoRefrigerado(){
        this(null,null,null,null,null,null,null);
    }

    public String getCodigoAprobacion() {
        return codigoAprobacion.get();
    }

    public StringProperty codigoAprobacionProperty() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion.set(codigoAprobacion);
    }

    public int getTemperatura() {
        return temperatura.get();
    }

    public IntegerProperty temperaturaProperty() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura.set(temperatura);
    }
}
