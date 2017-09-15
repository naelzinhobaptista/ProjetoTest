package br.ufpb.javasport;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufpb.javasport.Time;

public class TimeTest {

	@Test
	public void test() {
		Time t = new Time("Vasco da Gama","São Januário","1º Colocado");
		assertTrue(t.getNomeTime().equals("Vasco da Gama"));
		assertEquals("Vasco da Gama", t.getNomeTime());
		assertTrue(t.getEstadio().equals("São Januário"));
		assertEquals("São Januário",t.getEstadio());
	}

}
