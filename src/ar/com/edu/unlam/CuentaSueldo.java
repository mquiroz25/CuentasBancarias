package ar.com.edu.unlam;

public class CuentaSueldo {
	
	//Atributos
	
	private Double saldoDisponible;

	//Constructores
	
	public CuentaSueldo(Double saldoDisponible)
	{
		this.saldoDisponible=saldoDisponible;
	}
	
   //Metodos
	
	public Double depositar(Double deposito){
		
		this.saldoDisponible=this.saldoDisponible+deposito;
		
		return this.saldoDisponible;
	}
	

	public Double extraer(Double extraccion){
		
		if(extraccion<=this.saldoDisponible)
		{
	    this.saldoDisponible=this.saldoDisponible-extraccion;
		}
		
		else
		{
			System.out.println("La operacion no puede realizarse:saldo insuficiente");
			this.saldoDisponible=0.0;
		}
		
		return  this.saldoDisponible;
	}
	
	
	//getters and setters
	
	public Double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(Double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}
	
}
