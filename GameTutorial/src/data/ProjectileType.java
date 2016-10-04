package data;

import org.newdawn.slick.opengl.Texture;
import static helpers.Artist.*;

public enum ProjectileType {

	BasicBullet(QuickLoad("bullet"), 10, 7, 100),
	IceSpray(QuickLoad("frostProjectile"), 1, 3, 300),
	FrostSpray(QuickLoad("frostierProjectile"), 1, 3, 300);
	
	Texture texture;
	int projectileDamage, projectileRange, width, height;
	float  projectileSpeed;
	
	
	ProjectileType(Texture texture, int projectileDamage, int projectileRange, float projectileSpeed) {
		this.texture = texture;
		this.projectileDamage = projectileDamage;
		this.projectileRange = projectileRange;
		this.projectileSpeed = projectileSpeed;
		
	}
	
	
}