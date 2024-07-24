package com.politecnico.miprograma;

import java.util.ArrayList;
import java.util.List;

public class Banco {
  
  private List<Cliente> clientes ;

  public Banco() {
    this.clientes = new ArrayList<Cliente>();
  }

  public void crearCliente(String nombre, double saldo){
    Cliente cliente = new Cliente(nombre, saldo);
    this.clientes.add(cliente);
  }

  public double getCajaTotal(){
    double total = 0;
    for (Cliente cliente : this.clientes) {
      total += cliente.getSaldo();
    }
    return total;
  }

}
