package com.politecnico.miprograma;

public class Cliente {
  private String nombre;
  private double saldo;

  public Cliente(String nombre, double saldo) {
    this.nombre = nombre;
    this.saldo = saldo;
  }

  public String getNombre(){
    return this.nombre;
  }

  public double getSaldo(){
    return this.saldo;
  }

  public void adcionarSaldo(double adicion){
    this.saldo = this.saldo + adicion;
  }
  
  public void retirarSaldo(double adicion){
    this.saldo = this.saldo - adicion;
  }

}
