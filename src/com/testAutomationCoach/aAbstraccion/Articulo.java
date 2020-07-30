package com.testAutomationCoach.aAbstraccion;

public class Articulo {
    String descripcion;
    double precio;
    double precioEspecial;
    double estrellas;
    String procedencia;



    public void seleccionarCantidad(int cantidad) {
        System.out.println("Seleccionaste "+ cantidad);
    }

    public void agregarCarrito() {
        System.out.println("Se agrego producto "+ descripcion);

    }


}

