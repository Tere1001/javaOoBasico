package com.testAutomationCoach.aAbstraccion;

public class EjemploArticulo {

    public static void main(String[] args) {
        Articulo amazon=new Articulo();
        Articulo camara= new Articulo();
        Articulo tv= new Articulo();
        Articulo audifonos= new Articulo();

        camara.descripcion="Laptop toshiba";
        tv.descripcion="Tv 4K full HD";
        audifonos.descripcion="Audifonos Sony";

        amazon.descripcion="AmazonBasics - Cama para mascota de espuma ergonómica, 68,6 x 91 cm";
        amazon.estrellas= 4;
        amazon.precio= 1349;
        amazon.precioEspecial= 1053.43;
        amazon.procedencia= "Amazon Mexico";

        CarritoDeCompras carrito=new CarritoDeCompras();
        carrito.agregarCarritodeCompras(camara);
        carrito.agregarCarritodeCompras(tv);
        carrito.agregarCarritodeCompras(audifonos);




        amazon.seleccionarCantidad(5);
        amazon.agregarCarrito();

    }
}
