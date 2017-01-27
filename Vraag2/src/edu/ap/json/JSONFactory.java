package edu.ap.json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONFactory {
	private static final String FILENAME = "C:/Users/HP/Desktop/medicijnen.json";
	
	public static String getMedicijn(String naammedicijn) {
		String gevondenMedicijn = "";
		try {
			FileReader reader = new FileReader(FILENAME);
			JSONParser parser = new JSONParser();
			JSONObject jsonObject = (JSONObject)parser.parse(reader);
			Iterator<?> keys = jsonObject.keys();
			while(keys.hasNext()){
			
			String naam = (String) jsonObject.get("Naam");
			String vervaldatum = (String) jsonObject.get("Vervaldatum");
			String producent = (String) jsonObject.get("Producent");
			String hoeveelheid = (String) jsonObject.get("Hoeveelheid");
			
			
			if (naam.equals(naammedicijn)) {
				gevondenMedicijn+= "GEVONDEN MEDICIJN MET DE NAAM " + naammedicijn + "\n";
				gevondenMedicijn += naam + "\nVervaldatum: " + vervaldatum + "\nProducent: "+producent + "\nHoeveelheid: " + hoeveelheid;
			}
			else{
				gevondenMedicijn += "GEEN MEDICIJNEN GEVONDEN MET DE NAAM" + naammedicijn;
			}
			keys.next();
			}
			

	
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR in JSONFACTORY: " + e.getMessage());
		}
		
		return gevondenMedicijn;
		
	}
	
	public static String allMedicijnen(){
		String medicijnen = "";
		BufferedReader br = null;
		try {
			String line;
			br = new BufferedReader(new FileReader(FILENAME));
			while((line=br.readLine())!=null){
				medicijnen+=line + "\n";
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR in AllMedicijnen van JSONFACTORY: " + e.getMessage());
		}
		
		return medicijnen;

	}
}
