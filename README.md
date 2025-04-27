# Lab03 - Proyecto de Ingeniería de Software II

Este proyecto fue desarrollado como parte del curso **Ingeniería de Software II**.  
Tiene como objetivo aplicar los principios fundamentales de la programación orientada a objetos (POO) junto con prácticas de diseño de software como:

- **Principios SOLID** (SRP y OCP)
- **Patrón de Diseño Factory**
- **Patrón de Diseño Decorator**

## Estructura del proyecto

- **ServicioLimpieza**: Clase abstracta base.
- **ServicioHogar**, **ServicioOficina**, **ServicioIndustrial**: Clases concretas que heredan de `ServicioLimpieza`.
- **ServicioFactory**: Crea instancias de servicios aplicando el patrón Factory.
- **ServicioAdicional**, **ConAromatizante**, **ConDesinfeccion**, **ConLimpiezaVidrios**: Implementan el patrón Decorator para añadir funcionalidades adicionales a los servicios.
- **Descuento**, **DescuentoClienteFrecuente**, **DescuentoCampania**: Aplicación de Principios SOLID con estrategias de descuento para clientes.

## Tecnologías utilizadas

- **Java 21**
- **Apache NetBeans 25**
- **Apache Maven**

## Instrucciones para ejecución

1. Clonar el repositorio o descargarlo.
2. Abrir el proyecto en NetBeans o IDE compatible con Maven.
3. Ejecutar la clase `Lab03` ubicada en `com.mycompany.lab03`.
4. Verificar en consola la creación de servicios, aplicación de decoradores y descuentos.

## Autor

**Jefferson Ricardo De La Cruz Villa**
