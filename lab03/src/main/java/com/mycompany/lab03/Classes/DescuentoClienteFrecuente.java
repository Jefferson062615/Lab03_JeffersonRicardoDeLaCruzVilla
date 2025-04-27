package com.mycompany.lab03.Classes;


public class DescuentoClienteFrecuente implements Descuento {

    private static final double PORCENTAJE_DESCUENTO = 0.20;

    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1 - PORCENTAJE_DESCUENTO);
    }
}
