package com.testAutomationCoach.aAbstraccion;

public class Perro {
    //variables de instancia, tamano, raza, nombre
    public double tamanio;
    public String raza;
    public String nombre;

    //comportamiento: ladrar, juguetear, comer, etc.

    public void ladrar() {
        System.out.println("Guau Guau");
    }
    public void correr() {
        System.out.println("yomi yomi");
    }
    public void comer() {
        System.out.println("RunRun");
    }
    public void juguetear() {
        System.out.println("Ajugar con pelola!");
    }
}
