package com.politecnico.miprograma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BancoTest {
  @Test
  public void getCajaTotal(){
    Banco banco = new Banco();
    banco.crearCliente("carlos sanchez", 1500);
    banco.crearCliente("maria paula alquichire", 1500);
    assertEquals(3000, banco.getCajaTotal());
  }
}
