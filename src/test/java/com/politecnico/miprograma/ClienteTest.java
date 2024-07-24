package com.politecnico.miprograma;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest{
  @Test
  public void testGetNombre(){
    Cliente cliente  = new Cliente("nombre", 1.222);
    assertEquals("nombre", cliente.getNombre());
  }

  @Test
  public void testGetSaldo(){
    Cliente cliente = new Cliente("nombre", 1500);
    assertEquals(1500, cliente.getSaldo());
  }

}