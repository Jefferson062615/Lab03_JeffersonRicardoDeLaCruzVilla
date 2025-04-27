package com.mycompany.lab03.Classes;

/**
 * Decorador que añade aromatizante a un servicio de limpieza.
 */
public class ConAromatizante extends ServicioAdicional {

    public ConAromatizante(ServicioLimpieza servicioBase) {
        super(servicioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return servicioBase.calcularPrecioFinal() + 5.0; // Suma 5 soles al precio base
    }

    @Override
    public String getDescripcion() {
        return servicioBase.getDescripcion() + " + Aromatizante"; // Añade texto
    }
}
