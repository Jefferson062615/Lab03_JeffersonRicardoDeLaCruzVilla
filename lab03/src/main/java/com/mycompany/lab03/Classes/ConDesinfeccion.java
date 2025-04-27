package com.mycompany.lab03.Classes;

public class ConDesinfeccion extends ServicioAdicional {

    public ConDesinfeccion(ServicioLimpieza servicioBase) {
        super(servicioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return servicioBase.calcularPrecioFinal() + 15.0; 
    }

    @Override
    public String getDescripcion() {
        return servicioBase.getDescripcion() + " + Desinfección"; 
    }
}
