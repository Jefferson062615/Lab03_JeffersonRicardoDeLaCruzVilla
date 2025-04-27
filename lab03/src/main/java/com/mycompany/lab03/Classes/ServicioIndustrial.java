package com.mycompany.lab03.Classes;

public class ServicioIndustrial extends ServicioLimpieza {

    private double multiplicadorRiesgo;

    public ServicioIndustrial(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, double multiplicadorRiesgo) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.multiplicadorRiesgo = multiplicadorRiesgo;
    }

    @Override
    public double calcularPrecioFinal() {
        if (!incluyeMateriales) {
            throw new IllegalArgumentException("Los servicios industriales deben incluir materiales.");
        }
        double precioBase = calcularPrecioBase();
        return precioBase * multiplicadorRiesgo;
    }

    @Override
    public String getDescripcion() {
        return "Servicio Industrial para " + nombreCliente;
    }
}
