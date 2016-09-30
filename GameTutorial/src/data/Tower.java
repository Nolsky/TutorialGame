package data;

import org.newdawn.slick.opengl.Texture;

public abstract class Tower implements Entity {
	private float x, y;
	private int width, height, damage;
	private Enemy target;
	private Texture baseTexture, cannonTexture;
	
	public Tower( Texture baseTexture, Texture cannonTexture, float x, float y, int width, int height) {
		this.baseTexture = baseTexture;
		this.cannonTexture = cannonTexture;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		
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
		
	}

	public void update() {
		
	}

}
