package main.java.model.lugares;

import java.util.Random;

public class Casa implements ILugar {
	
	private int numeroDePuerta;
	
	private int superficieEnMetrosCuadrados;
	
	private int cantidadDeHabitantes;
	
	public Casa(int numeroDePuerta, int superficieEnMetrosCuadrados, int cantidadDeHabitantes){
		
		this.numeroDePuerta = numeroDePuerta;
		
		this.superficieEnMetrosCuadrados = superficieEnMetrosCuadrados;
		
	}

	public int[][] getSectores() {
		
		int dimension = (int)Math.floor(Math.sqrt(this.superficieEnMetrosCuadrados));
		
		int[][] losValores = new int[dimension][];
		
		for(int i=0; i < dimension; i++){
			
			losValores[i] = new int[dimension];
			
			for(int j=0; j < dimension; j++){
				
				losValores[i][j] = this.getNumerosAlAzar();
				
				System.out.print(losValores[i][j]);
				System.out.print(" \t");
			}
			
			System.out.print("\n");
			
		}
			
		return losValores;
		
	}
	
	public int getNumerosAlAzar(){
		
		long horaEnMilis = System.currentTimeMillis();
		
		Random numeroRandom = new Random(horaEnMilis);
		
		return numeroRandom.nextInt(100);
		
	}
	
}


