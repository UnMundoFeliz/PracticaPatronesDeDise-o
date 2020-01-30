package main.java.model.lugares;

import java.util.Random;

public class Plaza implements ILugar{
	
	private String nombre;
	
	private int superficieEnMetrosCuadrados;
	
	private int cantidadDeArboles;
	
	private int cantidadDeFaroles;
	
	public Plaza(String nombre,int superficieEnMetrosCuadrados,int cantidadDeArboles,int cantidadDeFaroles){
		
		this.nombre = nombre;
		
		this.superficieEnMetrosCuadrados = superficieEnMetrosCuadrados;
		
		this.cantidadDeArboles = cantidadDeArboles;
		
		this.cantidadDeFaroles = cantidadDeFaroles;
		
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
		
		return numeroRandom.nextInt()*2;
		
	}
	
}
