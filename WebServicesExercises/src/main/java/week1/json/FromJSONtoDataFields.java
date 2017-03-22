package week1.json;

import java.util.ArrayList;
import java.util.List;

public class FromJSONtoDataFields {
	
	private static final String information = "{\"hobbies\":[\"reading\",\"surfing\"],\"surname\":\"Olivieri\",\"name\":\"Alex\"}";
	
	private static String name;
	private static String surname;
	private static List<String> hobbies;
	
	private static final String key1 = "name";
	private static final String key2 = "surname";
	private static final String key3 = "hobbies";
	
	public static void main(String[] args) {
		
		JSONObject mainObject;
		
		//TODO create a JSON object which contains the information field and then initialize all other fields
		// with the right information

		
		// In the console it should print the following
		// Alex
		// Olivieri
		// reading
		// surfing
		System.out.println(name);
		System.out.println(surname);
		for(String a : hobbies){
			System.out.println(a);
		}
		
	}

}
