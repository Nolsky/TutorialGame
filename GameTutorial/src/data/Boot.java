package data;

import static helpers.Artist.*;

import org.lwjgl.opengl.Display;


public class Boot {

	public Boot() {
		
		BeginSession();
		
		while(!Display.isCloseRequested()) {
			
			DrawQuad(50, 50, 100, 100);
			DrawQuad(150, 350, 100, 100);
			
			Display.update();
			Display.sync(60);
			
		}
		
		Display.destroy();
	}
	
	
	public static void main(String[] args) {
		new Boot();
	}
}
