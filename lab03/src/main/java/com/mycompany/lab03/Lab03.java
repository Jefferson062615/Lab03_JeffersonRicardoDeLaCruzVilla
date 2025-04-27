package com.mycompany.lab03;

import com.mycompany.lab03.Classes.*;

public class Lab03 {
    public static void main(String[] args) {

        ServicioFactory factory = new ServicioFactory();

        ServicioLimpieza servicio = factory.crearServicio(
            "hogar",
            "Av. Primavera 123",
            5,    
            20.0, 
            true, 
            "Carlos Pérez"
        );

        servicio = new ConAromatizante(servicio);
        servicio = new ConLimpiezaVidrios(servicio);
        servicio = new ConDesinfeccion(servicio);

        System.out.println("Descripción del Servicio:");
        System.out.println(servicio.getDescripcion());

        System.out.println("\nPrecio Final del Servicio (sin descuento):");
        System.out.println("S/. " + servicio.calcularPrecioFinal());

        
        Descuento descuento = new DescuentoClienteFrecuente(); 
        double precioConDescuento = descuento.aplicarDescuento(servicio.calcularPrecioFinal());

        System.out.println("\nPrecio Final del Servicio (con descuento de Cliente Frecuente):");
        System.out.println("S/. " + precioConDescuento);
    }
}
