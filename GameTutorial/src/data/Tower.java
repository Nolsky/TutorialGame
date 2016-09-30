package data;

import org.newdawn.slick.opengl.Texture;
import static helpers.Artist.*;

public abstract class Tower implements Entity {
	private float x, y, tSLS, fireRate, projectileSpeed, angle;
	private int width, height, damage;
	private Enemy target;
	
//	private Texture baseTexture, cannonTexture; /*MY GUESS*/
	private Texture[] textures; /*IN-VID*/
	
	private TowerType type;
	
	public Tower(TowerType type, Tile startTile) {
		this.type = type;
		this.textures = type.textures; /*IN-VID*/
//		this.baseTexture = type.textures[0]; /*MY GUESS*/
//		this.cannonTexture =  type.textures[1]; /*MY GUESS*/
		this.damage = type.damage;
		this.fireRate = type.fireRate;
		this.projectileSpeed = type.projectileSpeed;
		this.x = startTile.getX();
		this.y = startTile.getY();
		this.width = startTile.getWidth();
		this.height = startTile.getHeight();
		this.tSLS = 0;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		for(int i = 0; i < textures.length; i++) {
			DrawQuadTextRotate(textures[i], x, y, width, height, 0);
		}
	}

	public void update() {
		
	}

}
