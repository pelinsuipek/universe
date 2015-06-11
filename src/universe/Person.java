package universe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import universe.event.DeathEvent;
import universe.event.DeathListener;
import universe.event.ThirstEvent;
import universe.event.ThirstListener;

public class Person implements Ageable, ThirstListener, DeathListener{
	
	private static final long serialVersionUID = 1L;
	
	private static final long MAX_AGE = 70 ;
	private long age = 0;
	private String name = "unnamed";
	private Random random = new Random();
	private boolean alive = true;
	
	private List<DeathListener> friends = new ArrayList<>();
	
	public Person(){}
	
	public Person(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAge() {
		return age;
	}

	@Override
	public void tick() {
		if(!isDead()){
			age++;
			System.out.println(getName()+": I am getting older...");
			if(random.nextFloat()<getDeathProbability()){
				die();
			}
		}
	}
	
	private double getDeathProbability(){
		double prob = Math.pow(age/(float)MAX_AGE,2);
		return prob;
	}
	
	public void waterTree(Waterable t){
		if(!isDead()){
			System.out.println(getName()+": I'm gonna water that tree.");
			t.absorbWater();			
		}
	}

	@Override
	public boolean isDead() {
		return !alive;
	}

	@Override
	public void thirsted(ThirstEvent event) {
		Waterable source = (Waterable)event.getSource();
		waterTree(source);
	}

	@Override
	public void dead(DeathEvent event) {
		if(!isDead()){
			Person source = (Person)event.getSource();
			System.out.println(getName()+": I am mourning for "+source.getName()+" who died at the early age of "+source.getAge());			
		}
		
	}
	
	public void die(){
		System.out.println(getName()+" ("+getAge()+"): Goodbye, cruel world!");
		alive = false;
		DeathEvent event = new DeathEvent(this);
		for (DeathListener friend : friends) {
			friend.dead(event);
		}
	}
	
	public void addFriend(DeathListener listener){
		friends.add(listener);
	}
	public void removeFriend(DeathListener listener){
		friends.remove(listener);
	}
	

}
