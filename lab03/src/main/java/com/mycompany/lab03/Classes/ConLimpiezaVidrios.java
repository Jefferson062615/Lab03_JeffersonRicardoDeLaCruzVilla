package com.mycompany.lab03.Classes;


public class ConLimpiezaVidrios extends ServicioAdicional {

    public ConLimpiezaVidrios(ServicioLimpieza servicioBase) {
        super(servicioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return servicioBase.calcularPrecioFinal() + 10.0; 
    }

    @Override
    public String getDescripcion() {
        return servicioBase.getDescripcion() + " + Limpieza de Vidrios"; 
    }
}
