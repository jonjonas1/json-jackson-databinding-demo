package com.jackson.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Runner {

	public static void main(String[] args) {
		
		try {
			
			//create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON file and map/convert to Java POJO:
			// data/sample-lite.json
			Student st = mapper.readValue(new File("data/sample-lite.json"), Student.class);
			// print first/last name
			System.out.println("First name: " +st.getFirstName() );
			System.out.println("Last name: " +st.getLastName());
			
			Student st1 = mapper.readValue(new File("data/sample-full.json"), Student.class);
			System.out.println("First name: " +st1.getFirstName() );
			System.out.println("Last name: " +st1.getLastName());
			
			// print out address street and city
			Address ad = st1.getAddress();
			System.out.println("Street is: "+ad.getStreet());
			System.out.println("City is: "+ad.getCity());
			
			//print out languages
			for(String lang : st1.getLanguages()) {
				System.out.println(lang);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
