package data;

import static helpers.Artist.BeginSession;

import java.util.Random;

import org.lwjgl.opengl.Display;

public class Boot {

	public Boot() {

		BeginSession();

		int[][] map = {
				{0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,1,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
		};
		
		Random rand = new Random();

		int[][] map2 = new int[13][22];

		for(int i = 0; i < map2.length; i++) {
			System.out.println();
			for (int j = 0; j < map2[i].length; j++) {
				map2[i][j] = rand.nextInt(3);
				System.out.print("[" + i + ", " + j + "] " + map2[i][j] + "; ");
			}
		}
		System.out.println();
		
	
		TileGrid mATS = new TileGrid(map2); //macAirTileSize -> mATS (1408 x 832 / 22x14 64 bit tiles)
		
		
		
		while (!Display.isCloseRequested()) {
			
			mATS.Draw();
			
			Display.update();
			Display.sync(60);

		}

		Display.destroy();
	}

	public static void main(String[] args) {
		new Boot();
	}
}
