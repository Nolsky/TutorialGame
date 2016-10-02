package data;

import org.newdawn.slick.opengl.Texture;
import static helpers.Artist.*;

public enum TowerType {

	CannonRed(new Texture[] {QuickLoad("cannonBase"), QuickLoad("cannonGun")}, 10, 300, 3, 500, ProjectileType.BasicBullet), 
	CannonBlue(new Texture[] {QuickLoad("cannonBaseBlue"), QuickLoad("cannonGunBlue")}, 30, 500, 5, 300, ProjectileType.BasicBullet),
	IceCannon(new Texture[] {QuickLoad("iceTowerBase"), QuickLoad("iceTowerGun")}, 1, 128, (1 / 4), 64, ProjectileType.IceSpray);
	
	Texture[] textures;
	int damage, range, width, height;
	float  fireRate, projectileSpeed;
	ProjectileType projectileType;
	
	TowerType(Texture[] textures, int damage, int range, float fireRate, float projectileSpeed, ProjectileType projectileType) {
		this.textures = textures;
		this.damage = damage;
		this.range = range;
		this.fireRate = fireRate;
		this.projectileSpeed = projectileSpeed;
		this.projectileType = projectileType;
	}
}
