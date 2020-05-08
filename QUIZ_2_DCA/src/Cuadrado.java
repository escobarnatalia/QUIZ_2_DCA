import processing.core.PApplet;

public class Cuadrado extends Thread{

	
	PApplet app;
	int posX, posY,color;
	boolean vertical;
	
	public Cuadrado(PApplet app,int posX, int posY, int color) {
		this.app=app;
		this.color=color;
		this.posX=posX;
		this.posY=posY;
	
		
		
	}
	
	public void draw () {
		if(color==1) {
			app.fill(255);
		}
		if(color==2) {
			app.fill(0);
		}
		app.rect(posX, posY, 20, 20);
	}
	
	
	public void mover() {
		
		if(vertical==true) {
			posY+=3;
		}
		
		if(vertical==false) {
			posY-=3;
		}
	
	}
	public void run() {
		
		for (int i = 0; i < 27; i++) {

			this.mover();
		
			try {
				
				Thread.sleep(30);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}
		
		
		

		
	}
}
