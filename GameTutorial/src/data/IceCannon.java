package data;

import static helpers.Artist.QuickLoad;
import static helpers.Artist.TILE_SIZE;

import java.util.ArrayList;

public class IceCannon extends Tower{

	private TowerType type;
	
	public IceCannon(TowerType type, Tile startTile, ArrayList<Enemy> enemies) {
		super(type, startTile, enemies);
		this.type = type;
	}
	
	@Override
	public void fire() {
		super.resetTSLS();
		super.getProjectileList().add(new IceSpray(type.projectileType, (super.getX() + (TILE_SIZE / 2) - (TILE_SIZE / 4)), (super.getY() + (TILE_SIZE / 2) - (TILE_SIZE / 4)), super.getTarget(), super.getEnemyList()));
	}
	
}
