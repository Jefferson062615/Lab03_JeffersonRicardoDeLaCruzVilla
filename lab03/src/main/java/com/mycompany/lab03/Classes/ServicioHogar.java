package com.mycompany.lab03.Classes;

public class ServicioHogar extends ServicioLimpieza {

    private boolean esApartamento;

    public ServicioHogar(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, boolean esApartamento) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.esApartamento = esApartamento;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioBase = calcularPrecioBase();
        if (esApartamento) {
            precioBase *= 0.9; // 10% descuento si es apartamento
        }
        return precioBase;
    }

    @Override
    public String getDescripcion() {
        return "Servicio de Hogar para " + nombreCliente;
    }
}
