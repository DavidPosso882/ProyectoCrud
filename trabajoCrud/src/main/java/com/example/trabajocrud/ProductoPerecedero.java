package com.example.trabajocrud;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto{
    private final ObjectProperty<LocalDate> fechaVencimiento;

    public ProductoPerecedero(StringProperty codigo, StringProperty nombre, StringProperty descripcion, IntegerProperty valorUnitario, IntegerProperty cantidadExistencias, ObjectProperty<LocalDate> fechaVencimiento) {
        super(codigo, nombre, descripcion, valorUnitario, cantidadExistencias);
        this.fechaVencimiento = fechaVencimiento;
    }

    public ProductoPerecedero(){
        this(null,null,null,null,null,null);

    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento.get();
    }

    public ObjectProperty<LocalDate> fechaVencimientoProperty() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento.set(fechaVencimiento);
    }
}
