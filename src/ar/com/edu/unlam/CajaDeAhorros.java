package ar.com.edu.unlam;

public class CajaDeAhorros extends CuentaSueldo {
	
	//atributos
	
	private Integer numeroDeExtraccion;
	private Double saldoActual;
	
	
	//constructor
	
	public CajaDeAhorros(Double saldoDisponible) {
		super(saldoDisponible);
		this.numeroDeExtraccion=0;
	}
	
	//metodos
	
	@Override
	public Double depositar(Double deposito){
	
		this.saldoActual=super.depositar(deposito);
		
		return this.saldoActual; 
	}
	
	
	@Override
	public Double extraer(Double extraccion) {

		this.numeroDeExtraccion=this.numeroDeExtraccion+1;
		
		if(numeroDeExtraccion<=5)
		{
			this.saldoActual=super.extraer(extraccion);
		}
		
		else{
				if(numeroDeExtraccion>5)
				{
				this.saldoActual= this.saldoActual-extraccion-6;	
				}	
			}
		
			return this.saldoActual;
	}

	
	//getters and setters
	
	public Integer getNumeroDeExtraccion() {
		return numeroDeExtraccion;
	}

	public void setNumeroDeExtraccion(Integer numeroDeExtraccion) {
		this.numeroDeExtraccion = numeroDeExtraccion;
	}

	public Double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(Double saldoActual) {
		this.saldoActual = saldoActual;
	}
	

}
