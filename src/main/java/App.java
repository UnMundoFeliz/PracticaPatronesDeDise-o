package main.java;

import main.java.model.heroes.*;
import main.java.model.lugares.*;
import main.java.model.strategy.*;

public class App {
	
	public static void main(String[] args){
		
		IStrategy escalera = new Escalera();
		IStrategy secuencial = new Secuencial();
		
		Bombero bombero = new Bombero(secuencial);
		
		bombero.bajarGatitoDeArbol();
		bombero.apagarIncendio(new Casa(15,60,25), new Calle(12,3,12));
		
		
		Medico medico = new Medico();
		
		medico.atenderDesmayo();
		medico.atenderInfarto();
		
		Policia policia = new Policia();
		
		policia.detenerDelincuentes();
		
		Electricista electricista = new Electricista();
		
		electricista.revisar();
		
		Mecanico mecanico = new Mecanico();
		
		mecanico.arreglarMotor();
		
		
		
		Plaza plaza1 = new Plaza("Plaza Francia",15,20,63);
		
		plaza1.getSectores();
		
	}

}


