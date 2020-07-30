package com.testAutomationCoach.practAmazon;

public class HomaPage {
 Imagen logoAmazon;
 TextField campoBusqueda;
 Button lupitaBsqueda;
 Link devolucionesPedidos;
 Imagen articuloSugerido;

 public void buscarPedido(String nombreProducto){
     campoBusqueda.ingresarTexto(nombreProducto);
     lupitaBsqueda.click();
 }
    public void clicDEvoluciones(){
        devolucionesPedidos.click();
    }

    public void seleccionarArticulo(String articulo){
        //buscar en todas las imagenes, una que tenga tooltip igual al nombreArticulo
    }
}
