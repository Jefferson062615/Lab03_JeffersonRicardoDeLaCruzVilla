package com.mycompany.lab03.Classes;


public class DescuentoCampania implements Descuento {

    private static final double PORCENTAJE_DESCUENTO = 0.10;

    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1 - PORCENTAJE_DESCUENTO);
    }
}
