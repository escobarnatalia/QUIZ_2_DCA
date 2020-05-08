
import java.util.ArrayList;


import processing.core.PApplet;


public class Main extends PApplet{
	int[][] matriz;

	int matX;
	int matY;
	Cuadrado cuadrado;
	ArrayList<Cuadrado> arregloCuadrados;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());

	}
	
	public void settings() {
		
		size (600,600);
		
		}
	
	
	public void setup() {
		
		matX=4;
		matY=4;		
		matriz = new int[30][20];
		arregloCuadrados = new ArrayList<Cuadrado>();
		
		
		
		
		for(int fila=0;fila<30;fila+=2) {
			for(int col=0;col<20;col+=2) {
				cuadrado= new Cuadrado(this, fila*40, col*40,2);
				arregloCuadrados.add(cuadrado);
				matriz[fila][col]=1;
				
			}
		
			}
		
		

		
		
	
		


}
	
	
	public void draw() {
		background(100);
		for(int fila=0;fila<30;fila++) {
			for(int col=0;col<20;col++) {
				
				
				switch (matriz[fila][col]) {
				case 1:
				
					for (int i = 0; i < arregloCuadrados.size(); i++) {
						arregloCuadrados.get(i).draw();
						
					}

					break;
				case 0:
				
					break;
	
					default:
						break;
				
				}

				
			
		
			}
			
		}
	
	}
	
	public void mouseClicked()  {
		
		try {
			for (int i = 0; i < arregloCuadrados.size(); i++) {
				arregloCuadrados.get(i).start();
			}
		}catch(IllegalThreadStateException e){
			System.out.println("hilo activo");
		}
		
	
			
		
	}
	
}