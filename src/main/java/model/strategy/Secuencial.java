package main.java.model.strategy;

public class Secuencial implements IStrategy{
	
	public void apagarIncendio(int[][] sectores, int caudalDeAgua) {
		
		for(int i = 0; i < sectores.length; i++) {
			
			for (int j = 0; j < sectores[i].length; j++) {
				
				String mensaje = "(" + i + "," + j + ") -> "; 
				
				while(sectores[i][j] > 0) {
					
					mensaje += sectores[i][j] + " -> ";
					
					sectores[i][j]-=caudalDeAgua;
					
				}
				
				sectores[i][j] = 0;
				
				mensaje += sectores[i][j];
				
				System.out.println(mensaje);
				
			}
			
		}
		
	}
	
	
}
