package data;

import static helpers.Artist.*;

import java.util.ArrayList;

import org.lwjgl.input.*;

import helpers.Clock;

public class Player {

	private TileGrid grid;
	private WaveManager waveManager;
	private ArrayList<Tower> towerList;
	private Boolean leftMouseButtonDown;
	private Boolean rightMouseButtonDown;
	
	

	public Player(TileGrid grid, WaveManager waveManager) {
		this.grid = grid;
		this.waveManager = waveManager;
		this.towerList = new ArrayList<Tower>();
		this.leftMouseButtonDown = true;
	}
	
	public void update() {
		
		for(Tower t : towerList) {
			t.update();
			t.draw();
			t.updateEnemyList(waveManager.getCurrentWave().getEnemyList());
		}
		
		//Mouse input
		if (Mouse.isButtonDown(0) && !leftMouseButtonDown) {
			
			towerList.add(new IceCannon(TowerType.IceCannon, grid.getTile( (int) Math.floor(Mouse.getX() / TILE_SIZE), (int) Math.floor((HEIGHT - Mouse.getY() - 1) / TILE_SIZE)), waveManager.getCurrentWave().getEnemyList()));
		}
		leftMouseButtonDown = Mouse.isButtonDown(0);
		

		if (Mouse.isButtonDown(1) && !rightMouseButtonDown) {
			
			towerList.add(new TowerCannonBlue(TowerType.CannonRed, grid.getTile( (int) Math.floor(Mouse.getX() / TILE_SIZE), (int) Math.floor((HEIGHT - Mouse.getY() - 1) / TILE_SIZE)), waveManager.getCurrentWave().getEnemyList()));
		}
		rightMouseButtonDown = Mouse.isButtonDown(1);
		
		
		
		
		//Keyboard input
		while (Keyboard.next()) {
			if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT && Keyboard.getEventKeyState()) {
				Clock.ChangeMultiplier(0.07f);
				System.out.println(Clock.getMultiplier());
			} else if (Keyboard.getEventKey() == Keyboard.KEY_LEFT && Keyboard.getEventKeyState()) {
				Clock.ChangeMultiplier(-0.07f);
				System.out.println(Clock.getMultiplier());
			} else if (Keyboard.getEventKey() == Keyboard.KEY_T && Keyboard.getEventKeyState()) {
				System.out.println("Why would someone press T?");
			}
		}
	}


}
