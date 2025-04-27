package com.mycompany.lab03.Classes;


public abstract class ServicioAdicional extends ServicioLimpieza {

    protected ServicioLimpieza servicioBase; 

    public ServicioAdicional(ServicioLimpieza servicioBase) {
        super(servicioBase.direccionCliente, servicioBase.duracionHoras, servicioBase.tarifaHora, servicioBase.incluyeMateriales, servicioBase.nombreCliente);
        this.servicioBase = servicioBase;
    }

    @Override
    public abstract double calcularPrecioFinal();

    @Override
    public abstract String getDescripcion();
}
