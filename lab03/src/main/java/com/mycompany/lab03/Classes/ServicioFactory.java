package com.mycompany.lab03.Classes;

/**
 * Clase Factory para la creación de servicios de limpieza según el tipo solicitado.
 */
public class ServicioFactory {

    public ServicioLimpieza crearServicio(
            String tipo,
            String direccionCliente,
            double duracionHoras,
            double tarifaHora,
            boolean incluyeMateriales,
            String nombreCliente
    ) {
        switch (tipo.toLowerCase()) {
            case "hogar":
                return new ServicioHogar(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente, false); // esApartamento = false por defecto
            case "oficina":
                return new ServicioOficina(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente, 30); // cantidadEmpleados = 30 por defecto
            case "industrial":
                return new ServicioIndustrial(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente, 1.5); // multiplicadorRiesgo = 1.5 por defecto
            default:
                throw new IllegalArgumentException("Tipo de servicio no válido: " + tipo);
        }
    }
}
