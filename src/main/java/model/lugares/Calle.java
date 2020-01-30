package main.java.model.lugares;

public class Calle {
	
	private int longitudEnMetros;
	
	private int cantidadDeFarolas;
	
	private int caudalDeAguaPorMinuto;
	
	public Calle(int longitudEnMetros,int cantidadDeFarolas,int caudalDeAguaPorMinuto){
		
		this.longitudEnMetros = longitudEnMetros;
		
		this.cantidadDeFarolas = cantidadDeFarolas;
		
		this.caudalDeAguaPorMinuto = caudalDeAguaPorMinuto;
		
	}
	
	public int getCaudalDeAgua(){
		
		return this.caudalDeAguaPorMinuto;
		
	}
}
