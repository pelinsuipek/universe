package universe;

import java.io.Serializable;

public interface Ageable extends Serializable{
	
	public void tick();
	public boolean isDead();

}
