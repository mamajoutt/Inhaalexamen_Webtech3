package edu.ap.rest;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import edu.ap.json.JSONFactory;

public class MedicijnResource extends ServerResource {
	@Get("txt")
	public String getMedicijn(){
		return JSONFactory.getMedicijn(getAttribute("medicijn_naam"));
	}

}
