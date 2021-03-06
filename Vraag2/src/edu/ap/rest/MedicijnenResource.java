package edu.ap.rest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import edu.ap.json.JSONFactory;

public class MedicijnenResource extends ServerResource {
	private static final String FILENAME = "C:/Users/HP/Desktop/medicijnen.json";
	
	@Get("txt")
	public String getMedicijnen() {
		return JSONFactory.allMedicijnen();
	}
	
	@Post("txt")
	public void addMedicijn(String json) throws JSONException {
		JSONObject medicijn = new JSONObject(json);
		medicijn.getString("Naam");
		medicijn.getString("Vervaldatum");
		medicijn.getString("Producent");
		medicijn.getString("Hoeveelheid");
				
		try {
			File file=new File(FILENAME);
			FileWriter fw=new FileWriter(file,true);
			BufferedWriter bf=new BufferedWriter(fw);
			PrintWriter pr=new PrintWriter(bf);
			pr.print(medicijn.toString());
			pr.close();
		} catch (Exception e) {
			System.out.println("ERROR in Medicijnenresource: " + e.getMessage());
		}
		
		
	
		
	}
}
