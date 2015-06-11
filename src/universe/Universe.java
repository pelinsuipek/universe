package universe;

public class Universe implements Ageable{
	
	private static final long serialVersionUID = 1L;
	
	Ageable[] objects = new Ageable[10];
	int objectCount = 0;
	
	public void addObject(Ageable a){
		objects[objectCount] = a;
		objectCount++;
	}

	@Override
	public void tick() {
		System.out.println("Universe: A new day unfolds for my mortal creatures...");
		for (int i = 0; i < objectCount; i++) {
			Ageable a = objects[i];
			a.tick();
		}
		System.out.println("Universe: Yet another day flew by...\n");
		
	}

	@Override
	public boolean isDead() {
		return false;
	}
	
	

}
