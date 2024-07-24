package com.politecnico.miprograma;

public class Main {
    
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.crearCliente("carlos sanchez", 1500);
        banco.crearCliente("maria alquichire", 1500);
        System.out.println(banco.getCajaTotal());
        System.out.println("Hello world!");
    }
}