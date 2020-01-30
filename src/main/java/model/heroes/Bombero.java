package main.java.model.heroes;

import main.java.model.lugares.*;
import main.java.model.strategy.IStrategy;


public class Bombero {
	
	private IStrategy estrategia;
	
	public void apagarIncendio(ILugar lugar, Calle calle){
		
		estrategia.apagarIncendio(lugar.getSectores(), calle.getCaudalDeAgua());
		
	}
	
	public void bajarGatitoDeArbol(){
		
		System.out.println("Bajo gatito del arbol");
		
	}
	
	
	public Bombero(IStrategy estrategia){
		
		this.estrategia = estrategia;
		
	}
	
}
