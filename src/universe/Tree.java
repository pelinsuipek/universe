package universe;

import java.util.ArrayList;
import java.util.List;

import universe.event.ThirstEvent;
import universe.event.ThirstListener;

public class Tree implements Ageable, Waterable {

	private static final long serialVersionUID = 1L;
	private double height = 0;
	private double thirst = 0;

	private List<ThirstListener> thirstListeners = new ArrayList<>();
	
	@Override
	public void tick() {
		if (thirst < 0.7) {
			height += 0.2;
			System.out.println("Tree: I am growing...");
		}
		if (thirst < 1) {
			thirst += 0.1;
		}else{
			System.out.println("Tree: I am thirsty...");
			thirsted();
		}
	}
	
	private void thirsted(){
		ThirstEvent thirstEvent = new ThirstEvent(this);
		for (ThirstListener thirstListener : thirstListeners) {
			thirstListener.thirsted(thirstEvent);
		}
	}

	@Override
	public void absorbWater() {
		thirst = 0;
		System.out.println("Tree: I feel refreshed.");
		
	}
	
	public double getHeight() {
		return height;
	}
	
	public boolean isDead(){
		return false;
	}
	
	public void addThirstListener(ThirstListener listener){
		thirstListeners.add(listener);
	}
	public void removeThirstListener(ThirstListener listener){
		thirstListeners.remove(listener);
	}
	
	

}
