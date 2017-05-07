package ar.com.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuentaBancaria {

	@Test
	public void testCuentaSueldo1() {
		
		CuentaSueldo miCuentasueldo= new CuentaSueldo(0.0);
		
		miCuentasueldo.depositar(500.0);
		miCuentasueldo.depositar(1000.0);
		miCuentasueldo.extraer(300.0);
		miCuentasueldo.extraer(200.0);
		
		assertEquals(1000.0, miCuentasueldo.getSaldoDisponible(), 0.1);
		
	//System.out.println(miCuentasueldo.getSaldoDisponible());
	}
	
	
	@Test
	public void testCuentaSueldo2() {
		
		CuentaSueldo miCuentasueldo= new CuentaSueldo(0.0);
		
		miCuentasueldo.depositar(1000.0);
		miCuentasueldo.extraer(2000.0);
		
	}
	
	@Test
	public void testCajaDeAhorros() {
		
		CajaDeAhorros miCajaDeAhorros= new CajaDeAhorros(0.0);
		
		miCajaDeAhorros.depositar(10000.0);
		miCajaDeAhorros.extraer(1000.0);
		miCajaDeAhorros.extraer(1000.0);
		miCajaDeAhorros.extraer(1000.0);
		miCajaDeAhorros.extraer(1000.0);
		miCajaDeAhorros.extraer(1000.0);
		miCajaDeAhorros.extraer(1000.0);
		miCajaDeAhorros.extraer(1000.0);
		
	assertEquals(2988.0, miCajaDeAhorros.getSaldoActual(), 0.1);

		
	//System.out.println(miCajaDeAhorros.getSaldoActual());
	//System.out.println(miCajaDeAhorros.getNumeroDeExtraccion());
	}
	
	
	@Test
	public void testCuentaCorriente() {
		
		CuentaCorriente miCuentaCorriente= new CuentaCorriente(0.0, 150.0);
		
		miCuentaCorriente.depositar(100.0);
		miCuentaCorriente.extraer(200.0);

		assertEquals(-105.0, miCuentaCorriente.getNuevoSaldo(), 0.1);
		
	//System.out.println(miCuentaCorrientes.getNuevoSaldo());

	}
	
	

}
