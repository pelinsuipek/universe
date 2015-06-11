package universe;

import java.util.Random;

public class Main {
	
	
	private static Random random = new Random();

	public static void main(String[] args) {
		Universe universe = new Universe();
		Tree tree1 = new Tree();
		Tree tree2 = new Tree();
		Person person = new Person(getRandomName());
		tree1.addThirstListener(person);
		Person person2 = new Person(getRandomName());
		Person person3 = new Person(getRandomName());
		Person person4 = new Person(getRandomName());
		Person person5 = new Person(getRandomName());
		
		person.addFriend(person2);
		person.addFriend(person3);
		person.addFriend(person4);
		
		person4.addFriend(person5);
		universe.addObject(tree1);
		universe.addObject(tree2);
		universe.addObject(person);
		universe.addObject(person2);
		universe.addObject(person3);
		universe.addObject(person4);
		universe.addObject(person5);
		
		while(true){
			universe.tick();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static String getRandomName(){
		return names[random.nextInt(names.length)];
	}
	private static String[] names = {"Sharlene Dean",
		"Charles Moody",
		"Allie Dotson",
		"Mendoza Mccarty",
		"Autumn Luna",
		"Parker Osborn",
		"Gail Carr",
		"Franks Davis",
		"Guthrie Wise",
		"Oneil Cox",
		"Hensley Sims",
		"Gladys Sanford",
		"Elsie Newton",
		"Gay Collins",
		"Rosemarie Townsend",
		"Burke Bernard",
		"Nona Crawford",
		"Whitney Carrillo",
		"Myra Jefferson",
		"Maricela Roy",
		"Liza Blair",
		"Alexandra Ruiz",
		"Winnie Mays",
		"Rowe Franklin",
		"Heidi Grimes",
		"Althea Mckenzie",
		"Fulton Head",
		"Haley Carroll",
		"Ryan Conley",
		"Arnold Golden",
		"Lynette Campos",
		"Pena Contreras",
		"Bean Wong",
		"Francis Ballard",
		"Case Dillon",
		"Madden Mayo",
		"Rodgers Hyde",
		"Marina Price",
		"Lola Stewart",
		"Griffith Boyd",
		"Diaz Day",
		"Lloyd Briggs",
		"Gonzalez Moss",
		"Mcclain Spears",
		"Corine Nelson",
		"Cohen Hutchinson",
		"Saunders Mullins",
		"Robyn Mcgee",
		"Rose Mcpherson",
		"Ida Aguirre",
		"Wood Talley",
		"Deana Livingston",
		"Audrey Mcfadden",
		"Huffman Crane",
		"Mitzi Coffey",
		"Gretchen English",
		"Anna Bishop",
		"Horn Padilla",
		"Bianca Castillo",
		"Massey Howell",
		"Conner Michael",
		"Alta Hudson",
		"Danielle Dominguez",
		"Black Fleming",
		"Benjamin Robles",
		"Emerson Wright",
		"Jewel Owens",
		"Virginia Workman",
		"Humphrey Rhodes",
		"Rene Rich",
		"Cheri Salazar",
		"Hull Love",
		"Sheree Abbott",
		"Barnett Mack",
		"Albert Dennis",
		"Blanche Serrano",
		"Wade Cherry",
		"Lisa Pope",
		"Joyce Sykes",
		"Sosa Reilly",
		"Reva Vincent",
		"Hunter Eaton",
		"Kitty Cole",
		"Elsa Ramos",
		"Eddie Salinas",
		"Castillo Ellison",
		"Browning Cantrell",
		"Benson Mercer",
		"Garcia Maddox",
		"Beth Garcia",
		"Stacey Carey",
		"Sweet Noble",
		"Vicky Baird",
		"Lenora Buckley",
		"Walton Britt",
		"Guerrero Macias",
		"Wise Sparks",
		"Dennis Harrell",
		"Strickland Bryan",
		"Earlene Buchanan"};
}
