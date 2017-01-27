package edu.ap.rest;

import org.json.JSONObject;
import org.restlet.resource.ClientResource;

public class MedicijnClient {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			ClientResource resource = new ClientResource("http://localhost:8181/apotheek/medicijnen");
			JSONObject medicijn1 = new JSONObject();
			medicijn1.put("Naam", "DAFALGAN");
			medicijn1.put("Vervaldatum", "2020/01/01");
			medicijn1.put("Producent", "FARMACEUTICA");
			medicijn1.put("Hoeveelheid", "20");
			resource.post(medicijn1.toString());
			System.out.println(resource.getResponseEntity().getText());
			
			JSONObject medicijn2 = new JSONObject();
			medicijn2.put("Naam", "PARACETAMOL");
			medicijn2.put("Vervaldatum", "2020/01/01");
			medicijn2.put("Producent", "FARMACEUTICA");
			medicijn2.put("Hoeveelheid", "20");
			resource.post(medicijn2.toString());
			System.out.println(resource.getResponseEntity().getText());
			
			ClientResource resource2 = new ClientResource("http://localhost:8181/apotheek/medicijn/DAFALGAN");
			System.out.println(resource2.get());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR in MEDICIJNCLIENT: " + e.getMessage());
		}
		

	}

}
