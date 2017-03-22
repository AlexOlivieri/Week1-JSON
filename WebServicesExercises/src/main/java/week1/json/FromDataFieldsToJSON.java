package week1.json;

import java.util.ArrayList;
import java.util.List;

public class FromDataFieldsToJSON {
	
	private static String name;
	private static String surname;
	private static List<String> hobbies;
	
	private static final String key1 = "name";
	private static final String key2 = "surname";
	private static final String key3 = "hobbies";
	
	public static void main(String[] args) {
		
		//TODO Replace with your Information
		name = "Alex";
		surname = "Olivieri";
		
		hobbies =  new ArrayList<String>();
		hobbies.add("reading");
		hobbies.add("surfing");
		/////////////////////////////////////
		
		// TODO Create the correct JSON object
		// It should print the String showed in slide 8 point 3
		JSONObject mainObject;
		
		System.out.println(mainObject.toString());
	}

}
