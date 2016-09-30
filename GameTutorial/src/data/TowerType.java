package data;

import org.newdawn.slick.opengl.Texture;
import static helpers.Artist.*;

public enum TowerType {

	CannonRed(new Texture[] {QuickLoad("cannonBase"), QuickLoad("cannonGun")}, 10, 300, 3, 50), 
	CannonBlue(new Texture[] {QuickLoad("cannonBaseBlue"), QuickLoad("cannonGunBlue")}, 30, 500, 5, 80);
	
	
	Texture[] textures;
	int damage, range, width, height;
	float  fireRate, projectileSpeed;
	
	
	TowerType(Texture[] textures, int damage, int range, float fireRate, float projectileSpeed) {
		this.textures = textures;
		this.damage = damage;
		this.range = range;
		this.fireRate = fireRate;
		this.projectileSpeed = projectileSpeed;
		
	}
}
