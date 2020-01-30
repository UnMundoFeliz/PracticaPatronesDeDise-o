package main.java.model.strategy;

public class Espiral implements IStrategy{

	public void apagarIncendio(int[][] sectores, int caudalDeAgua) {
		
		for (int i = 0; i < sectores.length; i++) {
			
			for(int j = i; j < sectores[i].length-1-i; j++) {
				
				while(sectores[i][j] > 0) {
					
					sectores[i][j]-=caudalDeAgua;
					
				}
				
			}
			
			for(int j = 0; j < sectores.length-i-1; j++) {
				
				while(sectores[j][sectores.length-1-i] > 0) {
					
					sectores[j][sectores.length-1]-=caudalDeAgua;
					
				}
				
			}
			
			for(int j=0; j < sectores[i].length; j--) {
				
				
				
			}
			
		}
		
	}
	
	
}
