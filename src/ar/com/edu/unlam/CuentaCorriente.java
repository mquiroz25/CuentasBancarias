package ar.com.edu.unlam;

public class CuentaCorriente extends CuentaSueldo {
	
	//atributos
	
	private Double descubierto;
	private Double nuevoSaldo;

	//constructores
	
	public CuentaCorriente(Double saldoDisponible,Double descubierto) {
		
		super(saldoDisponible);
		this.descubierto=descubierto;
	}
	
	//metodos
	
	@Override
	public Double depositar(Double deposito) {
		
		this.nuevoSaldo=super.depositar(deposito);
	
		return this.nuevoSaldo;
	}
	
	
	@Override
	public Double extraer(Double extraccion) {
		
		if(extraccion<=super.getSaldoDisponible())	
		{	
			this.nuevoSaldo=super.extraer(extraccion);
		}
	
		else
		{
			if(extraccion<=super.getSaldoDisponible()+this.descubierto)
			{
				this.nuevoSaldo=(super.getSaldoDisponible()-extraccion)*1.05;
			}	
			
					else
						{
			
					System.out.println("La operacion no puede realizarse");
					this.nuevoSaldo=0.0;
						}
		}
	
			return this.nuevoSaldo;
		
}

	//getters and setters
	
	public Double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(Double descubierto) {
		this.descubierto = descubierto;
	}

	public Double getNuevoSaldo() {
		return nuevoSaldo;
	}

	public void setNuevoSaldo(Double nuevoSaldo) {
		this.nuevoSaldo = nuevoSaldo;
	}
	
	
	
}