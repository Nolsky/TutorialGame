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
//			t.updateEnemyList(waveManager.getCurrentWave().getEnemyList());
		}
		
		//Mouse input
		if (Mouse.isButtonDown(0) && !leftMouseButtonDown) {
			
			towerList.add(new TowerCannonBlue(TowerType.CannonBlue, grid.getTile( (int) Math.floor(Mouse.getX() / TILE_SIZE), (int) Math.floor((HEIGHT - Mouse.getY() - 1) / TILE_SIZE))));
		}
		
		leftMouseButtonDown = Mouse.isButtonDown(0);
		
		//Keyboard input
		while (Keyboard.next()) {
			if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT && Keyboard.getEventKeyState()) {
				Clock.ChangeMultiplier(0.07f);
			} else if (Keyboard.getEventKey() == Keyboard.KEY_LEFT && Keyboard.getEventKeyState()) {
				Clock.ChangeMultiplier(-0.07f);
			} else if (Keyboard.getEventKey() == Keyboard.KEY_T && Keyboard.getEventKeyState()) {
				System.out.println("Why would someone press T?");
			}
		}
	}


}
