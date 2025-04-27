package com.mycompany.lab03.Classes;

public class ServicioOficina extends ServicioLimpieza {

    private int cantidadEmpleados;

    public ServicioOficina(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, int cantidadEmpleados) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioBase = calcularPrecioBase();
        if (cantidadEmpleados > 50) {
            precioBase *= 1.2; // 20% adicional si hay muchos empleados
        }
        return precioBase;
    }

    @Override
    public String getDescripcion() {
        return "Servicio de Oficina para " + nombreCliente;
    }
}
