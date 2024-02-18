package com.example.trabajocrud;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Producto {
    private final StringProperty codigo;
    private final StringProperty nombre;
    private final StringProperty descripcion;

    private final IntegerProperty valorUnitario;
    private final IntegerProperty cantidadExistencias;

    public Producto(StringProperty codigo, StringProperty nombre, StringProperty descripcion, IntegerProperty valorUnitario, IntegerProperty cantidadExistencias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
        this.cantidadExistencias = cantidadExistencias;
    }

    public Producto(){
        this(null,null,null,null,null);
    }

    public String getCodigo() {
        return codigo.get();
    }

    public StringProperty codigoProperty() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo.set(codigo);
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

    public String getDescripcion() {
        return descripcion.get();
    }

    public StringProperty descripcionProperty() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion.set(descripcion);
    }

    public int getValorUnitario() {
        return valorUnitario.get();
    }

    public IntegerProperty valorUnitarioProperty() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario.set(valorUnitario);
    }

    public int getCantidadExistencias() {
        return cantidadExistencias.get();
    }

    public IntegerProperty cantidadExistenciasProperty() {
        return cantidadExistencias;
    }

    public void setCantidadExistencias(int cantidadExistencias) {
        this.cantidadExistencias.set(cantidadExistencias);
    }


}
